package dev.jlibra.transaction;

import dev.jlibra.serialization.lcs.LCS.ExternallyTaggedEnumeration;

@ExternallyTaggedEnumeration(classes = { NotImplemented.class, Script.class, Module.class })
public interface TransactionPayload {

}
