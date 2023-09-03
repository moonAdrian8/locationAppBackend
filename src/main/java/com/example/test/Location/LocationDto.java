package com.example.test.Location;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LocationDto {
    private Integer locationId;
    private String locationName;
    private String description;

    @Override
    public String toString() {
        return "LocationDto{" +
                "locationId=" + locationId +
                ", locationName='" + locationName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
