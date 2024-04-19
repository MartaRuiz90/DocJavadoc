package com.example;

import java.util.Locale.Category;

public class Hotel {
    

    private String name;
    private String address;
    private String web;
    private enum hotelCategory{
        OneStar,TwoStar,ThreeStar,FourStar,FiveStar
    }

    private Manager manager;



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getWeb() {
        return web;
    }
    public void setWeb(String web) {
        this.web = web;
    }
    public Manager getManager() {
        return manager;
    }
    public void setManager(Manager manager) {
        this.manager = manager;
    }


    
    public Hotel(String name, String address, String web, Manager manager) {
        this.name = name;
        this.address = address;
        this.web = web;
        this.manager = manager;
    }

    
}
