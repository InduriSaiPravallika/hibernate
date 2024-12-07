package com.klu.EXP3LMS;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("dvd")  // Discriminator value for DVD subclass
public class DVD extends Item {

    private String director;
    private int regioncode;

    // Getters and Setters
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRegioncode() {
        return regioncode;
    }

    public void setRegioncode(int regioncode) {
        this.regioncode = regioncode;
    }
}
