package com.cabapp.repository;

import com.cabapp.exceptions.CabNotFoundException;
import com.cabapp.model.Cab;

import java.util.List;

public interface CabRepository{


    void addCabToFav(String cabCompany);
    void deleteCabFromFav(int cabNum);
    List<Cab> findAll();
    List<Cab> findCabByNum(int cabNum) throws CabNotFoundException;
    List<Cab> findByNumofSeats(int numOfSeats) throws CabNotFoundException;
    List<Cab> findByCompany(String cabCompany) throws CabNotFoundException;
    List<Cab> findByPrice(int cabPrice) throws CabNotFoundException;



}
