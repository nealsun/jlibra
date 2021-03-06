package dev.jlibra.serialization.lcs;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.hamcrest.Matchers;
import org.junit.Test;

import dev.jlibra.AccountAddress;
import dev.jlibra.serialization.ByteArray;
import dev.jlibra.serialization.ByteSequence;
import dev.jlibra.transaction.ImmutableScript;
import dev.jlibra.transaction.ImmutableTransaction;
import dev.jlibra.transaction.LbrTypeTag;
import dev.jlibra.transaction.Transaction;
import dev.jlibra.transaction.argument.AccountAddressArgument;

public class LCSSerializerTest {

    @Test
    public void serializeTransaction() {
        Transaction transaction = ImmutableTransaction.builder()
                .expirationTime(1L)
                .gasUnitPrice(1)
                .maxGasAmount(2)
                .gasCurrencyCode("LBR")
                .payload(ImmutableScript.builder()
                        .addAllTypeArguments(Arrays.asList(new LbrTypeTag()))
                        .code(
                                ByteArray.from("00"))
                        .arguments(
                                asList(new AccountAddressArgument(AccountAddress.fromByteArray(ByteArray.from(
                                        "8f5fbb9486acc5fb90f1a6be43a0013d4a7f7f06e3d5fe995be1e9b272c09b5d")))))
                        .build())
                .senderAccount(AccountAddress.fromByteArray(
                        ByteArray
                                .from("4e03aec69589026b4a095c9cd2e53ca6")))
                .sequenceNumber(3)
                .build();

        ByteSequence bytes = LCSSerializer.create().serialize(transaction, Transaction.class);

        assertThat(bytes.toString(), Matchers.is(
                "4e03aec69589026b4a095c9cd2e53ca60300000000000000020100010700000000000000000000000000000000034c425201540001038f5fbb9486acc5fb90f1a6be43a0013d4a7f7f06e3d5fe995be1e9b272c09b5d02000000000000000100000000000000034c42520100000000000000"));

    }

}
