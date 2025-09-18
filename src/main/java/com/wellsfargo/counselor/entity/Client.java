package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

public class Client {

    @Id //tell the program this is a primary key
    @GeneratedValue  //this is a random value generator
    private long ClientId;

    //cant be empty
    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;


    @ManyToOne //Many Clients to one Advisor
    private Advisor advisor;

    //Constructors
    protected Client(){

    }
    //Used when creating a new Client
    public Client(String firstName, String lastName, String address, String phone, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    //Getter & Setter

    public Long getClientID(){
        return ClientId;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }
    public Long getClientId(){
        return ClientId;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(){
        this.email = email;
    }
}
