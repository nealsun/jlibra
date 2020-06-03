package dev.jlibra.proof;

import dev.jlibra.serialization.Deserialization;
import dev.jlibra.serialization.lcs.LCS;
import dev.jlibra.type.HashValue;
import dev.jlibra.type.SparseMerkleLeafNode;
import org.immutables.value.Value;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Value.Immutable
@LCS.Structure
public interface SparseMerkleProof {
    @LCS.Field(value = 0)
    SparseMerkleLeafNode leaf();

    @LCS.Field(1)
    List<HashValue> siblings();

    static SparseMerkleProof deserializer(InputStream inputStream) throws IOException {
        ImmutableSparseMerkleProof.Builder builder = ImmutableSparseMerkleProof.builder();
        builder.leaf(SparseMerkleLeafNode.deserializer(inputStream));
        long size = Deserialization.readLength(inputStream);
        for (int i = 0; i < size; i ++) {
            HashValue hashValue = HashValue.deserializer(inputStream);
            builder.addSiblings(hashValue);
        }
        return builder.build();
    }
}
