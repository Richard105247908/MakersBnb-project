package com.makersbnb.makersbnb.models;

import java.time.LocalDate;

public class Booking {
    private Integer id;
    private Integer spaceId;
    private Integer guestId;
    private LocalDate date;
    private String status;


    public Booking(Integer id, String status, LocalDate date, Integer spaceId, Integer guestId) {
        this.id = id;
        this.status = status;
        this.date = date;
        this.spaceId = spaceId;
        this.guestId=guestId;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(Integer spaceId) {
        this.spaceId = spaceId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getGuestId() {
        return guestId;
    }

    public void setGuestId(Integer guestId) {
        this.guestId = guestId;
    }
}
