package dev.jlibra.client.views.scripts;

import org.immutables.value.Value;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Value.Immutable
@JsonDeserialize(as = ImmutableUnknownTransactionScript.class)
public interface UnknownTransactionScript extends Script {

}
