package dev.jlibra.type;

import dev.jlibra.serialization.Deserialization;
import dev.jlibra.serialization.lcs.LCS;
import org.immutables.value.Value;

import java.io.IOException;
import java.io.InputStream;

@Value.Immutable
@LCS.Structure
public interface SparseMerkleLeafNode {
    @LCS.Field(0)
    HashValue key();

    @LCS.Field(1)
    HashValue valueHash();

    static SparseMerkleLeafNode deserializer(InputStream inputStream) throws IOException {
        if (Deserialization.readBoolean(inputStream)) {
            ImmutableSparseMerkleLeafNode.Builder builder = ImmutableSparseMerkleLeafNode.builder();
            builder.key(HashValue.deserializer(inputStream));
            builder.valueHash(HashValue.deserializer(inputStream));
            return builder.build();
        } else {
            return null;
        }
    }
}
