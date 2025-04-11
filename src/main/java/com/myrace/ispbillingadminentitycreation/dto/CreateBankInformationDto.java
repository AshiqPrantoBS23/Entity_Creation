package com.myrace.ispbillingadminentitycreation.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateBankInformationDto {
    @NotBlank
    private String bankName;

    @NotBlank
    private String branchName;

    @NotBlank
    private String address;

    private Long ebId;

    public String getBankName() {
        return bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getAddress() {
        return address;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
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
