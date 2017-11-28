package com.jatheon.demo.holiday.controller;

import com.jatheon.demo.holiday.clients.DestinationResource;
import com.jatheon.demo.holiday.clients.QuotingResource;
import com.jatheon.demo.holiday.clients.WeatherResource;
import com.jatheon.demo.holiday.model.dto.DestinationDTO;
import com.jatheon.demo.holiday.model.dto.HolidayResortInfoPerDayDTO;
import com.jatheon.demo.holiday.model.dto.QuotingDTO;
import com.jatheon.demo.holiday.model.dto.WeatherDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class HolidayController {

    private static final Logger LOG = LoggerFactory.getLogger(HolidayController.class);

    private DestinationResource destinationResource;
    private QuotingResource quotingResource;
    private WeatherResource weatherResource;

    public HolidayController(DestinationResource destinationResource, QuotingResource quotingResource, WeatherResource weatherResource) {
        this.destinationResource = destinationResource;
        this.quotingResource = quotingResource;
        this.weatherResource = weatherResource;
    }

    @RequestMapping("/resorts")
    public String getResorts(Model model) {
        List<DestinationDTO> destinations = destinationResource.getDestinations();
        model.addAttribute("destinations", destinations);
        return "resorts";
    }

    @RequestMapping("/resort/{destinationId}")
    public String getOneResort(@PathVariable("destinationId") Long destinationId, Model model) {
        DestinationDTO destinationDTO = destinationResource.getOneDestination(destinationId);
        model.addAttribute("destinationInfo", destinationDTO);

        Map<String, HolidayResortInfoPerDayDTO> mapPerDay = new HashMap<>();
        List<QuotingDTO> quotingDTOs = quotingResource.getQuoting(destinationId);
        for (QuotingDTO quotingItem: quotingDTOs) {
            HolidayResortInfoPerDayDTO itemPerDay = new HolidayResortInfoPerDayDTO();
            itemPerDay.setPrice(quotingItem.getPrice());
            mapPerDay.put(quotingItem.getPricingDate(), itemPerDay);
        }
        List<WeatherDTO> weatherDTOS = weatherResource.getWeather(destinationId);
        for (WeatherDTO weatherItem: weatherDTOS) {
            ((HolidayResortInfoPerDayDTO) mapPerDay.get(weatherItem.getWeatherDate())).setWeatherType(weatherItem.getWeatherType());
            ((HolidayResortInfoPerDayDTO) mapPerDay.get(weatherItem.getWeatherDate())).setTemperature(weatherItem.getTemperature());
        }
        Map<String, HolidayResortInfoPerDayDTO> result = mapPerDay.entrySet().stream()
                                               .sorted(Map.Entry.comparingByKey())
                                               .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                                                         (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        model.addAttribute("resortInfoPerDay", result);
        return "resort";
    }



}
