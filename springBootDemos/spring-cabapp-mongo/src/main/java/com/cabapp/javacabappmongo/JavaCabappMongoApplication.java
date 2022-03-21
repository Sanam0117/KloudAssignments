package com.cabapp.javacabappmongo;

import java.util.List;


import com.cabapp.databaseconncetion.DataBaseConnection;
import com.cabapp.model.Cab;
import com.cabapp.repository.CabRepositoryImpl;


public class JavaCabappMongoApplication {

	public static void main(String[] args) {
        DataBaseConnection.openDatabase();
             displayCabs();
             showCabWith("AP");
		DataBaseConnection.closeConnection();
}
public static void displayCabs(){
		CabRepositoryImpl obj=new CabRepositoryImpl();
		List<Cab> list=obj.findAll();
		list.stream().forEach(System.out::println);
}
public static void showCabWith(String regState){
	CabRepositoryImpl obj=new CabRepositoryImpl();
	List<Cab> list=obj.findAll();
	list.stream().forEach(System.out::println);
}















}