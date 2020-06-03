package dev.jlibra.client.views;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableAccountStateProofView.class)
public interface AccountStateProofView {
    @JsonProperty("ledger_info_to_transaction_info_proof")
    String ledgerInfoToTransactionInfoProof();

    @JsonProperty("transaction_info")
    String transactionInfo();

    @JsonProperty("transaction_info_to_account_proof")
    String transactionInfoToAccountProof();
}
