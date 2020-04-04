package com.CIS3368.Test2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Virus {
    @Id
    private int id;
    private String name;
    private String description;
    private String symptoms;
    private double duration;
    private double mortalityrate;

    public Virus() {
    }
    public Virus(int id, String name, String description, String symptoms, double duration, double mortalityrate) {
        this.id= id;
        this.name=name;
        this.description=description;
        this.symptoms=symptoms;
        this.duration=duration;
        this.mortalityrate=mortalityrate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getMortalityrate() {
        return mortalityrate;
    }

    public void setMortalityrate(double mortalityrate) {
        this.mortalityrate = mortalityrate;
    }
}
