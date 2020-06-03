package dev.jlibra.transaction;

import dev.jlibra.AccountAddress;
import dev.jlibra.serialization.lcs.LCS;

import java.util.ArrayList;
import java.util.List;

public class AccountTypeTag implements TypeTag {

    @LCS.Field(value = 0, fixedLength = true)
    public AccountAddress getAddress() {
        return AccountAddress.fromHexString("00000000000000000000000000000000");
    }

    @LCS.Field(value = 1)
    public String getModule() {
        return "LibraAccount";
    }

    @LCS.Field(value = 2)
    public String getName() {
        return "T";
    }

    @LCS.Field(value = 3)
    public List<?> getTypeParams() {
        return new ArrayList<>();
    }
}
