package dev.jlibra.transaction;

import dev.jlibra.serialization.lcs.LCS.ExternallyTaggedEnumeration;

@ExternallyTaggedEnumeration(classes = { NotImplemented.class, Module.class, Script.class })
public interface TransactionPayload {

}
