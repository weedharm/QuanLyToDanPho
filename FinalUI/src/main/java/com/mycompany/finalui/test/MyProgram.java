package com.mycompany.finalui.test;


import javax.swing.UIManager;

import com.mycompany.finalui.UI.Home;
import com.mycompany.finalui.UI.LoginUI;
import com.mycompany.finalui.connect.ConnectJDBCMySQL;

public class MyProgram {

	public static void main(String[] args) {

		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception e) {
			e.printStackTrace();
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				LoginUI loginUI = new LoginUI();
				loginUI.showWindow();
			}
		});

	}



}
