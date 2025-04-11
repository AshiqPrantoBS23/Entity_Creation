package com.myrace.ispbillingadminentitycreation.controller;

import com.myrace.ispbillingadminentitycreation.dto.*;
import com.myrace.ispbillingadminentitycreation.service.BillingFrequencyService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/billing-frequency")
public class BillingFrequencyController {

    @Autowired
    private BillingFrequencyService service;

    @PostMapping
    public BillingFrequencyDto create(@Valid @RequestBody CreateBillingFrequencyDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public BillingFrequencyDto update(@PathVariable Long id, @RequestBody UpdateBillingFrequencyDto dto) {
        return service.update(id, dto);
    }

    @GetMapping
    public org.springframework.data.domain.Page<BillingFrequencyDto> getAll(Pageable pageable) {
        return service.getAll(pageable);
    }

    @GetMapping("/{id}")
    public BillingFrequencyDto getById(@PathVariable Long id) {
        return service.getById(id);
    }


    @DeleteMapping("/{id}")
    public void softDelete(@PathVariable Long id) {
        service.softDelete(id);
    }
}