package dev.jlibra.transaction;

public class LbrTypeTag implements StructTypeTag {

    @Override
    public StructTag structTag() {
        return new LbrStructTag();
    }
}
