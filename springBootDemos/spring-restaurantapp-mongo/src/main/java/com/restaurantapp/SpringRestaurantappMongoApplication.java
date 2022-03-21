package com.restaurantapp;

import com.restaurantapp.exceptions.RestaurantNotFoundException;
import com.restaurantapp.model.Restaurant;
import com.restaurantapp.service.IRestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SpringRestaurantappMongoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestaurantappMongoApplication.class, args);


	}

	@Autowired
	private IRestaurantService restaurantService;

	@Override
	public void run(String... args) throws Exception {
		Restaurant restaurant1 = new Restaurant();


//		System.out.println("By Area");
//		restaurantService.getByArea("marathahalli");
//		System.out.println("By Rating");
//		restaurantService.getByRating(4.5F);
//		System.out.println("By Years");
//		restaurantService.getByService(5);
//	}
//
//
//	@java.lang.Override
//	public void run(java.lang.String... args) throws Exception {
//
//	}
	}
}
