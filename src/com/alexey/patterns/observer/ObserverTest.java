package com.alexey.patterns.observer;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by ITHILLEL6 on 31.07.2015.
 */
public class ObserverTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Observer test");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton button = new JButton("Click!");
        ActionListener listener = new MyButtonListlener();
        button.addActionListener(listener);
        ActionListener textChanger = new TextChanger(button);
        button.addActionListener(textChanger);
        frame.getContentPane().add(button);

        frame.setResizable(false);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
