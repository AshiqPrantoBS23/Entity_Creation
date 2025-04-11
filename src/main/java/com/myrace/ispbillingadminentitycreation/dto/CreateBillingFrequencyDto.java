package com.myrace.ispbillingadminentitycreation.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateBillingFrequencyDto {

    @NotBlank
    private String frequencyDaysName;

    @NotNull
    private Integer duration;

    public String getFrequencyDaysName() {
        return frequencyDaysName;
    }

    public void setFrequencyDaysName(String frequencyDaysName) {
        this.frequencyDaysName = frequencyDaysName;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}