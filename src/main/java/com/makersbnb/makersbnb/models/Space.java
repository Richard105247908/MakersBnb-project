package com.makersbnb.makersbnb.models;

import java.time.LocalDate;

public class Space {
    private Integer id;
    private String name;
    private String description;
    private Double pricePerNight;
    private LocalDate availableFrom;
    private LocalDate availableTo;
    private Integer ownerId;


    public Space(Integer id, Integer owner_id,
                 LocalDate available_to,
                 LocalDate available_from,
                 Double price_per_night,
                 String description, String name) {

        this.id = id;
        this.ownerId = owner_id;
        this.availableTo = available_to;
        this.availableFrom = available_from;
        this.pricePerNight = price_per_night;
        this.description = description;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getAvailableFrom() {
        return availableFrom;
    }

    public void setAvailable_from(LocalDate available_from) {
        this.availableFrom = available_from;
    }

    public Double getPrice_per_night() {
        return pricePerNight;
    }

    public void setPrice_per_night(Double price_per_night) {
        this.pricePerNight = price_per_night;
    }

    public LocalDate getAvailable_to() {
        return availableTo;
    }

    public void setAvailable_to(LocalDate available_to) {
        this.availableTo = available_to;
    }

    public Integer getOwner_id() {
        return ownerId;
    }

    public void setOwner_id(Integer owner_id) {
        this.ownerId = owner_id;
    }
}
