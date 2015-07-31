package com.alexey.patterns.observer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ITHILLEL6 on 31.07.2015.
 */
public class TextChanger implements ActionListener {
    JButton button;
    public TextChanger(JButton button){
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        button.setText("Clicked!!!!");
        button.setEnabled(false);
    }
}
