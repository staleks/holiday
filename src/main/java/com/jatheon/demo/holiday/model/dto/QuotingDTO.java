package com.jatheon.demo.holiday.model.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

public class QuotingDTO {

    private Long id;
    private Long destinationId;
    private String pricingDate;
    private BigDecimal price;

    public QuotingDTO() {

    }

    public QuotingDTO(Long id, Long destinationId, String pricingDate, BigDecimal price) {
        this.id = id;
        this.destinationId = destinationId;
        this.pricingDate = pricingDate;
        this.price = price;
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

    public String getPricingDate() {
        return pricingDate;
    }

    public void setPricingDate(final String pricingDate) {
        this.pricingDate = pricingDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }

}
