package com.myrace.ispbillingadminentitycreation.dto;

public class BillingFrequencyDto {

    private Long id;
    private String frequencyDaysName;
    private Integer duration;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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