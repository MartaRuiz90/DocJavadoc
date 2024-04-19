package com.example;


/**
 * The Guest class represents a guest with their name, identifier, and nationality.
 */
public class Guest extends Person{

    private String nationality;



     /**
     * Gets the nationality of the guest.
     * @return The nationality of the guest.
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the nationality of the guest.
     * @param nationality The nationality of the guest.
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * Constructor of the Guest class.
     * @param name The name of the guest.
     * @param identifier The identifier of the guest.
     * @param nationality The nationality of the guest.
     */
    public Guest(String name, String identifier, String nationality) {
        super(name, identifier);
        this.nationality = nationality;
    }
    

}
