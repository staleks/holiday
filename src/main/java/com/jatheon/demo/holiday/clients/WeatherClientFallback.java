package com.jatheon.demo.holiday.clients;

import com.jatheon.demo.holiday.model.dto.WeatherDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WeatherClientFallback implements WeatherResource {

    @Override
    public List<WeatherDTO> getWeather(final Long destinationId) {
        return new ArrayList<WeatherDTO>();
    }
}
