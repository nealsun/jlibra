package dev.jlibra.transaction.typetag;

import dev.jlibra.AccountAddress;
import dev.jlibra.transaction.Struct;
import dev.jlibra.transaction.TypeTag;

import java.util.ArrayList;
import java.util.List;

public class CurrencyTagType implements Struct {
    String currency;

    public CurrencyTagType(String currency) {
        this.currency = currency;
    }

    @Override
    public AccountAddress address() {
        return AccountAddress.fromHexString("00000000000000000000000000000000");
    }

    @Override
    public String module() {
        return currency;
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
