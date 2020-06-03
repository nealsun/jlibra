package dev.jlibra.client.views.scripts;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import dev.jlibra.client.views.Amount;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableMintTransactionScript.class)
public interface MintTransactionScript extends Script {
    @JsonProperty("amount")
    Amount amount();

    @JsonProperty("auth_key_prefix")
    String authKeyPrefix();

    @JsonProperty("receiver")
    String receiver();
}
