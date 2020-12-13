package com.mycompany.finalui.connect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mycompany.finalui.entity.NhanKhau;

public class NhanKhauService {
	
	public static NhanKhau getDetailInformation(int id) {
		ConnectJDBCMySQL con = new ConnectJDBCMySQL();
		con.connectMySQL();
		NhanKhau nk = null;
		String sql = "SELECT * FROM NhanKhau WHERE ID = ?";
		try {
			PreparedStatement pre = con.getConnect().prepareStatement(sql);
			pre.setInt(1, id);
			ResultSet re = pre.executeQuery();
			if(re.next()) {
				nk = new NhanKhau();
				nk.setID(id);
				nk.setHoKhauID(re.getInt(2));
				nk.setQuanHe(re.getString(3));
				nk.setHoTen(re.getString(4));
				nk.setNgaySinh(re.getDate(5));
				nk.setGioiTinh(re.getInt(6) == 1?"Nam":"Nữ");
				nk.setNoiSinh(re.getString(7));
				nk.setNguyenQuan(re.getString(8));
				nk.setDanToc(re.getString(9));
				nk.setTonGiao(re.getInt(10) == 1);
				nk.setNgheNghiep(re.getString(11));
				nk.setCmnd(re.getString(12));
				return nk;
			}
		}catch(SQLException se) {
			se.printStackTrace();
		}
		return nk;
	}
	
}
