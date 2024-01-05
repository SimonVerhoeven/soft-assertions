package dev.simonverhoeven.softassertions;

import java.time.LocalDate;

public class Person {
    private String name;
    private String mainLanguage;
    private String email;
    private String address;
    private String phoneNumber;
    private LocalDate dateOfBirth;

    public Person(String name, String mainLanguage, String email, String address, String phoneNumber, LocalDate dateOfBirth) {
        this.name = name;
        this.mainLanguage = mainLanguage;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setMainLanguage(String mainLanguage) {
        this.mainLanguage = mainLanguage;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}