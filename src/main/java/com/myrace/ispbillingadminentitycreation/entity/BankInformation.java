package com.myrace.ispbillingadminentitycreation.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bank_information")
public class BankInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bank_name", nullable = false)
    private String bankName;

    @Column(name = "branch_name", nullable = false)
    private String branchName;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "eb_id", nullable = false)
    private Long ebId;

    @Column(name = "is_deleted")
    private boolean isDeleted = false;

    public Long getId() {
        return id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public Long getEbId() {
        return ebId;
    }

    public void setEbId(Long ebId) {
        this.ebId = ebId;
    }
}
