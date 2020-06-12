package dev.jlibra.transaction;

import dev.jlibra.serialization.lcs.LCS;

public class AccountTypeTag implements StructTypeTag {

    @LCS.Field(value = 0)
    public StructTag structTag() {
        return new AccountStructTag();
    }

}
