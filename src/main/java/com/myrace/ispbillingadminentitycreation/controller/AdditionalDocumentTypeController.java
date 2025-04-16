package com.myrace.ispbillingadminentitycreation.controller;

import com.myrace.ispbillingadminentitycreation.dto.*;
import com.myrace.ispbillingadminentitycreation.service.AdditionalDocumentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/additional-document-type")
public class AdditionalDocumentTypeController {

    @Autowired
    private AdditionalDocumentTypeService service;

    @PostMapping
    public AdditionalDocumentTypeDto create(@RequestBody CreateAdditionalDocumentTypeDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public AdditionalDocumentTypeDto update(@PathVariable Long id, @RequestBody UpdateAdditionalDocumentTypeDto dto) {
        return service.update(id, dto);
    }

    @GetMapping
    public Page<AdditionalDocumentTypeDto> getAll(Pageable pageable) {
        return service.getAll(pageable);
    }

    @GetMapping("/{id}")
    public AdditionalDocumentTypeDto getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void softDelete(@PathVariable Long id) {
        service.softDelete(id);
    }
}
