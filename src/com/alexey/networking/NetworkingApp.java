package com.alexey.networking;

import jdk.nashorn.api.scripting.URLReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by NewClass7 on 02.10.2015.
 */
public class NetworkingApp {
    public static void main(String[] args) {
        URL url = null;
        try {
            url = new URL("http://habrahabr.ru");
            Reader reader = new URLReader(url,"UTF-16");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
