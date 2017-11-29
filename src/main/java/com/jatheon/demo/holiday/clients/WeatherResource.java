package com.jatheon.demo.holiday.clients;

import com.jatheon.demo.holiday.model.dto.WeatherDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "http://weather", fallback = WeatherClientFallback.class)
public interface WeatherResource {

    @RequestMapping(value = "/{destinationId}", method = RequestMethod.GET)
    List<WeatherDTO> getWeather(@PathVariable("destinationId") Long destinationId);


}
