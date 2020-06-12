package dev.jlibra.type;

import dev.jlibra.AccountAddress;
import dev.jlibra.serialization.ByteArray;
import dev.jlibra.serialization.lcs.LCS;
import org.immutables.value.Value;

@Value.Immutable
@LCS.Structure
public interface AccessPath {
    @LCS.Field(value = 0, fixedLength = true)
    AccountAddress address();

    @LCS.Field(value = 1)
    ByteArray path();
}
