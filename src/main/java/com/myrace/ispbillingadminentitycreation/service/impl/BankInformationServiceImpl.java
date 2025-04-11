package com.myrace.ispbillingadminentitycreation.service.impl;

import com.myrace.ispbillingadminentitycreation.dto.*;
import com.myrace.ispbillingadminentitycreation.entity.BankInformation;
import com.myrace.ispbillingadminentitycreation.exception.ResourceNotFoundException;
import com.myrace.ispbillingadminentitycreation.mapper.BankInformationMapper;
import com.myrace.ispbillingadminentitycreation.repository.BankInformationRepository;
import com.myrace.ispbillingadminentitycreation.service.BankInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class BankInformationServiceImpl implements BankInformationService {

    @Autowired
    private BankInformationRepository repository;

    @Autowired
    private BankInformationMapper mapper;

    @Override
    public BankInformationDto create(CreateBankInformationDto dto) {
        BankInformation entity = mapper.toEntity(dto);
        entity.setEbId(generateEbId());
        return mapper.toDto(repository.save(entity));
    }

    private Long generateEbId() {
        return new Random().nextLong(); // Or use a sequence-like approach
    }

    @Override
    public BankInformationDto update(Long id, UpdateBankInformationDto dto) {
        BankInformation entity = repository.findByIdAndIsDeletedFalse(id)
                .orElseThrow(() -> new ResourceNotFoundException("Bank information not found"));

        if (dto.getBankName() != null) entity.setBankName(dto.getBankName());
        if (dto.getBranchName() != null) entity.setBranchName(dto.getBranchName());
        if (dto.getAddress() != null) entity.setAddress(dto.getAddress());
        if (dto.getEbId() != null) entity.setEbId(dto.getEbId());

        return mapper.toDto(repository.save(entity));
    }

    @Override
    public BankInformationDto getById(Long id) {
        BankInformation entity = repository.findByIdAndIsDeletedFalse(id)
                .orElseThrow(() -> new ResourceNotFoundException("Bank information not found"));
        return mapper.toDto(entity);
    }

    @Override
    public Page<BankInformationDto> getAll(Pageable pageable) {
        return repository.findAllByIsDeletedFalse(pageable).map(mapper::toDto);
    }
}
