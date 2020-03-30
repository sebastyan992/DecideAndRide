package edu.wsb.students.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Currency;

@Entity
@Table(name = "Car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    private String brand;
    private String model;
    private int hp;
    private String engineCapacity;
    private int prodYear;
    private String vin;
    private LocalDateTime insuranceDate;
    private String technicalInspection;
    private Currency priceDay;
    private String rate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getProdYear() {
        return prodYear;
    }

    public void setProdYear(int prodYear) {
        this.prodYear = prodYear;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public LocalDateTime getInsuranceDate() {
        return insuranceDate;
    }

    public void setInsuranceDate(LocalDateTime insuranceDate) {
        this.insuranceDate = insuranceDate;
    }

    public String getTechnicalInspection() {
        return technicalInspection;
    }

    public void setTechnicalInspection(String technicalInspection) {
        this.technicalInspection = technicalInspection;
    }

    public Currency getPriceDay() {
        return priceDay;
    }

    public void setPriceDay(Currency priceDay) {
        this.priceDay = priceDay;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

}