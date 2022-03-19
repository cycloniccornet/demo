package mongo.controller;


import mongo.model.City;
import mongo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {


    @Autowired
    private CityService cityService;

    @GetMapping("/all")
    public List<City> getAllCities() {
        return this.cityService.getCities();
    }
}
