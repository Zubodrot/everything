package ru.isbo1016.chumakov.lab6;

import java.awt.*;
import java.awt.event.* ;
import javax.swing.*;
import java.math.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit.*;

public class GUI extends  JFrame{
    JPanel[] pnl = new JPanel[2];

    private int k = 0;
    private int randomnumber = 0;

    private JButton button = new JButton("Try!");
    private JTextField text = new JTextField(45);

    public GUI (){
        super("Лабораторная №6 Чукако Дмитрий");
        this.setSize(600,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,1));
        for(int i = 0 ; i < pnl.length ; i++)
        {
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(r,g,b));
            add(pnl[i]);
        }

        ////////////////////////
        pnl[0].add(button);
        pnl[1].add(text);

        ///////////////////
        randomnumber = (int)(Math.random()*21);

        ////////////////////////

        ActionListener actionListenerbut = new Clickbut ();
        button.addActionListener(actionListenerbut);

    }

    public class Clickbut implements ActionListener{

        public void actionPerformed(ActionEvent e){
            if (k < 4){


                if (randomnumber == Integer.valueOf(text.getText())) {
                    button.setEnabled(false);
                    text.setText("Вы угадали. Поздравляю!");
                    text.setEnabled(false);
                }
                else{
                    k = k + 1;
                    text.setText("Не угадали :( Попробуйте ещё! Попыток осталось: "+ (3-k));
                    /*Thread.sleep(5000);
                    text.setText("");*/
                }
            }
            else {
                text.setText("Попытки закончились:(");
                text.setEnabled(false);
                button.setEnabled(false);
            }
        }
    }


}
