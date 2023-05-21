package com.bridgelabz;

public class Person {
    private String name;
    // Add other properties and methods as needed

    public Person(String name) {
        this.name = name;
    }

    // Getters and setters for the properties


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }
}
