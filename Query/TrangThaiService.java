package com.mycompany.finalui.connect;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

import com.mycompany.finalui.entity.NhanKhau;
import com.mycompany.finalui.entity.TrangThai;
import com.mycompany.finalui.usefulfunction.DateConverter;
import com.mysql.cj.conf.ConnectionUrlParser.Pair;

public class TrangThaiService implements DatabaseService {

	private int id;
	static ConnectJDBCMySQL con = new ConnectJDBCMySQL();
	public TrangThaiService(int id) {
		this.id = id;
		con.connectMySQL();
	}

	@Override
	public ArrayList<TrangThai> getDataFromDatabase() {
		// TODO Auto-generated method stub
		ArrayList<TrangThai> dsTTNhanKhau = new ArrayList<TrangThai>();
		String sqlQuery = "select * from TrangThai tt inner join QuanLy ql where tt.IDNhanKhau = ql.IDNhanKhau and ql.IDCanBoYTe = ?";
		try {
			PreparedStatement preStatement = con.getConnect().prepareStatement(sqlQuery);
			preStatement.setInt(1, this.id);
			ResultSet re = preStatement.executeQuery();
			while(re.next()) {
				TrangThai t = new TrangThai();
				t.setIdNhanKhau(re.getInt(1));
				t.setTtkb(re.getString(2));
				t.setTtsk(re.getString(3));
				t.setThoiGianCachLy(re.getTimestamp(4));
				t.setMucDoCachLy(re.getString(5));
				t.setTestCovid(re.getString(6));
				t.setHinhThuc(re.getString(7));
				t.setThoiDiem(re.getTimestamp(8));
				t.setKetQua(re.getString(9));
				t.setLichTrinh(re.getString(10));
				dsTTNhanKhau.add(t);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dsTTNhanKhau;
	}

	public static NhanKhau getNhanKhau(int id){
		String sql1 = "select * from NhanKhau where ID = ?";
		NhanKhau nk = null;
		try {
			PreparedStatement pre1 = con.getConnect().prepareStatement(sql1);
			pre1.setInt(1, id);
			ResultSet re1 = pre1.executeQuery();
			if(re1.next()) {
				nk = new NhanKhau();
				nk.setID(re1.getInt(1));
				nk.setHoKhauID(re1.getInt(2));
				nk.setQuanHe(re1.getString(3));
				nk.setHoTen(re1.getString(4));
				nk.setNgaySinh(re1.getDate(5));
				nk.setGioiTinh(re1.getInt(6) == 1?"Nam":"Nữ");
				nk.setNoiSinh(re1.getString(7));
				nk.setNguyenQuan(re1.getString(8));
				nk.setDanToc(re1.getString(9));
				nk.setTonGiao(re1.getInt(10) == 1);
				nk.setNgheNghiep(re1.getString(11));
				nk.setCmnd(re1.getString(12));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nk;
	}

	public static TrangThai getTrangThai(int id, String testCovid){
		String sql2 = "select * from TrangThai where IDNhanKhau = ? and TestCovid19 = ?";
		TrangThai t = null;
		try {
			PreparedStatement pre2 = con.getConnect().prepareStatement(sql2);
			pre2.setInt(1, id);
			pre2.setString(2, testCovid);
			ResultSet re2 = pre2.executeQuery();
			if(re2.next()) {
				t = new TrangThai();
				t.setIdNhanKhau(re2.getInt(1));
				t.setTtkb(re2.getString(2));
				t.setTtsk(re2.getString(3));
				t.setThoiGianCachLy(re2.getTimestamp(4));
				t.setMucDoCachLy(re2.getString(5));
				t.setTestCovid(re2.getString(6));
				t.setHinhThuc(re2.getString(7));
				t.setThoiDiem(re2.getTimestamp(8));
				t.setKetQua(re2.getString(9));
				t.setLichTrinh(re2.getString(10));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}


	public static int insertTrangThai(TrangThai t) {
		boolean existTrangThai = false;
		String sqlCheck1 = "select * from TrangThai where IDNhanKhau = ? and TestCovid19 = ?";
		try {
			PreparedStatement pre = con.getConnect().prepareStatement(sqlCheck1);
			pre.setInt(1, t.getIdNhanKhau());
			pre.setString(2, t.getTestCovid());
			existTrangThai = pre.executeQuery().next();
		}catch(Exception e) {
			e.printStackTrace();
		}

		if(existTrangThai == false) {
			String sql = "insert into TrangThai values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			try {
				PreparedStatement preStm = con.getConnect().prepareStatement(sql);
				preStm.setInt(1, t.getIdNhanKhau());
				preStm.setString(2, t.getTtkb());
				preStm.setString(3, t.getTtsk());
				preStm.setString(4, DateConverter.dateSQL(t.getThoiGianCachLy()));
				preStm.setString(5, t.getMucDoCachLy());
				preStm.setString(6, t.getTestCovid());
				preStm.setString(7, t.getHinhThuc());
				preStm.setString(8, DateConverter.dateSQL(t.getThoiDiem()));
				preStm.setString(9, t.getKetQua());
				preStm.setString(10, t.getLichTrinh());
				return preStm.executeUpdate();
			}catch(SQLException se) {
				se.printStackTrace();
			}
		}
		return -1;
	}

	public static int deleteTrangThai(int id, String testCovid) {
		String sql2 = "delete from TrangThai where IDNhanKhau = ? and TestCovid19 = ?";
		TrangThai t = null;
		try {
			PreparedStatement pre2 = con.getConnect().prepareStatement(sql2);
			pre2.setInt(1, id);
			pre2.setString(2, testCovid);
			return pre2.executeUpdate();
		}catch(SQLException se) {
			se.printStackTrace();
		}
		return -1;
	}

	public static int updateTrangThai(TrangThai t) {
		boolean existTrangThai = false;
		String sqlCheck1 = "select * from TrangThai where IDNhanKhau = ? and TestCovid19 = ?";
		try {
			PreparedStatement pre = con.getConnect().prepareStatement(sqlCheck1);
			pre.setInt(1, t.getIdNhanKhau());
			pre.setString(2, t.getTestCovid());
			existTrangThai = pre.executeQuery().next();
		}catch(Exception e) {
			e.printStackTrace();
		}

		if(existTrangThai == true) {
			String sql = "UPDATE TrangThai SET TTKB = ?, TTSK = ?, 	ThoiGianCachLy = ?, MucDoCachLy = ?, "
					+ "HinhThuc = ?, ThoiDiem = ?, KetQua = ?, LichTrinh = ? WHERE IDNhanKhau = ? AND TestCovid19 = ?";
			try {
				PreparedStatement preStm = con.getConnect().prepareStatement(sql);
				preStm.setInt(9, t.getIdNhanKhau());
				preStm.setString(1, t.getTtkb());
				preStm.setString(2, t.getTtsk());
				preStm.setString(3, DateConverter.dateSQL(t.getThoiGianCachLy()));
				preStm.setString(4, t.getMucDoCachLy());
				preStm.setString(10, t.getTestCovid());
				preStm.setString(5, t.getHinhThuc());
				preStm.setString(6, DateConverter.dateSQL(t.getThoiDiem()));
				preStm.setString(7, t.getKetQua());
				preStm.setString(8, t.getLichTrinh());
				return preStm.executeUpdate();
			}catch(SQLException se) {
				se.printStackTrace();
			}
		}
		else {
			return -1;
		}
		return -2;
	}

	public ArrayList<TrangThai> filter(String infor, int x) {
		ArrayList<TrangThai> dsTTNhanKhau = new ArrayList<TrangThai>();
		if(x == 1) {
			String sqlQuery = "select * from TrangThai tt inner join QuanLy ql where tt.IDNhanKhau = ql.IDNhanKhau "
					+ "and ql.IDCanBoYTe = ? and tt.KetQua = ?";
			try {
				PreparedStatement preStatement = con.getConnect().prepareStatement(sqlQuery);
				preStatement.setInt(1, this.id);
				preStatement.setString(2, infor);
				ResultSet re = preStatement.executeQuery();
				while(re.next()) {
					TrangThai t = new TrangThai();
					t.setIdNhanKhau(re.getInt(1));
					t.setTtkb(re.getString(2));
					t.setTtsk(re.getString(3));
					t.setThoiGianCachLy(re.getTimestamp(4));
					t.setMucDoCachLy(re.getString(5));
					t.setTestCovid(re.getString(6));
					t.setHinhThuc(re.getString(7));
					t.setThoiDiem(re.getTimestamp(8));
					t.setKetQua(re.getString(9));
					t.setLichTrinh(re.getString(10));
					dsTTNhanKhau.add(t);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return dsTTNhanKhau;
		}
		else if(x == 2) {
			String sqlQuery = "select * from TrangThai tt inner join QuanLy ql where tt.IDNhanKhau = ql.IDNhanKhau "
					+ "and ql.IDCanBoYTe = ? and tt.HinhThuc = ?";
			try {
				PreparedStatement preStatement = con.getConnect().prepareStatement(sqlQuery);
				preStatement.setInt(1, this.id);
				preStatement.setString(2, infor);
				ResultSet re = preStatement.executeQuery();
				while(re.next()) {
					TrangThai t = new TrangThai();
					t.setIdNhanKhau(re.getInt(1));
					t.setTtkb(re.getString(2));
					t.setTtsk(re.getString(3));
					t.setThoiGianCachLy(re.getTimestamp(4));
					t.setMucDoCachLy(re.getString(5));
					t.setTestCovid(re.getString(6));
					t.setHinhThuc(re.getString(7));
					t.setThoiDiem(re.getTimestamp(8));
					t.setKetQua(re.getString(9));
					t.setLichTrinh(re.getString(10));
					dsTTNhanKhau.add(t);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return dsTTNhanKhau;
		}
		else {
			return dsTTNhanKhau;
		}
	}
}
