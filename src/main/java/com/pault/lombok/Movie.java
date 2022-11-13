package com.pault.lombok;

import java.net.URL;

public class Movie {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public URL getOfficialSite() {
        return officialSite;
    }

    public void setOfficialSite(URL officialSite) {
        this.officialSite = officialSite;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    private String title;
    private String description;
    private String country;
    private int rating;
    private URL officialSite;
    private String language;
}
