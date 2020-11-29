package com.mycompany.finalui.entity;

import java.util.ArrayList;

public class CanBo {
	private int ID;
	private String userName;
	private String password;
	private String hoTen;
	private String chucVu;
	private ArrayList<NhanKhau> dsNhanKhau;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getChucVu() {
		return chucVu;
	}
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	
	public CanBo(int iD, String userName, String password, String hoTen, String chucVu) {
		super();
		ID = iD;
		this.dsNhanKhau = new ArrayList<NhanKhau>();
		this.userName = userName;
		this.password = password;
		this.hoTen = hoTen;
		this.chucVu = chucVu;
	}
	
	public CanBo() {
		super();
		this.dsNhanKhau = new ArrayList<NhanKhau>();
	}
	
	public void themNhanKhau(NhanKhau nk) {
		this.dsNhanKhau.add(nk);
	}
		
	
}
