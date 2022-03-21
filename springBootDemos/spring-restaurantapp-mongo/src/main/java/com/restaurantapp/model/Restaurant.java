package com.restaurantapp.model;
import lombok.*;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document
public class Restaurant{

    private String restaurantName;
    private float restaurantRating;
    private String area;
    private boolean groupCabin;
    private double budget;
    private String cuisine;
    private int servicesSinceYears;

}
