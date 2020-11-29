package com.mycompany.finalui.UI;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.mycompany.finalui.connect.CanBoService;
import com.mycompany.finalui.entity.CanBo;

public class LoginUI extends JFrame {
	public static int idCanBo = 0;
	Login login = new Login();
	
	public LoginUI() {
		super("Quản lý bệnh nhân");
		addControl();
		addEvent();
	}


	private void addEvent() {
		login.getButtonLogin().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				handlingLogin();
			}
		});
	}


	protected void handlingLogin() {
		CanBo cb = CanBoService.getUserName(login.getInputUsername().getText().trim(), String.valueOf(login.getInputPassword().getPassword()));
		if(cb == null) {
			JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu sai!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Đăng nhập thành công!");
			idCanBo = cb.getID();
			this.dispose();
			Home home = new Home();
			home.showWindow();
		}
	}


	private void addControl() {
		Container con = getContentPane();
		con.add(login);
	}

	public void showWindow() {
		this.setSize(600,490);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosed(WindowEvent e) {
				super.windowClosed(e);
			}
			
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				int re = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thoát?");
				if(re == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		this.setVisible(true);
		this.setResizable(false);
	}
}
