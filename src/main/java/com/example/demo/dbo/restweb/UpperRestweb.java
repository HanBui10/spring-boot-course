package com.example.demo.dbo.restweb;

public class UpperRestweb {
    private String firstName;
    private String lastName;

    // Getters và Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void convertToUppercase() {
        this.firstName = this.firstName.toUpperCase();
        this.lastName = this.lastName.toUpperCase();
    }
}
