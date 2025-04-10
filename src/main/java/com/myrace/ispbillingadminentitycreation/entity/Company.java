package com.myrace.ispbillingadminentitycreation.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "companies")
public class Company extends BaseEntity {

    @Column(name = "company_id", unique = true, nullable = true, updatable = false)
    private String companyId; // e.g., CID00001

    @NotBlank(message = "Company name is mandatory")
    @Column(nullable = false)
    private String companyName;

    @Column(name = "description")
    private String description;

    @Column(name = "address")
    private String address;

    @Column(name = "contact_person")
    private String contactPerson;

    @Email(message = "Invalid email format")
    @Column(name = "contact_email")
    private String contactEmail;

    @Pattern(regexp = "^\\+?\\d{10,15}$", message = "Phone number must be 10 to 15 digits, optional '+' at start")
    @Column(name = "contact_phone")
    private String contactPhone;

//    @PrePersist
//    public void generateCompanyId() {
//        this.companyId = "CID" + String.format("%05d", super.id);
//    }

    public String getCompanyId() {
        return companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
}
