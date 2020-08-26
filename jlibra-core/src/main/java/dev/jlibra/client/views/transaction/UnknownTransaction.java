package dev.jlibra.client.views.transaction;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableUnknownTransaction.class)
public interface UnknownTransaction extends TransactionData {
}
