package dev.jlibra.type;

import dev.jlibra.AccountAddress;
import dev.jlibra.Hash;
import dev.jlibra.serialization.ByteArray;
import dev.jlibra.serialization.ByteSequence;
import dev.jlibra.serialization.lcs.LCS;
import dev.jlibra.serialization.lcs.LCSSerializer;
import dev.jlibra.transaction.StructTag;
import org.bouncycastle.jcajce.provider.digest.SHA3;
import org.immutables.value.Value;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Value.Immutable
@LCS.Structure
public interface ResourceKey {
    @LCS.Field(value = 0, fixedLength = true)
    AccountAddress address();

    @LCS.Field(1)
    StructTag type();

    static ByteArray accessBytes(ResourceKey resourceKey) {
        byte[] tag = {Constants.RESOURCE_TAG};
        ByteArray resourceBytes = LCSSerializer.create().serialize(resourceKey.type(), StructTag.class);
        byte[] hash = Hash.ofInput(resourceBytes).hash(ByteArray.from("LIBRA::StructTag".getBytes())).toArray();
        byte[] newBytes = new byte[tag.length + hash.length];
        System.arraycopy(tag, 0, newBytes, 0, tag.length);
        System.arraycopy(hash, 0, newBytes, tag.length, hash.length);
        return ByteArray.from(newBytes);
    }
}