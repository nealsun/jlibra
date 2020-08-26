package dev.jlibra.type;

import dev.jlibra.AccountAddress;
import dev.jlibra.Hash;
import dev.jlibra.serialization.ByteArray;
import dev.jlibra.serialization.lcs.LCS;
import dev.jlibra.serialization.lcs.LCSSerializer;
import org.immutables.value.Value;

@Value.Immutable
@LCS.Structure
public interface ModuleId {
    @LCS.Field(value = 0, fixedLength = true)
    AccountAddress address();

    @LCS.Field(1)
    String name();

    static ByteArray accessBytes(ModuleId moduleId) {
        byte[] tag = {Constants.CODE_TAG};
        ByteArray moduleBytes = LCSSerializer.create().serialize(moduleId, ModuleId.class);
        byte[] hash = Hash.ofInput(moduleBytes).hash(ByteArray.from("LIBRA::ModuleId".getBytes())).toArray();
        byte[] newBytes = new byte[tag.length + hash.length];
        System.arraycopy(tag, 0, newBytes, 0, tag.length);
        System.arraycopy(hash, 0, newBytes, tag.length, hash.length);
        return ByteArray.from(newBytes);
    }
}
