package com.karthikprojects.Exceptions;

/*This exception is used whenever the Album Key is not present in Album */
public class KeyNotFoundException extends Exception{
    public KeyNotFoundException(String Message){
        super(Message);
    }

}
