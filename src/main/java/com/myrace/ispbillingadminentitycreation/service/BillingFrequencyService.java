package com.myrace.ispbillingadminentitycreation.service;

import com.myrace.ispbillingadminentitycreation.dto.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BillingFrequencyService {
    BillingFrequencyDto create(CreateBillingFrequencyDto dto);
    BillingFrequencyDto update(Long id, UpdateBillingFrequencyDto dto);
    Page<BillingFrequencyDto> getAll(Pageable pageable);
    BillingFrequencyDto getById(Long id);
    void softDelete(Long id);
}