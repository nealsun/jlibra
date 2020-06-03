package dev.jlibra.client.views.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import dev.jlibra.client.views.Amount;
import org.immutables.value.Value;


@Value.Immutable
@JsonDeserialize(as = ImmutableMintEventData.class)
public interface MintEventData extends EventData {
    @JsonProperty("amount")
    Amount amount();
}
