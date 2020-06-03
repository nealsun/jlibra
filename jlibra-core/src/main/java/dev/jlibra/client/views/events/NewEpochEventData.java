package dev.jlibra.client.views.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableNewEpochEventData.class)
public interface NewEpochEventData extends EventData {

    @JsonProperty("epoch")
    Long epoch();
}