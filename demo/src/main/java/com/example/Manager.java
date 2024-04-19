package com.example;
import java.sql.Date;
import java.time.LocalDate;



/**
 * The Manager class represents a manager with their name, identifier, start date, and experience.
 */
public class Manager extends Person{

private LocalDate startDate;    // The start date of the manager
private int experience;         // The experience of the manager in years



/**
     * Gets the start date of the manager.
     * @return The start date of the manager.
     */
public LocalDate getStartDate() {
    return startDate;
}

/**
     * Sets the start date of the manager.
     * @param startDate The start date of the manager.
     */
public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
}

/**
     * Gets the experience of the manager.
     * @return The experience of the manager in years.
     */
public int getExperience() {
    return experience;
}


public void setExperience(int experience) {
    this.experience = experience;
}

/**
     * Sets the experience of the manager.
     * @param experience The experience of the manager in years.
     */


 /**
     * Constructor of the Manager class.
     * @param name The name of the manager.
     * @param identifier The identifier of the manager.
     * @param startDate The start date of the manager.
     * @param experience The experience of the manager in years.
     */    
public Manager(String name, String identifier, LocalDate startDate, int experience) {
    super(name, identifier);
    this.startDate = startDate;
    this.experience = experience;
}
   
}
