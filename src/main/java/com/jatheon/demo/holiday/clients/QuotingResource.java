package com.jatheon.demo.holiday.clients;

import com.jatheon.demo.holiday.model.dto.QuotingDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("http://quoting")
public interface QuotingResource {

    @RequestMapping(value = "/{destinationId}", method = RequestMethod.GET)
    List<QuotingDTO> getQuoting(@PathVariable("destinationId") Long destinationId);


}
