package com.myrace.ispbillingadminentitycreation.service;

import com.myrace.ispbillingadminentitycreation.dto.BusinessAddDivisionDto;
import com.myrace.ispbillingadminentitycreation.dto.BusinessUpdateDivisionDto;
import com.myrace.ispbillingadminentitycreation.entity.BusinessDivision;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BusinessDivisionService {

    BusinessDivision create(BusinessAddDivisionDto dto);

    BusinessDivision update(Long id, BusinessUpdateDivisionDto dto);

    BusinessDivision getById(Long id);

    Page<BusinessDivision> getAll(Pageable pageable);
}
