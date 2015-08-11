package com.alexey.exceptions;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by NewClass7 on 11.08.2015.
 */
public class IoUtils {
    private IoUtils(){}

    public static void closeWriter(FileWriter writer) throws PrintException {
        try {
            if(writer != null){
                writer.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
            throw new PrintException("not closed", e );
        }
    }


}
