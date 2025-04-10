package com.myrace.ispbillingadminentitycreation.service;

import com.myrace.ispbillingadminentitycreation.dto.CompanyDto;
import com.myrace.ispbillingadminentitycreation.dto.CompanyOutputDto;
import com.myrace.ispbillingadminentitycreation.dto.CompanyUpdateDto;
import com.myrace.ispbillingadminentitycreation.entity.Company;

import java.util.List;

public interface CompanyService {
    Company createCompany(CompanyDto dto);
    Company getCompanyById(Long id);
    List<CompanyOutputDto> getAllCompanies();
    Company updateCompany(Long id, CompanyUpdateDto dto);
    void deleteCompany(Long id);
}
