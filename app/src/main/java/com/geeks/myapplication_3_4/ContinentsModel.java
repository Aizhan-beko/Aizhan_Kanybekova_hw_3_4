package com.geeks.myapplication_3_4;

import java.io.Serializable;
import java.util.List;

public class ContinentsModel implements Serializable {

    private String name;
    private String image;

    private List<String> countries;
    public ContinentsModel(String name, String image, List<String> countries) {
        this.name = name;
        this.image = image;
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public List<String> getCountries() {
        return countries;
    }

}