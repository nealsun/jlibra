package dev.jlibra.transaction;

import dev.jlibra.AccountAddress;
import dev.jlibra.serialization.lcs.LCS;
import org.immutables.value.Value;

import java.util.List;

@LCS.Structure
@Value.Immutable
public interface StructTag {
    @LCS.Field(value = 0, fixedLength = true)
    public AccountAddress getAddress();

    @LCS.Field(value = 1)
    public String getModule();

    @LCS.Field(value = 2)
    public String getName();

    @LCS.Field(value = 3)
    public List<TypeTag> getTypeParams();
}
