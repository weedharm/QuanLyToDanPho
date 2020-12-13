package com.mycompany.finalui.connect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mycompany.finalui.entity.CanBo;

public class CanBoService implements DatabaseService{
	
	public static CanBo getUserName(String username, String password) {
		ConnectJDBCMySQL con = new ConnectJDBCMySQL();
		con.connectMySQL();
		String sql = "select * from canbo where UserName = ? and Password = ?";
		CanBo cb = null;
		try {
			PreparedStatement pre = con.getConnect().prepareStatement(sql);
			pre.setString(1, username);
			pre.setString(2, password);
			ResultSet re = pre.executeQuery();
			if(re.next()) {
				cb = new CanBo();
				cb.setID(re.getInt("ID"));
				cb.setUserName(re.getString("UserName"));
				cb.setPassword(re.getString("Password"));
				cb.setHoTen(re.getString("HoTen"));
				cb.setChucVu(re.getString("ChucVu"));
			}
		}catch(SQLException se) {
			se.printStackTrace();
		}
		return cb;
	}

	@Override
	public ArrayList<?> getDataFromDatabase() {
		// TODO Auto-generated method stub
		return null;
	}

}
