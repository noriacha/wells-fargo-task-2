package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {

    @Id
    @GeneratedValue
    private Long securityID;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private String quantity;


    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false) //creates a foreign key column
    private Portfolio portfolio;
    protected Security(){

    }

    public Security(String name, String category, String purchasePrice, String purchaseDate, String quantity){
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setCategory(String Category){
        this.category = category;
    }

    public String getCategory(){
        return category;
    }

    public void setPurchasePrice(String purchasePrice){
        this.purchasePrice = purchasePrice;
    }

    public String getPurchasePrice(){
        return purchasePrice;
    }

    public void setPurchaseDate(String purchaseDate){
        this.purchaseDate = purchaseDate;
    }

    public String getPurchaseDate(){
        return purchaseDate;
    }

    public void setQuantity(String quantity){
        this.quantity = quantity;
    }

    public String getQuantity(){
        return quantity;
    }

}
