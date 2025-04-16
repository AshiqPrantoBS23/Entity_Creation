package com.myrace.ispbillingadminentitycreation.service.impl;

import com.myrace.ispbillingadminentitycreation.dto.*;
import com.myrace.ispbillingadminentitycreation.entity.AdditionalDocumentType;
import com.myrace.ispbillingadminentitycreation.exception.ResourceNotFoundException;
import com.myrace.ispbillingadminentitycreation.mapper.AdditionalDocumentTypeMapper;
import com.myrace.ispbillingadminentitycreation.repository.AdditionalDocumentTypeRepository;
import com.myrace.ispbillingadminentitycreation.service.AdditionalDocumentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AdditionalDocumentTypeServiceImpl implements AdditionalDocumentTypeService {

    @Autowired
    private AdditionalDocumentTypeRepository repository;

    @Autowired
    private AdditionalDocumentTypeMapper mapper;

    @Override
    public AdditionalDocumentTypeDto create(CreateAdditionalDocumentTypeDto dto) {
        AdditionalDocumentType entity = mapper.toEntity(dto);
        entity = repository.save(entity);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public AdditionalDocumentTypeDto update(Long id, UpdateAdditionalDocumentTypeDto dto) {
        AdditionalDocumentType entity = repository.findByIdAndIsDeletedFalse(id)
                .orElseThrow(() -> new ResourceNotFoundException("Document type not found"));

        if (dto.getDocumentType() != null) entity.setDocumentType(dto.getDocumentType());
        if (dto.getDocumentName() != null) entity.setDocumentName(dto.getDocumentName());
        if (dto.getDescription() != null) entity.setDescription(dto.getDescription());
        if (dto.getStatus() != null) entity.setStatus(dto.getStatus());

        return mapper.toDto(repository.save(entity));
    }

    @Override
    public Page<AdditionalDocumentTypeDto> getAll(Pageable pageable) {
        return repository.findAllByIsDeletedFalse(pageable).map(mapper::toDto);
    }

    @Override
    public AdditionalDocumentTypeDto getById(Long id) {
        AdditionalDocumentType entity = repository.findByIdAndIsDeletedFalse(id)
                .orElseThrow(() -> new ResourceNotFoundException("Document type not found"));
        return mapper.toDto(entity);
    }

    @Override
    public void softDelete(Long id) {
        AdditionalDocumentType entity = repository.findByIdAndIsDeletedFalse(id)
                .orElseThrow(() -> new ResourceNotFoundException("Document type not found"));
        entity.setDeleted(true);
        repository.save(entity);
    }
}
