package com.mycompany.finalui.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectJDBCMySQL {
	private static final String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/quanlytodanpho?useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	
	private Connection connect;
	private Properties properties;
	
	public Connection getConnect() {
		return this.connect;
	}
	
	private Properties getProperties() {
		if(this.properties == null) {
			properties = new Properties();
			properties.setProperty("user", USERNAME);
			properties.setProperty("password", PASSWORD);
		}
		return this.properties;
	}
	
	public void connectMySQL() {
		try {
			Class.forName(DATABASE_DRIVER);
			this.connect = DriverManager.getConnection(DATABASE_URL, getProperties());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void disconnect() {
		if(this.connect != null) {
            try {
                connect.close();
                connect = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
		}
	}
}
