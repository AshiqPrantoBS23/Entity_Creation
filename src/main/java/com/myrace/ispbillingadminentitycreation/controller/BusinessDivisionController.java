package com.myrace.ispbillingadminentitycreation.controller;

import com.myrace.ispbillingadminentitycreation.dto.BusinessAddDivisionDto;
import com.myrace.ispbillingadminentitycreation.dto.BusinessUpdateDivisionDto;
import com.myrace.ispbillingadminentitycreation.entity.BusinessDivision;
import com.myrace.ispbillingadminentitycreation.service.BusinessDivisionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/business-division")
public class BusinessDivisionController {

    @Autowired
    private BusinessDivisionService service;

    @PostMapping
    public BusinessDivision create(@Valid @RequestBody BusinessAddDivisionDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public BusinessDivision update(@PathVariable Long id, @Valid @RequestBody BusinessUpdateDivisionDto dto) {
        return service.update(id, dto);
    }

    @GetMapping("/{id}")
    public BusinessDivision getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public Page<BusinessDivision> getAll(Pageable pageable) {
        return service.getAll(pageable);
    }
}
