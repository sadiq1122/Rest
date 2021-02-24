package com.example.Models;

public class Country {
    private String Country;
    private String Slug;
    private String IS02;

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getSlug() {
        return Slug;
    }

    public void setSlug(String slug) {
        Slug = slug;
    }

    public String getIS02() {
        return IS02;
    }

    public void setISB2(String IS02) {
        this.IS02 = IS02;
    }

    @Override
    public String toString() {
        return "Country{" +
                "Country='" + Country + '\'' +
                ", Slug='" + Slug + '\'' +
                ", IS02='" + IS02 + '\'' +
                '}';
    }
}
