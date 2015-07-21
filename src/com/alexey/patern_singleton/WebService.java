package com.alexey.patern_singleton;

/**
 * Created by ITHILLEL6 on 17.07.2015.
 */
public class WebService {
//eager
    private static WebService service = new WebService();

    private  WebService(){

    }
//lazy
    public static WebService getInstance(){
        if(service==null){
            service=new WebService();
        }
        return service;
    }

    public void  print(){
        System.out.println("Service");
    }
}
