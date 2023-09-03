package com.example.test.Location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;
    public List<Location>getLocation(){
        return locationRepository.findAll();
    }

    public LocationDto saveLocation(LocationDto locationDto) {
        return null;
    }
}
