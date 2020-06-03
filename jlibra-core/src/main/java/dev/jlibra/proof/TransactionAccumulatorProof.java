package dev.jlibra.proof;

import dev.jlibra.serialization.Deserialization;
import dev.jlibra.serialization.lcs.LCS;
import dev.jlibra.type.HashValue;
import org.immutables.value.Value;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Value.Immutable
@LCS.Structure
public interface TransactionAccumulatorProof {

    @LCS.Field(0)
    List<HashValue> siblings();

    static TransactionAccumulatorProof deserializer(InputStream inputStream) throws IOException {
        ImmutableTransactionAccumulatorProof.Builder builder = ImmutableTransactionAccumulatorProof.builder();
        long size = Deserialization.readLength(inputStream);
        for (int i = 0; i < size; i ++) {
            HashValue hashValue = HashValue.deserializer(inputStream);
            builder.addSiblings(hashValue);
        }
        return builder.build();
    }
}
