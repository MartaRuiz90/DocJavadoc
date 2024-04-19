package com.example;


/**
 * The Person class represents a person with their name and identifier.
 */
public abstract class Person {
    
    protected String name;          // The name of the person
    protected String identifier;     // The identifier of the person


    /**
     * Gets the name of the person.
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

     /**
     * Sets the name of the person.
     * @param name The name of the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the identifier of the person.
     * @return The identifier of the person.
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the identifier of the person.
     * @param identifier The identifier of the person.
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }


    /**
     * Constructor of the Person class.
     * @param name The name of the person.
     * @param identifier The identifier of the person.
     */
    public Person(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

}
