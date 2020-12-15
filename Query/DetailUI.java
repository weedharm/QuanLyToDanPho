package com.mycompany.finalui.UI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.mycompany.finalui.connect.NhanKhauService;
import com.mycompany.finalui.entity.NhanKhau;
import com.mycompany.finalui.usefulfunction.DateConverter;

public class DetailUI extends JFrame {
	
	DetailForm pnDF = new DetailForm();
	
	public DetailUI() {
		super("Thông tin chi tiết");
		addControl();
		addEvent();
	}
	
	private void addEvent() {
		pnDF.getExit().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				handlingExit();
			}
		});
	}

	protected void handlingExit() {
		// TODO Auto-generated method stub
		this.dispose();
	}

	public void addControl() {
		Container con = getContentPane();
		NhanKhau nk = NhanKhauService.getDetailInformation(Home.id);
		pnDF.getFieldID().setText(String.valueOf(nk.getID()));
		pnDF.getFieldHoTen().setText(nk.getHoTen());
		pnDF.getFieldHoKhau().setText(String.valueOf(nk.getHoKhauID()));
		pnDF.getFieldCMND().setText(nk.getCmnd());
		pnDF.getFieldNgaySinh().setText(DateConverter.dateToString(nk.getNgaySinh()));
		pnDF.getFieldGioiTinh().setText(nk.getGioiTinh());
		pnDF.getFieldQHChuHo().setText(nk.getQuanHe());
		pnDF.getFieldDanToc().setText(nk.getDanToc());
		pnDF.getFieldNgheNghiep().setText(nk.getNgheNghiep());
		pnDF.getFieldTonGiao().setText(nk.isTonGiao()?"Có":"Không");
		pnDF.getFieldNoiSinh().setText(nk.getNoiSinh());
		pnDF.getFieldNguyenQuan().setText(nk.getNguyenQuan());
		con.add(pnDF);
	}
	
	
	public void showWindow() {
		this.setSize(650, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}
}
