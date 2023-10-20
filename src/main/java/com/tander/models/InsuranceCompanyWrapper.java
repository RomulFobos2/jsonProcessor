package com.tander.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InsuranceCompanyWrapper {
    @JsonProperty("InsuranceCompany")
    private List<InsuranceCompany> insuranceCompanies;

    @Override
    public String toString() {
        return "InsuranceCompanyWrapper{" +
                "insuranceCompanies=" + insuranceCompanies +
                '}';
    }
}
