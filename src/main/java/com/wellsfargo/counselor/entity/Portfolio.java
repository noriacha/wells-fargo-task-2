package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private Long portfolioId;

    @Column(nullable = false)
    private String creationDate;

    //@JoinColumn(name = "client_id", nullable = false) //creates a foreign key column
    //private Client client;

    //Constructors
    protected Portfolio(){

    }

    public Portfolio(String creationDate){
        this.creationDate = creationDate;
    }

    public String getCreationDate(){
        return creationDate;
    }

    public void setCreationDate(String creationDate){
        this.creationDate = creationDate;
    }
}
