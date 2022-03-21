package com.restaurantapp.service;

import com.restaurantapp.exceptions.RestaurantNotFoundException;
import com.restaurantapp.model.Restaurant;

import java.util.List;

public interface IRestaurantService {


    List<Restaurant> getByName(String restaurantName) throws RestaurantNotFoundException;
    List<Restaurant> getAllRestaurants();

    List<Restaurant> getByBudget(double budget) throws RestaurantNotFoundException;
    List<Restaurant> getByCuisine(String cuisine) throws RestaurantNotFoundException;
    List<Restaurant> getByService(int serviceSinceYears) throws RestaurantNotFoundException;
    List<Restaurant> getByArea(String area) throws RestaurantNotFoundException;
    List<Restaurant> getByGroupCabin(boolean groupCabin) throws RestaurantNotFoundException;
    List<Restaurant> getByRating(float restaurantRating) throws RestaurantNotFoundException;
    List<Restaurant> getByBudgetAndArea(String area, double budget) throws RestaurantNotFoundException;
    List<Restaurant> getByGroupCabinAndBudget(boolean groupCabin , double budget) throws RestaurantNotFoundException;
    List<Restaurant> getByCuisineAndRating(String[] cuisine, float restaurantRating) throws RestaurantNotFoundException;






}
