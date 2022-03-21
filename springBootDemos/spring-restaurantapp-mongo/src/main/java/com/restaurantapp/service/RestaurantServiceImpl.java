package com.restaurantapp.service;

import com.restaurantapp.exceptions.RestaurantNotFoundException;
import com.restaurantapp.model.Restaurant;
import com.restaurantapp.repository.IRestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RestaurantServiceImpl implements IRestaurantService {
    private IRestaurantRepository restaurantRepository;
@Autowired
    public void setDoctorRepository(IRestaurantRepository doctorRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public List<Restaurant> getAllRestaurants() {

        return restaurantRepository.findAll();

    }
    @Override
    public List<Restaurant> getByName(String restaurantName) throws RestaurantNotFoundException {
        List<Restaurant> restaurant = restaurantRepository.getByName(restaurantName);
        if(restaurant.isEmpty())
            throw new RestaurantNotFoundException("No Restaurant with name"+ restaurantName +"found");
        return restaurant;
    }



    @Override
    public List<Restaurant> getByBudget(double budget) throws RestaurantNotFoundException {
        List<Restaurant> restaurant= restaurantRepository.getByBudget(budget);
        if(restaurant.isEmpty())
            throw new RestaurantNotFoundException("Restaurant of budget"+ budget +"are not available");
        return restaurant;
    }

//    @Override
//    public List<Restaurant> getByCuisine(String[] cuisine) throws RestaurantNotFoundException {
//
//        return null;
//    }

    @Override
    public List<Restaurant> getByService(int serviceSinceYears) throws RestaurantNotFoundException {
        List<Restaurant> restaurant= restaurantRepository.getByService(serviceSinceYears);
        if(restaurant.isEmpty())
            throw new RestaurantNotFoundException("Restaurants of"+ serviceSinceYears+"years service are not available");
        return restaurant;
    }

    @Override
    public List<Restaurant> getByArea(String area) throws RestaurantNotFoundException {
        List<Restaurant> restaurant= restaurantRepository.getByArea(area);
        if(restaurant.isEmpty())
            throw new RestaurantNotFoundException("We have not found any restaurants in"+  area);
        return restaurant;
    }

    @Override
    public List<Restaurant> getByGroupCabin(boolean groupCabin) throws RestaurantNotFoundException {
        List<Restaurant> restaurant= restaurantRepository.getByGroupCabin(groupCabin);
        if(restaurant.isEmpty())
            throw new RestaurantNotFoundException("GroupCabin is not available i this restaurant");
        return restaurant;
    }

    @Override
    public List<Restaurant> getByRating(float restaurantRating) throws RestaurantNotFoundException {
        List<Restaurant> restaurant= restaurantRepository.getByRating(restaurantRating);
        if(restaurant.isEmpty())
            throw new RestaurantNotFoundException("Restaurants with this rating are  not available");
        return restaurant;
    }

    @Override
    public List<Restaurant> getByBudgetAndArea(String area, double budget) throws RestaurantNotFoundException {
        List<Restaurant> restaurants= restaurantRepository.getByBudgetAndArea(area,budget);
        if(restaurants.isEmpty())
            throw new RestaurantNotFoundException("Restaurants with this Budget in this area are not available");
        return restaurants;
    }

    @Override
    public List<Restaurant> getByGroupCabinAndBudget(boolean groupCabin, double budget) throws RestaurantNotFoundException {
        List<Restaurant> restaurants= restaurantRepository.getByGroupCabinAndBudget(groupCabin,budget);
        if(restaurants.isEmpty())
            throw new RestaurantNotFoundException("Restaurant with Group Cabins and this budget are not available");
        return restaurants;
    }

  @Override
    public List<Restaurant> getByCuisineAndRating(String cuisine, float restaurantRating) throws RestaurantNotFoundException {
      List<Restaurant> restaurants= restaurantRepository.getByCuisineAndRating("chinese",4.5F);
      if(restaurants.isEmpty())
          throw new RestaurantNotFoundException("Restaurant with chinese cuisine and this rating are not available");
        return restaurants;
    }
}
