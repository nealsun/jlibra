package dev.jlibra.client.views.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import dev.jlibra.client.views.Amount;
import org.immutables.value.Value;


@Value.Immutable
@JsonDeserialize(as = ImmutablePreBurnEventData.class)
public interface PreBurnEventData extends EventData {
    @JsonProperty("amount")
    Amount amount();

    @JsonProperty("preburn_address")
    String receiver();
}
