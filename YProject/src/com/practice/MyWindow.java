package com.practice;

import javax.security.auth.login.AccountLockedException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MyWindow extends JFrame {

    private JLabel heading;
    private JLabel clockLabel;
    private Font font=new Font("",Font.BOLD,35);  //1st font family 2nd font style 3rd font size

    MyWindow()
    {
        super.setTitle("My clock");
        super.setSize(1000,800);
        super.setLocation(300,50);
        this.createGUI();
        this.StartClock();
        super.setVisible(true);
    }

    public void createGUI()
    {
        heading =new JLabel("Don't watch the clock; do what it does. Keep going.");
        clockLabel=new JLabel("clock");
        heading.setFont(font);
        clockLabel.setFont(font);
        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLabel);


    }

    public void StartClock()
    {
        Timer timer=new Timer(1000, new ActionListener() { //time starts it will call actionListener method per sec
            @Override
            public void actionPerformed(ActionEvent e) {

//                String DateTime=new Date().toString();
                String DateLocalTime=new Date().toLocaleString();
//                clockLabel.setText(DateTime);
                clockLabel.setText(DateLocalTime);
            }
        });
        timer.start();
    }
}
