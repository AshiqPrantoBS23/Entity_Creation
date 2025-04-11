package com.myrace.ispbillingadminentitycreation.controller;

import com.myrace.ispbillingadminentitycreation.dto.*;
import com.myrace.ispbillingadminentitycreation.service.BankInformationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/bank-information")
public class BankInformationController {

    @Autowired
    private BankInformationService service;

    @PostMapping
    public BankInformationDto create(@Valid @RequestBody CreateBankInformationDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public BankInformationDto update(@PathVariable Long id, @RequestBody UpdateBankInformationDto dto) {
        return service.update(id, dto);
    }

    @GetMapping("/{id}")
    public BankInformationDto getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public Page<BankInformationDto> getAll(Pageable pageable) {
        return service.getAll(pageable);
    }
}
