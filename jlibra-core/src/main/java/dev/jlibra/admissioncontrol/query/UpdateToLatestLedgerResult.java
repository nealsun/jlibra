package dev.jlibra.admissioncontrol.query;

import java.util.ArrayList;
import java.util.List;

import org.immutables.value.Value;

import types.GetWithProof.ResponseItem;
import types.GetWithProof.UpdateToLatestLedgerResponse;

@Value.Immutable
public abstract class UpdateToLatestLedgerResult {

    public abstract List<AccountResource> getAccountResources();

    public abstract List<TransactionWithProof> getAccountTransactionsBySequenceNumber();

    public static UpdateToLatestLedgerResult fromGrpcObject(UpdateToLatestLedgerResponse grpcObject) {
        List<AccountResource> accountStates = new ArrayList<>();
        List<TransactionWithProof> accountTransactionsBySequenceNumber = new ArrayList<>();

        for (ResponseItem item : grpcObject.getResponseItemsList()) {
            accountStates.addAll(AccountResource.deserializeAccountState(
                    item.getGetAccountStateResponse().getAccountStateWithProof().getBlob().getBlob().toByteArray()));
            accountTransactionsBySequenceNumber
                    .add(TransactionWithProof.deserialize(
                            item.getGetAccountTransactionBySequenceNumberResponse().getTransactionWithProof()));
        }

        return ImmutableUpdateToLatestLedgerResult.builder()
                .accountResources(accountStates)
                .accountTransactionsBySequenceNumber(accountTransactionsBySequenceNumber)
                .build();
    }
}
