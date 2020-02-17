package com.mycompany.distancecalculator.rest;

import com.mycompany.distancecalculator.entity.City;
import com.mycompany.distancecalculator.service.CityService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Path("/cities")
@Produces(MediaType.APPLICATION_JSON)
public class CityEndpoint {
    @Inject
    private CityService cityService;

    @GET
    public List<City> getCities() {
        return cityService.getCities();
    }

}
