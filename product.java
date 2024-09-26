package com.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class product {

    @Id
    @Column(name = "brand", nullable = false)
    private String brand;

    @Column(name = "flavour", nullable = false, unique = true)
    private String flavour;

    @Column(name = "packaging", nullable = false)
    private String packaging;

    @Column(name = "additionalinfo", nullable = true)
    private String additionalinfo;

 

    public product(String brand, String flavour, String packaging, String additionalinfo) {
        this.brand = brand;
        this.flavour = flavour;
        this.packaging = packaging;
        this.additionalinfo = additionalinfo;
    }

    // -------------------Getters and Setters----------------------------------//
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public String getAdditionalinfo() {
        return additionalinfo;
    }

    public void setAdditionalinfo(String additionalinfo) {
        this.additionalinfo = additionalinfo;
    }

    @Override
    public String toString() {
        return "Product{" +
               "brand='" + brand + '\'' +
               ", flavour='" + flavour + '\'' +
               ", packaging='" + packaging + '\'' +
               ", additionalinfo='" + additionalinfo + '\'' +
               '}';
    }
}