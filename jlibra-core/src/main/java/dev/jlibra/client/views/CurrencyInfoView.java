package dev.jlibra.client.views;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableCurrencyInfoView.class)
public interface CurrencyInfoView {
    @JsonProperty("code")
    String code();

    @JsonProperty("scaling_factor")
    Long scalingFactor();

    @JsonProperty("fractional_part")
    Long fractionalPart();
}
