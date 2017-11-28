package com.jatheon.demo.holiday.model.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

public class HolidayResortInfoPerDayDTO {

    private String infoDate;
    private BigDecimal price;
    private String weatherType;
    private Integer temperature;

    public HolidayResortInfoPerDayDTO() {

    }

    public HolidayResortInfoPerDayDTO(String infoDate, BigDecimal price, String weatherType, Integer temperature) {
        this.infoDate = infoDate;
        this.price = price;
        this.weatherType = weatherType;
        this.temperature = temperature;
    }

    public String getInfoDate() {
        return infoDate;
    }

    public void setInfoDate(final String infoDate) {
        this.infoDate = infoDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }

    public String getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(final String weatherType) {
        this.weatherType = weatherType;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(final Integer temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }

}
