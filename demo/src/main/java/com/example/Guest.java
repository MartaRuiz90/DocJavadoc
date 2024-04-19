package com.example;

public class Guest extends Person{

    private String nationality;




    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


    public Guest(String name, String identifier, String nationality) {
        super(name, identifier);
        this.nationality = nationality;
    }
    

}
