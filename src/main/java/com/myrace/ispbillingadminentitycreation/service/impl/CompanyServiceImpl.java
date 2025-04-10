package com.myrace.ispbillingadminentitycreation.service.impl;

import com.myrace.ispbillingadminentitycreation.dto.CompanyDto;
import com.myrace.ispbillingadminentitycreation.dto.CompanyOutputDto;
import com.myrace.ispbillingadminentitycreation.dto.CompanyUpdateDto;
import com.myrace.ispbillingadminentitycreation.entity.Company;
import com.myrace.ispbillingadminentitycreation.repository.CompanyRepository;
import com.myrace.ispbillingadminentitycreation.service.CompanyService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        company = companyRepository.save(company);

        company = companyRepository.save(company.setCompanyId("CID" + String.format("%05d", company.getId())));
        return company;
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Company not found with id " + id));
    }

    @Override
    public List<CompanyOutputDto> getAllCompanies() {
        List<Company> company = companyRepository.findAll();
        List<CompanyOutputDto> dtos = new ArrayList<>();
        company.forEach(companyOutput -> {
            dtos.add(new CompanyOutputDto(companyOutput));
        });
        return  dtos;
    }

    @Override
    public Company updateCompany(Long id, CompanyUpdateDto dto) {
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
