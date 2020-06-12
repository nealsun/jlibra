package dev.jlibra.transaction;

import dev.jlibra.AccountAddress;
import dev.jlibra.serialization.lcs.LCS;

import java.util.ArrayList;
import java.util.List;

public class AccountStructTag implements StructTag {

    public AccountAddress getAddress() {
        return AccountAddress.fromHexString("00000000000000000000000000000000");
    }

    public String getModule() {
        return "LibraAccount";
    }

    public String getName() {
        return "T";
    }

    public List<TypeTag> getTypeParams() {
        return new ArrayList<>();
    }
}
