package com.example;

/**
 * The Hotel class represents a hotel with its name, address, website, and manager.
 */
public class Hotel {
    

    private String name;        // Name of the hotel
    private String address;     // Address of the hotel
    private String web;         // Website of the hotel
    private enum hotelCategory{ // Enumeration for the hotel category
        OneStar,                // One star
        TwoStar,                // Two stars
        ThreeStar,              // Three stars
        FourStar,               // Four stars
        FiveStar                // Five stars
    }

    private Manager manager;

    /**
     * Gets the name of the hotel.
     * @return The name of the hotel.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the hotel.
     * @param name The name of the hotel.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the address of the hotel.
     * @return The address of the hotel.
     */
    public String getAddress() {
        return address;
    }

     /**
     * Sets the address of the hotel.
     * @param address The address of the hotel.
     */
    public void setAddress(String address) {
        this.address = address;
    }

     /**
     * Gets the website of the hotel.
     * @return The website of the hotel.
     */
    public String getWeb() {
        return web;
    }

    /**
     * Sets the website of the hotel.
     * @param web The website of the hotel.
     */
    public void setWeb(String web) {
        this.web = web;
    }

    /**
     * Gets the manager of the hotel.
     * @return The manager of the hotel.
     */
    public Manager getManager() {
        return manager;
    }

    /**
     * Sets the manager of the hotel.
     * @param manager The manager of the hotel.
     */
    public void setManager(Manager manager) {
        this.manager = manager;
    }


   /**
     * Constructor of the Hotel class.
     * @param name The name of the hotel.
     * @param address The address of the hotel.
     * @param web The website of the hotel.
     * @param manager The manager of the hotel.
     */
    public Hotel(String name, String address, String web, Manager manager) {
        this.name = name;
        this.address = address;
        this.web = web;
        this.manager = manager;
    }

    
}
