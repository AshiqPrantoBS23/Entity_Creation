package com.myrace.ispbillingadminentitycreation.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "additional_document_type")
public class AdditionalDocumentType extends BaseEntity {

    @Column(name = "document_type")
    private String documentType;

    @Column(name = "document_name", nullable = false)
    private String documentName;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private String status;

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }
}
