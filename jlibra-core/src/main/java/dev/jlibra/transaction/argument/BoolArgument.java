package dev.jlibra.transaction.argument;

import dev.jlibra.serialization.lcs.LCS;

public class BoolArgument implements TransactionArgument {
    private boolean value;

    public BoolArgument(boolean value) {
        this.value = value;
    }

    @LCS.Field(0)
    public boolean getValue() {
        return value;
    }
}
