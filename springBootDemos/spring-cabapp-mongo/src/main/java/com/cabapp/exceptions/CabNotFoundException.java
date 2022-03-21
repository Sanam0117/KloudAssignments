package com.cabapp.exceptions;

public class CabNotFoundException extends Exception{
    public CabNotFoundException(){
        super();
    }
    public CabNotFoundException(String message){
        super(message);
    }
}
