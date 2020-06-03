package dev.jlibra.client.views;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableAccountStateWithProofView.class)
public interface AccountStateWithProofView {

    @JsonProperty("version")
    Long version();

    @JsonProperty("blob")
    String blob();

    @JsonProperty("proof")
    AccountStateProofView proof();
}
