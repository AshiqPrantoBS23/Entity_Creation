package com.myrace.ispbillingadminentitycreation.service.impl;

import com.myrace.ispbillingadminentitycreation.dto.CompanyDto;
import com.myrace.ispbillingadminentitycreation.entity.Company;
import com.myrace.ispbillingadminentitycreation.repository.CompanyRepository;
import com.myrace.ispbillingadminentitycreation.service.CompanyService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public Company createCompany(CompanyDto dto) {
        Company company = new Company();
        company.setCompanyName(dto.getCompanyName());
        company.setDescription(dto.getDescription());
        company.setAddress(dto.getAddress());
        company.setContactPerson(dto.getContactPerson());
        company.setContactEmail(dto.getContactEmail());
        company.setContactPhone(dto.getContactPhone());
        return companyRepository.save(company);
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Company not found with id " + id));
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Company updateCompany(Long id, CompanyDto dto) {
        Company company = getCompanyById(id);
        company.setCompanyName(dto.getCompanyName());
        company.setDescription(dto.getDescription());
        company.setAddress(dto.getAddress());
        company.setContactPerson(dto.getContactPerson());
        company.setContactEmail(dto.getContactEmail());
        company.setContactPhone(dto.getContactPhone());
        return companyRepository.save(company);
    }

    @Override
    public void deleteCompany(Long id) {
        Company company = getCompanyById(id);
        company.setDeleted(true); // Soft delete
        companyRepository.save(company);
    }
}
