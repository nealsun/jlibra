package dev.jlibra.type;

import dev.jlibra.serialization.ByteSequence;
import dev.jlibra.serialization.Deserialization;
import dev.jlibra.serialization.lcs.LCS;
import org.immutables.value.Value;

import java.io.IOException;
import java.io.InputStream;

@Value.Immutable
@LCS.Structure
public interface HashValue {
    @LCS.Field(value = 0)
    ByteSequence hash();

    static HashValue deserializer(InputStream inputStream) throws IOException {
        ImmutableHashValue.Builder builder = ImmutableHashValue.builder();
        long size = Deserialization.readLength(inputStream);
        builder.hash(Deserialization.readByteArray(inputStream, (int)size));
        return builder.build();
    }
}
