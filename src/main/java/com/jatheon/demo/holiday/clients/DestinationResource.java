package com.jatheon.demo.holiday.clients;

import com.jatheon.demo.holiday.model.dto.DestinationDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("http://destination")
public interface DestinationResource {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<DestinationDTO> getDestinations();

}
