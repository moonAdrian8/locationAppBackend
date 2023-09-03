package com.example.test.Location;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "api/vi/location")
public class LocationController {
    @Autowired
    private LocationService locationService;
    @Autowired
    private  ModelMapper modelMapper;

    @GetMapping(path = "getLocation")
    public List<LocationDto> getLocation(){
        List<Location> result = locationService.getLocation();
        return locationService.getLocation().stream()
                .map(location -> modelMapper.map(location, LocationDto.class))
                .collect(Collectors.toList());
    }

    @PostMapping(path = "saveLocation")
    public LocationDto saveLocation(@RequestBody LocationDto locationDto){
        return locationService.saveLocation(locationDto);
    }
}
