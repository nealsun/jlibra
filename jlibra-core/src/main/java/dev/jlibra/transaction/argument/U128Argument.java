package dev.jlibra.transaction.argument;

import dev.jlibra.serialization.lcs.LCS;

public class U128Argument implements TransactionArgument {
    private long value;

    public U128Argument(long value) {
        this.value = value;
    }

    @LCS.Field(0)
    public long getValue() {
        return value;
    }
}
