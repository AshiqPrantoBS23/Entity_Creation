package com.myrace.ispbillingadminentitycreation.repository;

import com.myrace.ispbillingadminentitycreation.entity.AdditionalDocumentType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdditionalDocumentTypeRepository extends JpaRepository<AdditionalDocumentType, Long> {

    Optional<AdditionalDocumentType> findByIdAndIsDeletedFalse(Long id);

    Page<AdditionalDocumentType> findAllByIsDeletedFalse(Pageable pageable);
}
