package com.alexey.patterns.patern_singleton;

/**
 * Created by ITHILLEL6 on 17.07.2015.
 */
public class App {
    public static void main(String[] args) {
        WebService service = WebService.getInstance();
        service.print();
    }
}
