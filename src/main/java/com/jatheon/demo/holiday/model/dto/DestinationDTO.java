package com.jatheon.demo.holiday.model.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class DestinationDTO {

    private Long id;
    private String name;
    private Integer starRating;
    private String  country;

    public DestinationDTO() {

    }

    public DestinationDTO(Long id, String name, Integer starRating, String  country) {
        this.id = id;
        this.name = name;
        this.starRating = starRating;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getStarRating() {
        return starRating;
    }

    public void setStarRating(final Integer starRating) {
        this.starRating = starRating;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }

}
