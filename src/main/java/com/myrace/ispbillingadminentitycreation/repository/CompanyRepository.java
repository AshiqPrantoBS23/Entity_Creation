package com.myrace.ispbillingadminentitycreation.repository;

import com.myrace.ispbillingadminentitycreation.entity.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    Page<Company> findByCompanyNameContainingIgnoreCaseAndIsDeletedFalse(String name, Pageable pageable);
    Page<Company> findAllByIsDeletedFalse(Pageable pageable);
}
