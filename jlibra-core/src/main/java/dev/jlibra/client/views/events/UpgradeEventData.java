package dev.jlibra.client.views.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableUpgradeEventData.class)
public interface UpgradeEventData extends EventData {

    @JsonProperty("write_set")
    String writeSet();
}
