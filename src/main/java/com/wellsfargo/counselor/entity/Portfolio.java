package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private Long portfolioId;

    @ManyToOne
    private Client client;

    @Column(nullable = false)
    private String creationDate;

    //Constructors
    protected Portfolio(){

    }

    public Portfolio(String creationDate){
        this.creationDate = creationDate;
    }

    public Long getPortfolioId(){
        return portfolioId;
    }
    public void setClient(Client client){
        this.client = client;
    }
    public Client getClient(){
        return client;
    }
    public String getCreationDate(){
        return creationDate;
    }

    public void setCreationDate(String creationDate){
        this.creationDate = creationDate;
    }
}
