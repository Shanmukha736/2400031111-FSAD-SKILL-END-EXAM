package com.klef.fsad.exam.service;

import com.klef.fsad.exam.model.Restaurant;
import com.klef.fsad.exam.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    private RestaurantRepository repository;

    @Override
    public String addRestaurant(Restaurant restaurant) {
        repository.save(restaurant);
        return "Restaurant Added Successfully";
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        return repository.findAll();
    }
}
