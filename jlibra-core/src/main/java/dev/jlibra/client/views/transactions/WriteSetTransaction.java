package dev.jlibra.client.views.transactions;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableWriteSetTransaction.class)
public interface WriteSetTransaction extends TransactionData {
}
