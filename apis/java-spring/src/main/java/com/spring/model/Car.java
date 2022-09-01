package com.spring.model;

public class Car {
    private String Name;
    private String Brand;
    private String Color;
    private int Year;

    public Car(String name, String brand, String color, int year) {
        Name = name;
        Brand = brand;
        Color = color;
        Year = year;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }
}
