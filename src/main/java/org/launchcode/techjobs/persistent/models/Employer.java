package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location cannot be blank")
    @Size(max=75, message = "Location cannot be more than 75 characters long")
    private String location;

    public Employer(String location)    {
        this.location = location;
    }

    public Employer()   {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
