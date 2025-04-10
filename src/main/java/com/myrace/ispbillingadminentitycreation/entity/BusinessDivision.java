package com.myrace.ispbillingadminentitycreation.entity;

import com.myrace.ispbillingadminentitycreation.enums.BusinessType;
import jakarta.persistence.*;

@Entity
@Table(name = "business_divisions")
public class BusinessDivision extends BaseEntity {

    @Enumerated(EnumType.STRING)
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
