package com.alexey.patterns.observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ITHILLEL6 on 31.07.2015.
 */
public class MyButtonListlener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked");
    }
}
