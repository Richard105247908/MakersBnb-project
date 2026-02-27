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


    public Space(Integer id,String name,String description,
                 Double price_per_night,LocalDate available_from,
                 LocalDate available_to,  Integer owner_id
                 ) {

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

    public void setAvailableFrom(LocalDate available_from) {
        this.availableFrom = available_from;
    }

    public Double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(Double price_per_night) {
        this.pricePerNight = price_per_night;
    }

    public LocalDate getAvailableTo() {
        return availableTo;
    }

    public void setAvailableTo(LocalDate availableTo) {
        this.availableTo = availableTo;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }
}
