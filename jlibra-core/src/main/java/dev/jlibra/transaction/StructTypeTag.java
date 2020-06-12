package dev.jlibra.transaction;

import dev.jlibra.serialization.lcs.LCS;

public interface StructTypeTag extends TypeTag{
    @LCS.Field(value = 0)
    public StructTag structTag();
}
