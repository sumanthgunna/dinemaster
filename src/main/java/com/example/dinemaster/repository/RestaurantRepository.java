/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.dinemaster.repository;

import java.util.*;
import com.example.dinemaster.model.Restaurant;

public interface RestaurantRepository {
    ArrayList<Restaurant> getRestaurants();

    Restaurant getRestaurantById(int restaurantId);

    Restaurant addRestaurant(Restaurant restaurant);

    Restaurant updateRestaurant(int restaurantId, Restaurant restaurant);

    void deleteRestaurant(int restaurantId);
}