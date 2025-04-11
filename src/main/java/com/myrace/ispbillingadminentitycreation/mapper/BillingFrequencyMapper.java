package com.myrace.ispbillingadminentitycreation.mapper;

import com.myrace.ispbillingadminentitycreation.dto.*;
import com.myrace.ispbillingadminentitycreation.entity.BillingFrequency;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BillingFrequencyMapper {
    BillingFrequencyDto toDto(BillingFrequency entity);
    BillingFrequency toEntity(CreateBillingFrequencyDto dto);
}