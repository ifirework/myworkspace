package com.d.designDemo.observer.get.jframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2017/7/13.
 */
public class JframeDemo {

    private JFrame frame ;

    public static void main(String[] args) {
        JframeDemo jframeDemo = new JframeDemo();
        jframeDemo.go();
    }

    public void  go(){
        frame = new JFrame();
        JButton jButton = new JButton("Should i do it?");
        jButton.addActionListener(new angleListener());
        jButton.addActionListener(new monsterListener());

        frame.getContentPane().add(BorderLayout.CENTER,jButton) ;

    }

    class angleListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it!!!");
        }
    }

    class monsterListener implements  ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Just do it!!!");
        }
    }


}
