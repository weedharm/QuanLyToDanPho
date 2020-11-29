/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalui.UI;

import javax.swing.JFrame;

import java.awt.EventQueue;
import java.awt.AWTError.*;
/**
 *
 * @author ducng
 */
public class Main extends JFrame {
    public Main() {
        initUI();
    }
    private void initUI() {
        SingleForm home = new SingleForm();
        add(home);
        setResizable(false);
        pack();
        
        setTitle("TEST");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        // call Single Form
    	EventQueue.invokeLater(() ->
        {
            Main t = new Main();
            t.setVisible(true);
        });

    	//call Home form
        Home home = new Home();
        home.main(args);
    }
}
