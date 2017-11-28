package com.jatheon.demo.holiday.model.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class WeatherDTO {

    private Long id;
    private Long destinationId;
    private String weatherDate;
    private String weatherType;
    private Integer temperature;

    public WeatherDTO() {

    }

    public WeatherDTO(Long id, Long destinationId, String weatherDate, String weatherType, Integer temperature) {
        this.id = id;
        this.destinationId = destinationId;
        this.weatherDate = weatherDate;
        this.weatherType = weatherType;
        this.temperature = temperature;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Long getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(final Long destinationId) {
        this.destinationId = destinationId;
    }

    public String getWeatherDate() {
        return weatherDate;
    }

    public void setWeatherDate(final String weatherDate) {
        this.weatherDate = weatherDate;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(final Integer temperature) {
        this.temperature = temperature;
    }

    public String getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(final String weatherType) {
        this.weatherType = weatherType;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }


}
