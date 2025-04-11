package com.myrace.ispbillingadminentitycreation.repository;

import com.myrace.ispbillingadminentitycreation.entity.BankInformation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BankInformationRepository extends JpaRepository<BankInformation, Long> {
    Page<BankInformation> findAllByIsDeletedFalse(Pageable pageable);
    Optional<BankInformation> findByIdAndIsDeletedFalse(Long id);
}
