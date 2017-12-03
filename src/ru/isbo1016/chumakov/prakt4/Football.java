package ru.isbo1016.chumakov.prakt4;

import java.awt.*;
import java.awt.event.* ;
import javax.swing.*;

public class Football extends JFrame{
    private int milan;
    private int madrid;

    JPanel[] pnl = new JPanel[6];
    private JButton Milbutton = new JButton("AC Milan");
    private JButton Madbutton = new JButton("Real Madrid");
    private JLabel result = new JLabel("Result: " + milan + " X " + madrid);
    private JLabel lastScore = new JLabel("Last Scorer: NaN");
    private JLabel winner = new JLabel("Winner DRAW");

    public Football(){
        super("Практическая №4 Чумаков Дмитрий ИСБО-10-16");
        this.setSize(600,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,2));
        for(int i = 0 ; i < pnl.length ; i++)
        {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }

        //////////////////////////////// добавление элементов

        pnl[0].add(Milbutton);
        pnl[1].add(Madbutton);
        pnl[2].add(result);
        pnl[3].add(lastScore);
        pnl[4].add(winner);


        ///////////////////////////////////// создание обработчика событий для кнопок

        ActionListener   actionListenerMil = new Milanscored();
        ActionListener actionListenerMad = new Madridscored();
        Milbutton.addActionListener(actionListenerMil);
        Madbutton.addActionListener(actionListenerMad);

    }


    public class Milanscored implements ActionListener{
        public void actionPerformed(ActionEvent e){
            milan++;
            result.setText("Result: " + milan + " X " + madrid);
            lastScore.setText("Last Scorer: AC Milan");
            Winner();

        }
    }

    public class Madridscored implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            madrid++;
            result.setText("Result: " + milan + " X " + madrid);
            lastScore      .setText("Last Scorer: Real Madrid");
            Winner();
        }

    }

    public void Winner(){
        if (milan - madrid == 2)
        {
            winner.setText("Milan AC won!");
            Milbutton .setEnabled(false);
            Madbutton.setEnabled(false);
        }
        else if (madrid - milan == 2){
            winner.setText("Real Madrid won!");
            Milbutton .setEnabled(false);
            Madbutton.setEnabled(false);
        }
    }
}
