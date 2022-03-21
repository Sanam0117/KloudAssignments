package com.cabapp.repository;

import com.cabapp.databaseconncetion.DataBaseConnection;
import com.cabapp.exceptions.CabNotFoundException;
import com.cabapp.model.Cab;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;
import lombok.val;
import org.bson.conversions.Bson;
import org.springframework.data.mongodb.util.BsonUtils;

import java.util.stream.Collectors;


import java.util.ArrayList;
import java.util.List;

import static java.util.Locale.filter;

public class CabRepositoryImpl implements CabRepository {
    DatabaseConnection dbManager = new DataBaseConnection();

    private Object cabNum;
    Bson filter = Filters.eq("cabNum", cabNum);
    private MongoCollection<Object> collection;
    DeleteResult result = collection.deleteOne(filter);



    @Override
    public List<Cab> findByNumofSeats(int numOfSeats) throws CabNotFoundException {
        MongoCollection<Cab> collection = dbManager.findCollection();
        List<Cab> list = collection.find(Filters.eq("4", numOfSeats)).into(new ArrayList<>());
        if(list.isEmpty()) {
            throw new CabNotFoundException("Cab with this no of seats are  not found");
        }
        return list;


    }

    @Override
    public void addCabToFav(String cabCompany) {

    }

    @Override
    public void deleteCabFromFav(int cabNum) {

    }

    @Override
    public List<Cab> findAll() {
        MongoCollection<Cab> collection = dbManager.findCollection();
      List<Cab> allCabsList = collection.find().into(new ArrayList<>());
        return allCabsList;
    }

    @Override
    public List<Cab> findCabByNum(int cabNum) throws CabNotFoundException {
        return null;
    }

    @Override
    public List<Cab> findByCompany(String cabCompany) throws CabNotFoundException {
        MongoCollection<Cab> collection = dbManager.findCollection();
        List<Cab> list = collection.find(Filters.eq("Verito", cabCompany)).into(new ArrayList<>());

        return list;
    }

    @Override
    public List<Cab> findByPrice(int cabPrice) throws CabNotFoundException {
        MongoCollection<Cab> collection = dbManager.findCollection();
        List<Cab> list = collection.find(Filters.eq("500", cabPrice)).into(new ArrayList<>());


        return list;
    }


}
