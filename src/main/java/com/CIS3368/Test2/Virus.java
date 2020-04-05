package com.CIS3368.Test2;

import javax.persistence.*;

@Entity
public class Virus {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "symptoms")
    private String symptoms;

    @Column(name = "duration")
    private double duration;

    @Column(name= "mortalityrate")
    private double mortalityrate;

    @Column(name= "image")
    private String image;

    public Virus() {
    }
    public Virus(int id, String name, String description, String symptoms, double duration, double mortalityrate, String image) {
        this.id= id;
        this.name=name;
        this.description=description;
        this.symptoms=symptoms;
        this.duration=duration;
        this.mortalityrate=mortalityrate;
        this.image=image;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
