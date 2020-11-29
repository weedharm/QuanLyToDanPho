package com.mycompany.finalui.UI;
import javax.swing.*;

import com.mycompany.finalui.entity.CanBo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JPanel {

    public Login() {
        initComponents();
    }

    private void initComponents() {

        leftPanel = new JPanel();
        jLabel5 = new JLabel();
        jLabel1 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jSeparator6 = new JSeparator();
        labelPassword = new JLabel();
        labelSignIn = new JLabel();
        jSeparator4 = new JSeparator();
        inputPassword = new JPasswordField();
        inputUsername = new JTextField();
        jSeparator5 = new JSeparator();
        labelUsername = new JLabel();
        jSeparator7 = new JSeparator();
        buttonLogin = new JButton();
        buttonForgot = new JButton();

        setBackground(new Color(36, 47, 65));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftPanel.setBackground(new Color(97, 212, 195));

        jLabel1.setFont(new Font("Century Gothic", 0, 18)); 
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("Wellcome to HUST");

        jLabel7.setFont(new Font("Century Gothic", 0, 18)); 
        jLabel7.setForeground(new Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel7.setText("One love, one future");

        jLabel8.setIcon(new ImageIcon("icon\\taixuong.png")); 

        GroupLayout leftPanelLayout = new GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(leftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5))
                    .addComponent(jSeparator6, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addGroup(leftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel5))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        add(leftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 460));

        labelPassword.setFont(new Font("Century Gothic", 0, 16)); 
        labelPassword.setForeground(new Color(255, 255, 255));
        labelPassword.setText("Password");
        add(labelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 171, 40));

        labelSignIn.setFont(new Font("Century Gothic", 0, 16)); 
        labelSignIn.setForeground(new Color(255, 255, 255));
        labelSignIn.setText("Sign in");
        add(labelSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 60, 50));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 260, 10));

        inputPassword.setBackground(new Color(36, 47, 65));
        inputPassword.setForeground(new Color(255, 255, 255));
        inputPassword.setText("jPasswordField1");
        inputPassword.setBorder(null);
        inputPassword.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                inputPasswordActionPerformed(evt);
            }
        });
        add(inputPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 260, 20));

        inputUsername.setBackground(new Color(36, 47, 65));
        inputUsername.setFont(new Font("Century Gothic", 0, 12)); 
        inputUsername.setForeground(new Color(255, 255, 255));
        inputUsername.setText("Username");
        inputUsername.setBorder(null);
        inputUsername.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                inputUsernameActionPerformed(evt);
            }
        });
        add(inputUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 260, 20));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 189, 10));

        labelUsername.setFont(new Font("Century Gothic", 0, 16)); 
        labelUsername.setForeground(new Color(255, 255, 255));
        labelUsername.setText("Username:");
        add(labelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 171, 40));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 260, 10));

        buttonLogin.setBackground(new Color(36, 47, 65));
        buttonLogin.setFont(new Font("Century Gothic", 0, 18)); 
        buttonLogin.setForeground(new Color(255, 255, 255));
        buttonLogin.setText("Login");
        buttonLogin.setBorder(null);
        buttonLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        add(buttonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 80, 30));

        buttonForgot.setBackground(new Color(36, 47, 65));
        buttonForgot.setFont(new Font("Century Gothic", 0, 12)); 
        buttonForgot.setForeground(new Color(255, 255, 255));
        buttonForgot.setText("Forgot password, click here.");
        buttonForgot.setBorder(null);
        buttonForgot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                buttonForgotActionPerformed(evt);
            }
        });
        add(buttonForgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, -1, 30));
    }

    private void inputPasswordActionPerformed(ActionEvent evt) {

    }

    private void inputUsernameActionPerformed(ActionEvent evt) {
    }

    private void buttonLoginActionPerformed(ActionEvent evt) {

    }

    private void buttonForgotActionPerformed(ActionEvent evt) {

    }


    private JButton buttonForgot;
    private JButton buttonLogin;
    private JPasswordField inputPassword;
    private JTextField inputUsername;
    private JLabel jLabel1;
    private JLabel jLabel5;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JSeparator jSeparator4;
    private JSeparator jSeparator5;
    private JSeparator jSeparator6;
    private JSeparator jSeparator7;
    private JLabel labelPassword;
    private JLabel labelSignIn;
    private JLabel labelUsername;
    private JPanel leftPanel;
    
	public JButton getButtonForgot() {
		return buttonForgot;
	}

	public JButton getButtonLogin() {
		return buttonLogin;
	}

	public JPasswordField getInputPassword() {
		return inputPassword;
	}

	public JTextField getInputUsername() {
		return inputUsername;
	}
    
    
}
