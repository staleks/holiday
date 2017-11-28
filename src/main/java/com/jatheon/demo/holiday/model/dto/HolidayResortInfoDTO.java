package com.jatheon.demo.holiday.model.dto;

import java.util.HashMap;
import java.util.Map;

public class HolidayResortInfoDTO {

    private DestinationDTO destinationInfo;
    private Map<String, HolidayResortInfoPerDayDTO> destinationInfoPerDay;

    public HolidayResortInfoDTO() {
        this.destinationInfoPerDay = new HashMap<>();
    }

    public DestinationDTO getDestinationInfo() {
        return destinationInfo;
    }

    public void setDestinationInfo(final DestinationDTO destinationInfo) {
        this.destinationInfo = destinationInfo;
    }

    public Map<String, HolidayResortInfoPerDayDTO> getDestinationInfoPerDay() {
        return destinationInfoPerDay;
    }

    public void setDestinationInfoPerDay(final Map<String, HolidayResortInfoPerDayDTO> destinationInfoPerDay) {
        this.destinationInfoPerDay = destinationInfoPerDay;
    }

}
