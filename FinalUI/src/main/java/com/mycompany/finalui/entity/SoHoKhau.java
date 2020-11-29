package com.mycompany.finalui.entity;

import java.util.ArrayList;

public class SoHoKhau {
	private int ID;
	private String chuHo;
	private String diaChi;
	private ArrayList<NhanKhau> dsNhanKhau;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getChuHo() {
		return chuHo;
	}
	public void setChuHo(String chuHo) {
		this.chuHo = chuHo;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public ArrayList<NhanKhau> getDsNhanKhau() {
		return dsNhanKhau;
	}
	public void setDsNhanKhau(ArrayList<NhanKhau> dsNhanKhau) {
		this.dsNhanKhau = dsNhanKhau;
	}
	
	public SoHoKhau(int iD, String chuHo, String diaChi) {
		super();
		ID = iD;
		this.chuHo = chuHo;
		this.diaChi = diaChi;
		this.dsNhanKhau = new ArrayList<NhanKhau>();
	}
	
	public SoHoKhau() {
		this.dsNhanKhau = new ArrayList<NhanKhau>();
	}
	
	public void themNhanKhau(NhanKhau nk) {
		this.dsNhanKhau.add(nk);
	}
	
}
