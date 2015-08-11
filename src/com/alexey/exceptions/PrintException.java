package com.alexey.exceptions;

import java.io.IOException;

/**
 * Created by NewClass7 on 11.08.2015.
 */
public class PrintException extends Exception{

    public PrintException(){
        super();
    }
    public PrintException(String message){
        super(message);
    }

    public PrintException(String s, IOException e) {
    }
}
