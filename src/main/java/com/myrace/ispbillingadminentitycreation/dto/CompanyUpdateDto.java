package com.myrace.ispbillingadminentitycreation.dto;

import com.myrace.ispbillingadminentitycreation.entity.Company;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class CompanyUpdateDto {

    @NotBlank(message = "Company name is mandatory")
    private String companyName;

    private String description;
    private String address;
    private String contactPerson;

    @Email(message = "Invalid email format")
    private String contactEmail;

    @Pattern(regexp = "^\\+?\\d{10,15}$", message = "Phone number must be 10 to 15 digits, optional '+' at start")
    private String contactPhone;

    public CompanyUpdateDto() {}

    public CompanyUpdateDto(Company company) {
        this.companyName = company.getCompanyName();
        this.description = company.getDescription();
        this.address = company.getAddress();
        this.contactPerson = company.getContactPerson();
        this.contactEmail = company.getContactEmail();
        this.contactPhone = company.getContactPhone();
    }

    // Getters and Setters
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
}
