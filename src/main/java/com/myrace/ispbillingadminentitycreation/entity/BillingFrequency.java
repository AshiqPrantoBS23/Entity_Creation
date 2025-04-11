package com.myrace.ispbillingadminentitycreation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "billing_frequency")
public class BillingFrequency extends BaseEntity {

    @Column(nullable = false)
    private String frequencyDaysName;

    @Column()
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