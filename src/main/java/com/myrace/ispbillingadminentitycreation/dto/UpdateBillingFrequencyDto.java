package com.myrace.ispbillingadminentitycreation.dto;

public class UpdateBillingFrequencyDto {

    private String frequencyDaysName;
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