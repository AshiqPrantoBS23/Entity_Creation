package com.myrace.ispbillingadminentitycreation.service;

import com.myrace.ispbillingadminentitycreation.dto.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AdditionalDocumentTypeService {

    AdditionalDocumentTypeDto create(CreateAdditionalDocumentTypeDto dto);

    AdditionalDocumentTypeDto update(Long id, UpdateAdditionalDocumentTypeDto dto);

    Page<AdditionalDocumentTypeDto> getAll(Pageable pageable);

    AdditionalDocumentTypeDto getById(Long id);

    void softDelete(Long id);
}
