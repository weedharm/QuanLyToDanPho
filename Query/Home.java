package com.mycompany.finalui.UI;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import org.jdesktop.layout.GroupLayout;

import com.mycompany.finalui.connect.TrangThaiService;
import com.mycompany.finalui.entity.NhanKhau;
import com.mycompany.finalui.entity.TrangThai;
import com.mycompany.finalui.usefulfunction.DateConverter;

public class Home extends  JFrame {
	
    private  JButton btnAdd;
    private  JButton btnDelete;
    private  JButton btnEdit;
    private  JButton btnExit;
    private  JTable tblNhanKhau;
    private DefaultTableModel dtmNhanKhau;
    private  JMenu exit;
    private  JButton btnThongKe;
    private  JButton btnChiTiet;
    private  JComboBox<String> cboThongKe;
    private  JPanel jPanel1;
    private  JMenu logOut;
    private  JMenuBar menuBar;
    private  JMenu showInfo;
    private  JScrollPane showListPanel;
    private  JMenu switchAccount;
    private  JMenu thongtin;
    private  JMenu tuychon;
    SingleForm pnSf;
    public static int id = 0;

    public Home() {
        initComponents();
        setLocation(0,0);
        addEvent();
    }
 
    
    private void addEvent() {
		handlingTable();
		tblNhanKhau.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				getInformation();
			}
		});
		
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TrangThai t = new TrangThai();
				t.setIdNhanKhau(Integer.parseInt(pnSf.getTxtID().getText()));
				t.setTtkb((String) pnSf.getCboKhaiBao().getSelectedItem());
				t.setTtsk(pnSf.getTxtTinhTrang().getText());
				t.setThoiGianCachLy(DateConverter.stringToDate(pnSf.getTxtTGCachLy().getText()));
				t.setMucDoCachLy(pnSf.getCboMucDo().getItemAt(0).substring(6));
				t.setTestCovid((String) pnSf.getCboLanTest().getSelectedItem());
				t.setHinhThuc(pnSf.getTxtHinhThuc().getText());
				t.setThoiDiem(DateConverter.stringToDate(pnSf.getTxtThoiGian().getText()));
				t.setKetQua(pnSf.getTxtKetQua().getText());
				t.setLichTrinh(pnSf.getLichTrinh().getText());
				int kq = TrangThaiService.insertTrangThai(t);
				if(kq > 0) {
					JOptionPane.showMessageDialog(null, "Inserted!");
					handlingTable();
				}else {
					JOptionPane.showMessageDialog(null, "Error! An error occurred. Please try again later");
				}
			}
		});
		
		btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int row = tblNhanKhau.getSelectedRow();
				if(row == -1) return;
				int id = (int) tblNhanKhau.getValueAt(row, 0);
				String testCovid = (String) tblNhanKhau.getValueAt(row, 3);
				int x = TrangThaiService.deleteTrangThai(id, testCovid);
				if(x > 0) {
					JOptionPane.showMessageDialog(null, "Deleted!");
					handlingTable();
					tblNhanKhau.getSelectionModel().setSelectionInterval(row-1, row-1);
					getInformation();
				}
				else {
					JOptionPane.showMessageDialog(null, "Error! An error occurred. Please try again later");
				}
			}
		});
		
		btnEdit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TrangThai t = new TrangThai();
				t.setIdNhanKhau(Integer.parseInt(pnSf.getTxtID().getText()));
				t.setTtkb((String) pnSf.getCboKhaiBao().getSelectedItem());
				t.setTtsk(pnSf.getTxtTinhTrang().getText());
				t.setThoiGianCachLy(DateConverter.stringToDate(pnSf.getTxtTGCachLy().getText()));
				t.setMucDoCachLy(pnSf.getCboMucDo().getItemAt(0).substring(6));
				t.setTestCovid((String) pnSf.getCboLanTest().getSelectedItem());
				t.setHinhThuc(pnSf.getTxtHinhThuc().getText());
				t.setThoiDiem(DateConverter.stringToDate(pnSf.getTxtThoiGian().getText()));
				t.setKetQua(pnSf.getTxtKetQua().getText());
				t.setLichTrinh(pnSf.getLichTrinh().getText());
				int kq = TrangThaiService.updateTrangThai(t);
				if(kq > 0) {
					JOptionPane.showMessageDialog(null, "Updated!");
					handlingTable();
				}else if(kq == -1) {
					JOptionPane.showMessageDialog(null, "Can't update due to this information doesn't exist!");
				}else {
					JOptionPane.showMessageDialog(null, "Error! An error occurred. Please try again later!");
				}
			}
		});
		
		btnChiTiet.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int row = tblNhanKhau.getSelectedRow();
				if(row != -1) {
					Home.id = (int) tblNhanKhau.getValueAt(row, 0);
					DetailUI detailUI = new DetailUI();
					detailUI.showWindow();
				}
				else {
					JOptionPane.showMessageDialog(null, "Error! An error occurred. Please try again later!");
				}
			}
		});
		
		
		btnThongKe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int x = cboThongKe.getSelectedIndex();
				System.out.println(x);
				if(x <= 0) {
					handlingTable();
				}
				else if(x == 1) {
					handlingFilter("Dương tính", 1);
				}
				else if(x == 2) {
					handlingFilter("Âm tính", 1);
				}
				else if(x == 3) {
					handlingFilter("Xét nghiệm virus", 2);
				}
				else if(x == 4) {
					handlingFilter("Xét nghiệm kháng thể", 2);
				}
				else {
					return;
				}
			}
		});
	}

	protected void handlingFilter(String inf, int x) {
		TrangThaiService tts = new TrangThaiService(LoginUI.idCanBo);
		ArrayList<TrangThai> dsTT = tts.filter(inf, x);
		dtmNhanKhau.setRowCount(0);
		for(TrangThai t : dsTT) {
			Object[] infor = {t.getIdNhanKhau(), t.getThoiGianCachLy(), t.getMucDoCachLy(),
					t.getTestCovid(), t.getHinhThuc(), t.getThoiDiem(), t.getKetQua()};
			dtmNhanKhau.addRow(infor);
		}
	}


	public void getInformation() {
		int row = tblNhanKhau.getSelectedRow();
		if(row == -1) return;
		int id = (int) tblNhanKhau.getValueAt(row, 0);
		String testCovid = (String) tblNhanKhau.getValueAt(row, 3);
		NhanKhau nk = TrangThaiService.getNhanKhau(id);
		TrangThai t = TrangThaiService.getTrangThai(id, testCovid);
		pnSf.getTxtID().setText(String.valueOf(id));
		pnSf.getTxtHoTen().setText(nk.getHoTen());
		pnSf.getCboGioiTinh().setSelectedItem(nk.getGioiTinh().trim());
		pnSf.getTxtCMND().setText(nk.getCmnd());
		pnSf.getTxtTonGiao().setText(nk.isTonGiao()?"Có":"Không");
		pnSf.getTxtNgaySinh().setText(DateConverter.dateToString(nk.getNgaySinh()).substring(0, 2));
		pnSf.getTxtThangSinh().setText(DateConverter.dateToString(nk.getNgaySinh()).substring(3, 5));
		pnSf.getTxtNamSinh().setText(DateConverter.dateToString(nk.getNgaySinh()).substring(6, 10));
		pnSf.getTxtDanToc().setText(nk.getDanToc());
		pnSf.getTxtDiaChi().setText(nk.getNguyenQuan());
		pnSf.getTxtNoiSinh().setText(nk.getNoiSinh());
		pnSf.getCboKhaiBao().setSelectedItem(t.getTtkb().trim());
		pnSf.getTxtTinhTrang().setText(t.getTtsk().replace(';', ','));
		pnSf.getCboMucDo().setSelectedItem("Level " + t.getMucDoCachLy());
		pnSf.getTxtTGCachLy().setText(DateConverter.dateToString(t.getThoiGianCachLy()));
		pnSf.getCboLanTest().setSelectedItem(t.getTestCovid());
		pnSf.getTxtHinhThuc().setText(t.getHinhThuc());
		pnSf.getTxtThoiGian().setText(DateConverter.dateToString(t.getThoiDiem()));
		pnSf.getTxtKetQua().setText(t.getKetQua());
		pnSf.getLichTrinh().setText(t.getLichTrinh());
	}

	public void handlingTable() {
		TrangThaiService tts = new TrangThaiService(LoginUI.idCanBo);
		ArrayList<TrangThai> dsTT = tts.getDataFromDatabase();
		dtmNhanKhau.setRowCount(0);
		for(TrangThai t : dsTT) {
			Object[] infor = {t.getIdNhanKhau(), t.getThoiGianCachLy(), t.getMucDoCachLy(),
					t.getTestCovid(), t.getHinhThuc(), t.getThoiDiem(), t.getKetQua()};
			dtmNhanKhau.addRow(infor);
		}
	}

    private void initComponents() {

        jPanel1 = new  JPanel();
        btnAdd = new  JButton();
        btnEdit = new  JButton();
        btnDelete = new  JButton();
        showListPanel = new  JScrollPane();
        tblNhanKhau = new  JTable();
        btnThongKe = new  JButton();
        cboThongKe = new  JComboBox<>();
        btnChiTiet = new  JButton();
        btnExit = new  JButton();
        menuBar = new  JMenuBar();
        tuychon = new  JMenu();
        switchAccount = new  JMenu();
        logOut = new  JMenu();
        exit = new  JMenu();
        thongtin = new  JMenu();
        showInfo = new  JMenu();

        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1536, 840));
        setSize(new java.awt.Dimension(1536, 840));
        getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));

        btnAdd.setFont(new java.awt.Font("Arial", 0, 14));  
        btnAdd.setIcon(new  ImageIcon("icon\\Icojam-Blue-Bits-Math-add-0.png"));  
        btnAdd.setText("Thêm");

        btnEdit.setFont(new java.awt.Font("Arial", 0, 14));  
        btnEdit.setIcon(new  ImageIcon("icon\\edit-validated-icon.png"));  
        btnEdit.setText("Chỉnh sửa hồ sơ");

        btnDelete.setFont(new java.awt.Font("Arial", 0, 14));  
        btnDelete.setIcon(new  ImageIcon("icon\\Hopstarter-Soft-Scraps-File-Delete-0.png"));  
        btnDelete.setText("Xoá hồ sơ");

        showListPanel.setFont(new java.awt.Font("Arial", 0, 14));  

        tblNhanKhau.setFont(new java.awt.Font("Arial", 0, 16));  
        initTable();
		tblNhanKhau.setModel(dtmNhanKhau);
		formatTableNhanKhau();
		JScrollPane jScrollPane1 = new JScrollPane(tblNhanKhau, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        showListPanel.setViewportView(tblNhanKhau);

        btnThongKe.setFont(new java.awt.Font("Arial", 0, 14));  
        btnThongKe.setIcon(new  ImageIcon("icon\\statistics.png"));  
        btnThongKe.setText("Thống kê");
        btnThongKe.setPreferredSize(new java.awt.Dimension(93, 29));

        cboThongKe.setFont(new java.awt.Font("Arial", 0, 14));  
        cboThongKe.setModel(new  DefaultComboBoxModel<>(new String[] { ">> clear filter <<", "Dương tính", "Âm tính", "XN virus", "XN kháng thể" }));
        
        btnChiTiet.setFont(new java.awt.Font("Arial", 0, 14));  
        btnChiTiet.setIcon(new  ImageIcon("icon\\eye.png"));  
        btnChiTiet.setText("Xem chi tiết");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(22, 22, 22)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(showListPanel)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(btnThongKe, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .add(btnAdd, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(67, 67, 67)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(cboThongKe, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(btnChiTiet, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(70, 70, 70)
                        .add(btnEdit)
                        .add(69, 69, 69)
                        .add(btnDelete)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(22, 22, 22)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnAdd)
                    .add(btnEdit)
                    .add(btnDelete)
                    .add(btnChiTiet, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(29, 29, 29)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(btnThongKe, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .add(cboThongKe))
                .add(22, 22, 22)
                .add(showListPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

		pnSf = new SingleForm();
		jPanel1.setPreferredSize(new Dimension(750, 0));
		JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jPanel1, pnSf);
		getContentPane().add(sp);

        tuychon.setText("Tuỳ chọn");
        tuychon.setFont(new java.awt.Font("Arial", 0, 14));  

        switchAccount.setText("Chuyển tài khoản");
        switchAccount.setFont(new java.awt.Font("Arial", 0, 14));  
        tuychon.add(switchAccount);

        logOut.setText("Đăng xuất");
        logOut.setFont(new java.awt.Font("Arial", 0, 14));  
        tuychon.add(logOut);

        exit.setText("Thoát");
        exit.setFont(new java.awt.Font("Arial", 0, 14));  
        tuychon.add(exit);

        menuBar.add(tuychon);

        thongtin.setText("Thông tin");
        thongtin.setFont(new java.awt.Font("Arial", 0, 14));  

        showInfo.setText("Giới thiệu nhóm");
        showInfo.setFont(new java.awt.Font("Arial", 0, 14));  
        thongtin.add(showInfo);

        menuBar.add(thongtin);

        setJMenuBar(menuBar);

        pack();
    }

    private void formatTableNhanKhau() {
    	JTableHeader header = tblNhanKhau.getTableHeader();
		header.setFont(new Font("Arial", Font.BOLD, 12));
		header.setOpaque(false);
		header.setForeground(Color.BLACK);
		header.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tblNhanKhau.setFont(new Font("Tahoma 11 Plain", Font.BOLD, 12));
		tblNhanKhau.setFocusable(false);
		tblNhanKhau.setGridColor(Color.DARK_GRAY);
		tblNhanKhau.setIntercellSpacing(new Dimension(0, 0));
		tblNhanKhau.setRowHeight(25);
		tblNhanKhau.setSelectionBackground(new Color(232, 57, 95));
		tblNhanKhau.setShowVerticalLines(false);
		tblNhanKhau.setAlignmentX((float) 0.5);	
		tblNhanKhau.setAlignmentY((float) 0.5);
		tblNhanKhau.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		((DefaultTableCellRenderer)header.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
		tblNhanKhau.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		tblNhanKhau.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
		tblNhanKhau.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
		tblNhanKhau.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);

		tblNhanKhau.getColumnModel().getColumn(0).setMaxWidth(40);
		tblNhanKhau.getColumnModel().getColumn(1).setMaxWidth(150);
		tblNhanKhau.getColumnModel().getColumn(2).setMaxWidth(50);
		tblNhanKhau.getColumnModel().getColumn(3).setMaxWidth(70);
		tblNhanKhau.getColumnModel().getColumn(4).setMaxWidth(150);
		tblNhanKhau.getColumnModel().getColumn(5).setMaxWidth(150);
		tblNhanKhau.getColumnModel().getColumn(6).setMaxWidth(90);
	}

	private void initTable() {
		dtmNhanKhau = new DefaultTableModel(new Object [][] {
		},
				new String [] {
						"ID", " Thời gian cách ly ", "MĐCL", "TestCovid", "Hình thức", "  Thời điểm  ", "Kết quả"
		});
	}



}
