package com.tander.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InsuranceCompany {

    @JsonProperty("No")
    String number;

    @JsonProperty("Name")
    String name;

    @JsonProperty("Market Capitalization")
    String marketCapitalization;

    public String getMarketCapitalization() {
        if (marketCapitalization == null || marketCapitalization.isEmpty()) {
            return "no data";
        }
        return marketCapitalization;
    }

    @Override
    public String toString() {
        return "\nNo: " + number + "\n" +
                "Name: " + name + "\n" +
                "Market Capitalization: " + getMarketCapitalization() + "\n" +
                "-------------";
    }
}
