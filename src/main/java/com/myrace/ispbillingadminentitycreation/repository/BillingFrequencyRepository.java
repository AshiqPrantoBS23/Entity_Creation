package com.myrace.ispbillingadminentitycreation.repository;

import com.myrace.ispbillingadminentitycreation.entity.BillingFrequency;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface BillingFrequencyRepository extends JpaRepository<BillingFrequency, Long> {
    Optional<BillingFrequency> findByIdAndIsDeletedFalse(Long id);

    Page<BillingFrequency> findAllByIsDeletedFalse(Pageable pageable);

    Page<BillingFrequency> findByFrequencyDaysNameContainingIgnoreCaseAndIsDeletedFalse(String name, Pageable pageable);

    Page<BillingFrequency> findByDurationAndIsDeletedFalse(Integer duration, Pageable pageable);

    Page<BillingFrequency> findByFrequencyDaysNameContainingIgnoreCaseAndDurationAndIsDeletedFalse(String name, Integer duration, Pageable pageable);
}