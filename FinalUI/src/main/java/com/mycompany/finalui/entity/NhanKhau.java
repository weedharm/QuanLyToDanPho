package com.mycompany.finalui.entity;

import java.util.ArrayList;
import java.util.Date;

public class NhanKhau {
	private int ID;
	private int hoKhauID;
	private String quanHe;
	private String hoTen;
	private Date ngaySinh;
	private String gioiTinh;
	private String noiSinh;
	private String nguyenQuan;
	private String danToc;
	private boolean tonGiao;
	private String ngheNghiep;
	private String cmnd;
	private ArrayList<TrangThai> dsTT;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getHoKhauID() {
		return hoKhauID;
	}
	public void setHoKhauID(int hoKhauID) {
		this.hoKhauID = hoKhauID;
	}
	public String getQuanHe() {
		return quanHe;
	}
	public void setQuanHe(String quanHe) {
		this.quanHe = quanHe;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getNoiSinh() {
		return noiSinh;
	}
	public void setNoiSinh(String noiSinh) {
		this.noiSinh = noiSinh;
	}
	public String getNguyenQuan() {
		return nguyenQuan;
	}
	public void setNguyenQuan(String nguyenQuan) {
		this.nguyenQuan = nguyenQuan;
	}
	public String getDanToc() {
		return danToc;
	}
	public void setDanToc(String danToc) {
		this.danToc = danToc;
	}
	public boolean isTonGiao() {
		return tonGiao;
	}
	public void setTonGiao(boolean tonGiao) {
		this.tonGiao = tonGiao;
	}
	public String getNgheNghiep() {
		return ngheNghiep;
	}
	public void setNgheNghiep(String ngheNghiep) {
		this.ngheNghiep = ngheNghiep;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	
	
	public NhanKhau() {
		super();
		dsTT = new ArrayList<TrangThai>();
	}
	
	
	public void themTrangThai(TrangThai t) {
		dsTT.add(t);
	}
	
}
