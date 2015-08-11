package com.alexey.swing.swingmodern;

import com.alexey.oop_animals.Animal;
import com.alexey.oop_animals.Cat;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by NewClass7 on 07.08.2015.
 */
public class Test1 extends  JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public static void main(String[] args) {
        Test1 frame = new Test1();
        frame.setContentPane(frame.getPanel1());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

//        TreeSet<Animal> treeSet = new TreeSet<>(new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return 0;
//            }
//        });
//        treeSet.add(new Cat(1, 2, 43, "Black", "Murka", true));
//        treeSet.add(new Cat(2, 2, 43, "Black", "Koshka", true));
//        treeSet.add(3);
//        treeSet.add(4);

//        System.out.println(treeSet);
    }

    //Anonimnie classi
       public static void operate(JTextField field) {
//           ActionListener listener = new MyActionListener();
//    field.getActionListeners(new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            System.out.println("printed");
//        }
//        )
//    }
//}
}
}