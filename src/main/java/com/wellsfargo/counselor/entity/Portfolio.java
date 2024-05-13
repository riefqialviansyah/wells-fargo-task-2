package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private long clientId;

    @Column(nullable = false)
    private Date creationDate;

    protected Portfolio() {

    }

    public Portfolio(Long clientId, Date creationDate) {
        this.clientId = firstName;
        this.lastName = lastName;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

}
