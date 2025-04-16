package com.myrace.ispbillingadminentitycreation.mapper;

import com.myrace.ispbillingadminentitycreation.dto.*;
import com.myrace.ispbillingadminentitycreation.entity.AdditionalDocumentType;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdditionalDocumentTypeMapper {

    AdditionalDocumentType toEntity(CreateAdditionalDocumentTypeDto dto);

    AdditionalDocumentTypeDto toDto(AdditionalDocumentType entity);
}
