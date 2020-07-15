package com.apihomeworld.homeworld.FatLossCalculator.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FatLossCalculator {
    @Id
    private int id;
    private int age;
    private String gender;
    private int height;
    private double weight;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "FatLossService{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
