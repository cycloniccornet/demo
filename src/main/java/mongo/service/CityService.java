package mongo.service;

import mongo.model.City;
import mongo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;


    public List<City> getCities() {
        return this.cityRepository.findAll();
    }

}
