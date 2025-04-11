package com.myrace.ispbillingadminentitycreation.mapper;

import com.myrace.ispbillingadminentitycreation.dto.*;
import com.myrace.ispbillingadminentitycreation.entity.BankInformation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BankInformationMapper {
    BankInformation toEntity(CreateBankInformationDto dto);
    BankInformationDto toDto(BankInformation entity);
}
