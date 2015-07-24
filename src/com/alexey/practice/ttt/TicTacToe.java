package com.alexey.practice.ttt;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 * Created by Alexey on 7/24/15.
 */


class TicTacToe extends Frame{

    private Button[] b = new Button[9];
    private boolean tlabel = false;
    private String label = "X";
    private TextArea ta;
    private Button butRestart;
    private int round = 0;
    private boolean step = true;

    TicTacToe(){
        setTitle("Êðåñòèêè-ãðîá... íîëèêè");
        setLayout(new BorderLayout());
        setFont(new Font("Times New Roman", Font.BOLD, 50));

        Panel panel = new Panel();
        panel.setSize(500, 500);
        panel.setLayout(new GridLayout(3, 3, 3, 3));

        for (int buttons = 0; buttons < b.length; buttons++){
            b[buttons] = new Button();
            b[buttons].setSize(50, 50);
            b[buttons].setActionCommand("" + buttons);
            panel.add(b[buttons]);

            b[buttons].addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    String stringActionCommand = ae.getActionCommand();
                    Integer intActionCommand = Integer.parseInt(stringActionCommand);
                    if (b[intActionCommand].getLabel() == "" && step == true){
                        b[intActionCommand].setLabel(label);
                        step = false;
                    }
                }
            });
        }

        add(panel, BorderLayout.NORTH);

        ta = new TextArea();
        ta.setEditable(false);
        ta.setFont(new Font("Times New Roman", Font.BOLD, 12));
        ta.setBounds(0, 150, 150, 150);
        add(ta, BorderLayout.CENTER);

        butRestart = new Button("Ïåðåçàïóñê");
        butRestart.setFont(new Font("Times New Roman", Font.BOLD, 12));
        butRestart.setBounds(20, 300, 100, 30);
        add(butRestart, BorderLayout.SOUTH);

        butRestart.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent me){
                ta.setText(" ");
                ta.setText("");
                clearXandO();
                round = 0;
            }
        });

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

        setSize(200, 500);
        setVisible(true);

        while(true){
            result();
            enemyStep();
        }
    }

    public void clearXandO(){
        b[0].setLabel(""); b[1].setLabel(""); b[2].setLabel(""); b[3].setLabel("");
        b[4].setLabel(""); b[5].setLabel(""); b[6].setLabel(""); b[7].setLabel(""); b[8].setLabel("");
        step = true;
    }

    public void result(){
        if (b[0].getLabel() == "X" && b[1].getLabel() == "X" && b[2].getLabel() == "X" ||
                b[3].getLabel() == "X" && b[4].getLabel() == "X" && b[5].getLabel() == "X" ||
                b[6].getLabel() == "X" && b[7].getLabel() == "X" && b[8].getLabel() == "X" ||
                b[0].getLabel() == "X" && b[3].getLabel() == "X" && b[6].getLabel() == "X" ||
                b[1].getLabel() == "X" && b[4].getLabel() == "X" && b[7].getLabel() == "X" ||
                b[2].getLabel() == "X" && b[5].getLabel() == "X" && b[8].getLabel() == "X" ||
                b[0].getLabel() == "X" && b[4].getLabel() == "X" && b[8].getLabel() == "X" ||
                b[2].getLabel() == "X" && b[4].getLabel() == "X" && b[6].getLabel() == "X"){
            round += 1;
            ta.append(round + " ðàóíä, " + "X ïîáåäèëè!" + "\n");
            try{
                Thread.sleep(1000);
                clearXandO();
            }catch(InterruptedException ie){}
        }
        else if (b[0].getLabel() == "O" && b[1].getLabel() == "O" && b[2].getLabel() == "O" ||
                b[3].getLabel() == "O" && b[4].getLabel() == "O" && b[5].getLabel() == "O" ||
                b[6].getLabel() == "O" && b[7].getLabel() == "O" && b[8].getLabel() == "O" ||
                b[0].getLabel() == "O" && b[3].getLabel() == "O" && b[6].getLabel() == "O" ||
                b[1].getLabel() == "O" && b[4].getLabel() == "O" && b[7].getLabel() == "O" ||
                b[2].getLabel() == "O" && b[5].getLabel() == "O" && b[8].getLabel() == "O" ||
                b[0].getLabel() == "O" && b[4].getLabel() == "O" && b[8].getLabel() == "O" ||
                b[2].getLabel() == "O" && b[4].getLabel() == "O" && b[6].getLabel() == "O"){
            round += 1;
            ta.append(round + " ðàóíä, " + "O ïîáåäèëè!" + "\n");
            try{
                Thread.sleep(1000);
                clearXandO();
            }catch(InterruptedException ie){}
        }
        else if (b[0].getLabel() != "" && b[1].getLabel() != "" && b[2].getLabel() != "" &&
                b[3].getLabel() != "" && b[4].getLabel() != "" && b[5].getLabel() != "" &&
                b[6].getLabel() != "" && b[7].getLabel() != "" && b[8].getLabel() != ""){
            round += 1;
            ta.append(round + " ðàóíä, " + "íè÷üÿ!" + "\n");
            try{
                Thread.sleep(1000);
                clearXandO();
            }catch(InterruptedException ie){}
        }
    }

    public void enemyStep(){
        if (step == false){
            Random random = new Random();
            int stepRandom = random.nextInt(8);
            for (int i = 0; i < b.length; i++){ if (stepRandom == i && b[i].getLabel() != "") stepRandom = random.nextInt(8); }

            if (b[0].getLabel() == "O" && b[1].getLabel() == "O" && b[2].getLabel() == ""){ b[2].setLabel("O"); step = true; }
            else if (b[2].getLabel() == "O" && b[1].getLabel() == "O" && b[0].getLabel() == ""){ b[0].setLabel("O"); step = true; }
            else if (b[3].getLabel() == "O" && b[4].getLabel() == "O" && b[5].getLabel() == ""){ b[5].setLabel("O"); step = true; }
            else if (b[5].getLabel() == "O" && b[4].getLabel() == "O" && b[3].getLabel() == ""){ b[3].setLabel("O"); step = true; }
            else if (b[6].getLabel() == "O" && b[7].getLabel() == "O" && b[8].getLabel() == ""){ b[8].setLabel("O"); step = true; }
            else if (b[8].getLabel() == "O" && b[7].getLabel() == "O" && b[6].getLabel() == ""){ b[6].setLabel("O"); step = true; }
            else if (b[0].getLabel() == "O" && b[3].getLabel() == "O" && b[6].getLabel() == ""){ b[6].setLabel("O"); step = true; }
            else if (b[6].getLabel() == "O" && b[3].getLabel() == "O" && b[0].getLabel() == ""){ b[0].setLabel("O"); step = true; }
            else if (b[1].getLabel() == "O" && b[4].getLabel() == "O" && b[7].getLabel() == ""){ b[7].setLabel("O"); step = true; }
            else if (b[7].getLabel() == "O" && b[4].getLabel() == "O" && b[1].getLabel() == ""){ b[1].setLabel("O"); step = true; }
            else if (b[2].getLabel() == "O" && b[5].getLabel() == "O" && b[8].getLabel() == ""){ b[8].setLabel("O"); step = true; }
            else if (b[8].getLabel() == "O" && b[5].getLabel() == "O" && b[2].getLabel() == ""){ b[2].setLabel("O"); step = true; }
            else if (b[0].getLabel() == "O" && b[4].getLabel() == "O" && b[8].getLabel() == ""){ b[8].setLabel("O"); step = true; }
            else if (b[8].getLabel() == "O" && b[4].getLabel() == "O" && b[0].getLabel() == ""){ b[0].setLabel("O"); step = true; }
            else if (b[2].getLabel() == "O" && b[4].getLabel() == "O" && b[6].getLabel() == ""){ b[6].setLabel("O"); step = true; }
            else if (b[6].getLabel() == "O" && b[4].getLabel() == "O" && b[2].getLabel() == ""){ b[2].setLabel("O"); step = true; }
            else if (b[0].getLabel() == "O" && b[6].getLabel() == "O" && b[3].getLabel() == ""){ b[3].setLabel("O"); step = true; }
            else if (b[1].getLabel() == "O" && b[7].getLabel() == "O" && b[4].getLabel() == ""){ b[4].setLabel("O"); step = true; }
            else if (b[2].getLabel() == "O" && b[8].getLabel() == "O" && b[5].getLabel() == ""){ b[5].setLabel("O"); step = true; }
            else if (b[0].getLabel() == "O" && b[2].getLabel() == "O" && b[1].getLabel() == ""){ b[1].setLabel("O"); step = true; }
            else if (b[3].getLabel() == "O" && b[5].getLabel() == "O" && b[4].getLabel() == ""){ b[4].setLabel("O"); step = true; }
            else if (b[6].getLabel() == "O" && b[8].getLabel() == "O" && b[7].getLabel() == ""){ b[7].setLabel("O"); step = true; }
            else if (b[0].getLabel() == "O" && b[8].getLabel() == "O" && b[4].getLabel() == ""){ b[4].setLabel("O"); step = true; }
            else if (b[2].getLabel() == "O" && b[6].getLabel() == "O" && b[4].getLabel() == ""){ b[4].setLabel("O"); step = true; }

            else if (b[0].getLabel() == "X" && b[1].getLabel() == "X" && b[2].getLabel() == ""){ b[2].setLabel("O"); step = true; }
            else if (b[2].getLabel() == "X" && b[1].getLabel() == "X" && b[0].getLabel() == ""){ b[0].setLabel("O"); step = true; }
            else if (b[3].getLabel() == "X" && b[4].getLabel() == "X" && b[5].getLabel() == ""){ b[5].setLabel("O"); step = true; }
            else if (b[5].getLabel() == "X" && b[4].getLabel() == "X" && b[3].getLabel() == ""){ b[3].setLabel("O"); step = true; }
            else if (b[6].getLabel() == "X" && b[7].getLabel() == "X" && b[8].getLabel() == ""){ b[8].setLabel("O"); step = true; }
            else if (b[8].getLabel() == "X" && b[7].getLabel() == "X" && b[6].getLabel() == ""){ b[6].setLabel("O"); step = true; }
            else if (b[0].getLabel() == "X" && b[3].getLabel() == "X" && b[6].getLabel() == ""){ b[6].setLabel("O"); step = true; }
            else if (b[6].getLabel() == "X" && b[3].getLabel() == "X" && b[0].getLabel() == ""){ b[0].setLabel("O"); step = true; }
            else if (b[1].getLabel() == "X" && b[4].getLabel() == "X" && b[7].getLabel() == ""){ b[7].setLabel("O"); step = true; }
            else if (b[7].getLabel() == "X" && b[4].getLabel() == "X" && b[1].getLabel() == ""){ b[1].setLabel("O"); step = true; }
            else if (b[2].getLabel() == "X" && b[5].getLabel() == "X" && b[8].getLabel() == ""){ b[8].setLabel("O"); step = true; }
            else if (b[8].getLabel() == "X" && b[5].getLabel() == "X" && b[2].getLabel() == ""){ b[2].setLabel("O"); step = true; }
            else if (b[0].getLabel() == "X" && b[4].getLabel() == "X" && b[8].getLabel() == ""){ b[8].setLabel("O"); step = true; }
            else if (b[8].getLabel() == "X" && b[4].getLabel() == "X" && b[0].getLabel() == ""){ b[0].setLabel("O"); step = true; }
            else if (b[2].getLabel() == "X" && b[4].getLabel() == "X" && b[6].getLabel() == ""){ b[6].setLabel("O"); step = true; }
            else if (b[6].getLabel() == "X" && b[4].getLabel() == "X" && b[2].getLabel() == ""){ b[2].setLabel("O"); step = true; }
            else if (b[0].getLabel() == "X" && b[6].getLabel() == "X" && b[3].getLabel() == ""){ b[3].setLabel("O"); step = true; }
            else if (b[1].getLabel() == "X" && b[7].getLabel() == "X" && b[4].getLabel() == ""){ b[4].setLabel("O"); step = true; }
            else if (b[2].getLabel() == "X" && b[8].getLabel() == "X" && b[5].getLabel() == ""){ b[5].setLabel("O"); step = true; }
            else if (b[0].getLabel() == "X" && b[2].getLabel() == "X" && b[1].getLabel() == ""){ b[1].setLabel("O"); step = true; }
            else if (b[3].getLabel() == "X" && b[5].getLabel() == "X" && b[4].getLabel() == ""){ b[4].setLabel("O"); step = true; }
            else if (b[6].getLabel() == "X" && b[8].getLabel() == "X" && b[7].getLabel() == ""){ b[7].setLabel("O"); step = true; }
            else if (b[0].getLabel() == "X" && b[8].getLabel() == "X" && b[4].getLabel() == ""){ b[4].setLabel("O"); step = true; }
            else if (b[2].getLabel() == "X" && b[6].getLabel() == "X" && b[4].getLabel() == ""){ b[4].setLabel("O"); step = true; }

            else if (stepRandom == 0 && b[0].getLabel() == ""){ b[0].setLabel("O"); step = true; }
            else if (stepRandom == 1 && b[1].getLabel() == ""){ b[1].setLabel("O"); step = true; }
            else if (stepRandom == 2 && b[2].getLabel() == ""){ b[2].setLabel("O"); step = true; }
            else if (stepRandom == 3 && b[3].getLabel() == ""){ b[3].setLabel("O"); step = true; }
            else if (stepRandom == 4 && b[4].getLabel() == ""){ b[4].setLabel("O"); step = true; }
            else if (stepRandom == 5 && b[5].getLabel() == ""){ b[5].setLabel("O"); step = true; }
            else if (stepRandom == 6 && b[6].getLabel() == ""){ b[6].setLabel("O"); step = true; }
            else if (stepRandom == 7 && b[7].getLabel() == ""){ b[7].setLabel("O"); step = true; }
            else if (stepRandom == 8 && b[8].getLabel() == ""){ b[8].setLabel("O"); step = true; }
        }
    }

    public static void main(String[] args){
        new TicTacToe();
    }
}
