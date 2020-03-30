package edu.wsb.students.model;

import java.time.LocalDate;

public class Customer {

    private String name;
    private String documentId;
    private LocalDate documentExpirationDate;
    private String drivingLicenceId;
    private LocalDate drivingLicenceExpirationDate;
    private LocalDate birthDate;
    private String address;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public LocalDate getDocumentExpirationDate() {
        return documentExpirationDate;
    }

    public void setDocumentExpirationDate(LocalDate documentExpirationDate) {
        this.documentExpirationDate = documentExpirationDate;
    }

    public String getDrivingLicenceId() {
        return drivingLicenceId;
    }

    public void setDrivingLicenceId(String drivingLicenceId) {
        this.drivingLicenceId = drivingLicenceId;
    }

    public LocalDate getDrivingLicenceExpirationDate() {
        return drivingLicenceExpirationDate;
    }

    public void setDrivingLicenceExpirationDate(LocalDate drivingLicenceExpirationDate) {
        this.drivingLicenceExpirationDate = drivingLicenceExpirationDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}