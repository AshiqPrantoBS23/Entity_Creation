package com.myrace.ispbillingadminentitycreation.dto;

public class BankInformationDto {
    private Long id;
    private String bankName;
    private String branchName;
    private String address;
    private Long ebId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getEbId() {
        return ebId;
    }

    public void setEbId(Long ebId) {
        this.ebId = ebId;
    }
}
