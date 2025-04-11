package com.myrace.ispbillingadminentitycreation.repository;

import com.myrace.ispbillingadminentitycreation.entity.BillingFrequency;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface BillingFrequencyRepository extends JpaRepository<BillingFrequency, Long> {
    Optional<BillingFrequency> findByIdAndIsDeletedFalse(Long id);
    Page<BillingFrequency> findAllByIsDeletedFalse(Pageable pageable);
}