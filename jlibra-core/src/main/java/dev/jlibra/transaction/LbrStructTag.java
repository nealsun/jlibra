package dev.jlibra.transaction;

import dev.jlibra.AccountAddress;

import java.util.ArrayList;
import java.util.List;

public class LbrStructTag implements Struct {

    @Override
    public AccountAddress address() {
        return AccountAddress.fromHexString("00000000000000000000000000000000");
    }

    @Override
    public String module() {
        return "LBR";
    }

    @Override
    public String name() {
        return "T";
    }

    @Override
    public List<TypeTag> getTypeParams() {
        return new ArrayList<>();
    }
}
