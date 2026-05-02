package com.klef.fsad.exam.service;

import com.klef.fsad.exam.model.Restaurant;
import java.util.List;

public interface RestaurantService {
    String addRestaurant(Restaurant restaurant);
    List<Restaurant> getAllRestaurants();
}
