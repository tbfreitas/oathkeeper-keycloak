package com.spring.model;

public class Person {

    private String Language;
    private String Name;
    private String City;
    private String Job;

    private int Age;
    private String Country;

    public Person(
        String language,
        String name, 
        String city, 
        String job, 
        int age, 
        String country
        ) {
            Language = Language;
            Name = name;
            City = city;
            Job = job;
            Age = age;
            Country = country;
    }

    public String getLanguage() {
        return Language;
    }   

    public void setLanguage(String language) {
        Language = language;
    }    

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}
