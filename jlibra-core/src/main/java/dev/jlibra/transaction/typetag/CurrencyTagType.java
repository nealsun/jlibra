package dev.jlibra.transaction.typetag;

import dev.jlibra.AccountAddress;
import dev.jlibra.transaction.StructTag;
import dev.jlibra.transaction.StructTypeTag;
import dev.jlibra.transaction.TypeTag;

import java.util.ArrayList;
import java.util.List;

public class CurrencyTagType implements StructTypeTag {

    private StructTag structTag;

    public CurrencyTagType(String currency) {
        this.structTag = new StructTag() {
            @Override
            public AccountAddress getAddress() {
                return AccountAddress.fromHexString("00000000000000000000000000000000");
            }

            @Override
            public String getModule() {
                return currency;
            }

            @Override
            public String getName() {
                return "T";
            }

            @Override
            public List<TypeTag> getTypeParams() {
                return new ArrayList<>();
            }
        };
    }
    @Override
    public StructTag structTag() {
        return structTag;
    }
}
