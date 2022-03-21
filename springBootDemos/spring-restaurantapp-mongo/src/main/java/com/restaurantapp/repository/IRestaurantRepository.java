package com.restaurantapp.repository;


import com.restaurantapp.exceptions.RestaurantNotFoundException;
import com.restaurantapp.model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRestaurantRepository extends MongoRepository<Restaurant , Integer>{
    List<Restaurant> getByName(String restaurantName);
     List<Restaurant> getAllRestaurants();
    List<Restaurant> getByBudget(double budget) throws RestaurantNotFoundException;
    List<Restaurant> getByService(int serviceSinceYears) throws RestaurantNotFoundException;
    List<Restaurant> getByArea(String area) throws RestaurantNotFoundException;
    List<Restaurant> getByBudgetAndArea(String area, double budget) throws RestaurantNotFoundException;
    List<Restaurant> getByGroupCabinAndBudget(boolean groupCabin , double budget) throws RestaurantNotFoundException;
    List<Restaurant> getByRating(float restaurantRating) throws RestaurantNotFoundException;
    List<Restaurant> getByGroupCabin(boolean groupCabin) throws RestaurantNotFoundException;


    List<Restaurant> getByCuisineAndRating(String cuisine, float restaurantRating);
}
