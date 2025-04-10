package com.myrace.ispbillingadminentitycreation.dto;

import com.myrace.ispbillingadminentitycreation.enums.BusinessType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class BusinessAddDivisionDto {

    @NotNull(message = "Business Type Name must not be empty")
    private BusinessType businessTypeName;

    private String description;

    public BusinessType getBusinessTypeName() {
        return businessTypeName;
    }

    public void setBusinessTypeName(BusinessType businessTypeName) {
        this.businessTypeName = businessTypeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
