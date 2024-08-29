package com.example.demo.dbo.uppercase;

public class UppercaseJS {
    private String firstName;
    private String lastName;
    private int age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void convertToUppercase() {
        this.firstName = this.firstName.toUpperCase();
        this.lastName = this.lastName.toUpperCase();
    }
}
