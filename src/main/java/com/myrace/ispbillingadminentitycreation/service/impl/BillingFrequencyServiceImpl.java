package com.myrace.ispbillingadminentitycreation.service.impl;

import com.myrace.ispbillingadminentitycreation.dto.*;
import com.myrace.ispbillingadminentitycreation.entity.BillingFrequency;
import com.myrace.ispbillingadminentitycreation.exception.ResourceNotFoundException;
import com.myrace.ispbillingadminentitycreation.repository.BillingFrequencyRepository;
import com.myrace.ispbillingadminentitycreation.service.BillingFrequencyService;
import com.myrace.ispbillingadminentitycreation.mapper.BillingFrequencyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BillingFrequencyServiceImpl implements BillingFrequencyService {

    @Autowired
    private BillingFrequencyRepository repository;

    @Autowired
    private BillingFrequencyMapper mapper;

    @Override
    public BillingFrequencyDto create(CreateBillingFrequencyDto dto) {
        BillingFrequency entity = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public BillingFrequencyDto update(Long id, UpdateBillingFrequencyDto dto) {
        BillingFrequency entity = repository.findByIdAndIsDeletedFalse(id)
                .orElseThrow(() -> new ResourceNotFoundException("Billing Frequency not found"));

        if (dto.getFrequencyDaysName() != null) {
            entity.setFrequencyDaysName(dto.getFrequencyDaysName());
        }
        if (dto.getDuration() != null) {
            entity.setDuration(dto.getDuration());
        }

        return mapper.toDto(repository.save(entity));
    }

    @Override
    public Page<BillingFrequencyDto> getAll(String search, Integer duration, Pageable pageable) {
        Page<BillingFrequency> result;

        if (search != null && duration != null) {
            result = repository.findByFrequencyDaysNameContainingIgnoreCaseAndDurationAndIsDeletedFalse(search, duration, pageable);
        } else if (search != null) {
            result = repository.findByFrequencyDaysNameContainingIgnoreCaseAndIsDeletedFalse(search, pageable);
        } else if(duration != null) {
            result = repository.findByDurationAndIsDeletedFalse(duration, pageable);
        } else {
            result = repository.findAllByIsDeletedFalse(pageable);
        }
        return result.map(mapper::toDto);
    }

    @Override
    public BillingFrequencyDto getById(Long id) {
        BillingFrequency entity = repository.findByIdAndIsDeletedFalse(id)
                .orElseThrow(() -> new ResourceNotFoundException("Billing Frequency not found"));
        return mapper.toDto(entity);
    }


    @Override
    public void softDelete(Long id) {
        BillingFrequency entity = repository.findByIdAndIsDeletedFalse(id)
                .orElseThrow(() -> new ResourceNotFoundException("Billing Frequency not found"));
        entity.setDeleted(true);
        repository.save(entity);
    }
}