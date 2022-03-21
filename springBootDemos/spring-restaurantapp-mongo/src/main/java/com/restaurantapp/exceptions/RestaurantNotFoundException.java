package com.restaurantapp.exceptions;

public class RestaurantNotFoundException extends RuntimeException{
    public    RestaurantNotFoundException(){

        super();
    }
    public RestaurantNotFoundException(String message){
        super(message);
    }


}
