package com.myrace.ispbillingadminentitycreation.controller;

import com.myrace.ispbillingadminentitycreation.dto.CompanyDto;
import com.myrace.ispbillingadminentitycreation.dto.CompanyOutputDto;
import com.myrace.ispbillingadminentitycreation.dto.CompanyUpdateDto;
import com.myrace.ispbillingadminentitycreation.entity.Company;
import com.myrace.ispbillingadminentitycreation.service.CompanyService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/company")
public class CompanyControllerImpl {

    private final CompanyService companyService;

    public CompanyControllerImpl(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping
    public ResponseEntity<Company> create(@Valid @RequestBody CompanyDto dto) {
        return ResponseEntity.ok(companyService.createCompany(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Company> getById(@PathVariable Long id) {
        return ResponseEntity.ok(companyService.getCompanyById(id));
    }

    @GetMapping
    public ResponseEntity<Page<CompanyOutputDto>> getAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(required = false) String name
            ) {
        Pageable pageable = PageRequest.of(page, size);
        Page<CompanyOutputDto> result = companyService.getAllCompanies(name, pageable);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Company> update(@PathVariable Long id, @Valid @RequestBody CompanyUpdateDto dto) {
        return ResponseEntity.ok(companyService.updateCompany(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        companyService.deleteCompany(id);
        return ResponseEntity.noContent().build();
    }
}
