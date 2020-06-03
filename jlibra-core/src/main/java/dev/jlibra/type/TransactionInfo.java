package dev.jlibra.type;

import dev.jlibra.serialization.Deserialization;
import dev.jlibra.serialization.lcs.LCS;
import org.immutables.value.Value;

import java.io.IOException;
import java.io.InputStream;

@Value.Immutable
@LCS.Structure
public interface TransactionInfo {

    @LCS.Field(0)
    HashValue transactionHash();

    @LCS.Field(1)
    HashValue stateRootHash();

    @LCS.Field(2)
    HashValue eventRootHash();

    @LCS.Field(3)
    long gasUsed();

    @LCS.Field(4)
    long majorStatus();

    static TransactionInfo deserializer(InputStream inputStream) throws IOException {
        ImmutableTransactionInfo.Builder builder = ImmutableTransactionInfo.builder();
        builder.transactionHash(HashValue.deserializer(inputStream));
        builder.stateRootHash(HashValue.deserializer(inputStream));
        builder.eventRootHash(HashValue.deserializer(inputStream));
        builder.gasUsed(Deserialization.readLong(inputStream, 8));
        builder.majorStatus(Deserialization.readLong(inputStream, 8));
        return builder.build();
    }
}
