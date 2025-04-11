package com.myrace.ispbillingadminentitycreation.service.impl;

import com.myrace.ispbillingadminentitycreation.dto.BusinessAddDivisionDto;
import com.myrace.ispbillingadminentitycreation.dto.BusinessUpdateDivisionDto;
import com.myrace.ispbillingadminentitycreation.entity.BusinessDivision;
import com.myrace.ispbillingadminentitycreation.repository.BusinessDivisionRepository;
import com.myrace.ispbillingadminentitycreation.service.BusinessDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

@Service
public class BusinessDivisionServiceImpl implements BusinessDivisionService {

    @Autowired
    private BusinessDivisionRepository repository;

    @Override
    public BusinessDivision create(BusinessAddDivisionDto dto) {
        BusinessDivision division = new BusinessDivision();
        division.setBusinessTypeName(dto.getBusinessTypeName());
        division.setDescription(dto.getDescription());
        return repository.save(division);
    }

    @Override
    public BusinessDivision update(Long id, BusinessUpdateDivisionDto dto) {
        BusinessDivision division = repository.findByIdAndIsDeletedFalse(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Business Division not found"));
        if(dto.getBusinessTypeName() != null) {
            division.setBusinessTypeName(dto.getBusinessTypeName());
        }
        if(dto.getDescription() != null) {
            division.setDescription(dto.getDescription());
        }

        return repository.save(division);
    }

    @Override
    public BusinessDivision getById(Long id) {
        return repository.findByIdAndIsDeletedFalse(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Business Division not found"));
    }

    @Override
    public Page<BusinessDivision> getAll(Pageable pageable) {
        return repository.findAllByIsDeletedFalse(pageable);
    }
}
