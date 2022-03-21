package com.cabapp.databaseconncetion;

import com.cabapp.model.Cab;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class DataBaseConnection {


    static MongoClient mongoClientInstance;

    public static void openDatabase() {
        String databaseurl="mongodb://localhost:27017";
        ConnectionString connection=new ConnectionString(databaseurl);
        CodecRegistry pojoCodecRegistry=fromProviders(PojoCodecProvider.builder().automatic(true).build());
        CodecRegistry codecRegistry=fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),pojoCodecRegistry);
        MongoClientSettings clientSettings=MongoClientSettings.builder().applyConnectionString(connection)
                .codecRegistry(codecRegistry).build();
        mongoClientInstance= MongoClients.create(clientSettings);
    }
    public static void closeConnection() {
        mongoClientInstance.close();
    }
    public MongoDatabase findDatabase() {
        MongoDatabase database=mongoClientInstance.getDatabase("Cab Services");
        return database;
    }
    public MongoCollection<Cab> findCollection() {
        MongoDatabase database=findDatabase();
		database.createCollection("cabsList");
        MongoCollection<Cab> collection=database.getCollection("cab",Cab.class);
        return collection;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
