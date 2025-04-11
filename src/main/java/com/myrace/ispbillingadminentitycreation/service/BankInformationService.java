package com.myrace.ispbillingadminentitycreation.service;

import com.myrace.ispbillingadminentitycreation.dto.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BankInformationService {
    BankInformationDto create(CreateBankInformationDto dto);
    BankInformationDto update(Long id, UpdateBankInformationDto dto);
    BankInformationDto getById(Long id);
    Page<BankInformationDto> getAll(Pageable pageable);
}
