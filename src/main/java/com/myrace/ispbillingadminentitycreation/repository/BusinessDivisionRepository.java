package com.myrace.ispbillingadminentitycreation.repository;

import com.myrace.ispbillingadminentitycreation.entity.BusinessDivision;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BusinessDivisionRepository extends JpaRepository<BusinessDivision, Long> {

    Page<BusinessDivision> findAllByIsDeletedFalse(Pageable pageable);

    Optional<BusinessDivision> findByIdAndIsDeletedFalse(Long id);
}
