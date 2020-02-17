package com.mycompany.distancecalculator.service;

import com.mycompany.distancecalculator.entity.City;

import java.util.Arrays;
import java.util.List;

public class CityService {
    private List<City> cities = Arrays.asList(
            new City("moscow", 123d,321d),
            new City("london", 121212d, 1212d)
    );

    public List<City> getCities() {
        return cities;
    }
}
