package dev.jlibra.client.views.transactions;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableUnknownTransaction.class)
public interface UnknownTransaction extends TransactionData {
}
