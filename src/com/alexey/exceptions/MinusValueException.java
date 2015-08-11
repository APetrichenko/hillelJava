package com.alexey.exceptions;

/**
 * Created by NewClass7 on 11.08.2015.
 */
public class MinusValueException extends RuntimeException {

    public MinusValueException(){
        super();
    }
    public MinusValueException(String message){
        super(message);
    }
}
