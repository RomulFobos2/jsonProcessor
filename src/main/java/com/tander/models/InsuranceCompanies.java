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
public class InsuranceCompanies {
    @JsonProperty("InsuranceCompanies")
    private InsuranceCompanyWrapper insuranceCompanyWrapper;

    public List<InsuranceCompany> getInsuranceCompanies() {
        return insuranceCompanyWrapper.getInsuranceCompanies();
    }

    @Override
    public String toString() {
        return "InsuranceCompanies{" +
                "insuranceCompanyWrapper=" + insuranceCompanyWrapper +
                '}';
    }
}
