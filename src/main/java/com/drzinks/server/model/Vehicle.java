package com.drzinks.server.model;

/**
 * Created by Michal on 2017-04-25.
 */
public class Vehicle {

    protected String description;

    public String getDescription() {
        return description;
    }

    public Vehicle setDescription(String description) {
        this.description = description;
        return this;
    }
}
