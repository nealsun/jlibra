package dev.jlibra.client.views.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableNewBlockEventData.class)
public interface NewBlockEventData extends EventData {

    @JsonProperty("proposed_time")
    Long proposedTime();

    @JsonProperty("proposer")
    String proposer();

    @JsonProperty("round")
    Long round();
}
