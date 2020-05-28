package dev.jlibra.transaction;

import dev.jlibra.serialization.ByteSequence;
import dev.jlibra.serialization.lcs.LCS;
import org.immutables.value.Value;

@Value.Immutable
public interface Module extends TransactionPayload {
    @LCS.Field(0)
    ByteSequence getCode();
}