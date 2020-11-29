package com.mycompany.finalui.UI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import org.jdesktop.layout.*;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

import com.mycompany.finalui.connect.TrangThaiService;
import com.mycompany.finalui.entity.NhanKhau;
import com.mycompany.finalui.entity.TrangThai;
import com.mycompany.finalui.usefulfunction.DateConverter;
import com.mysql.cj.conf.ConnectionUrlParser.Pair;

public class Home extends JFrame {
	
    private JButton btnThem;
    private JButton btnSua;
    private JButton btnXoa;
    private JButton btnLuu;
    private JButton btnThoat;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenu jMenu3;
    private JMenu jMenu4;
    private JMenu jMenu5;
    private JMenu jMenu6;
    private JMenuBar jMenuBar1;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTable tblNhanKhau;
    private DefaultTableModel dtmNhanKhau;
    SingleForm pnSf;

    /** Creates new form Home */
    public Home() {
        initComponents();
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
	}

	protected void getInformation() {
		int row = tblNhanKhau.getSelectedRow();
		if(row == -1) return;
		int id = (int) tblNhanKhau.getValueAt(row, 0);
		String testCovid = (String) tblNhanKhau.getValueAt(row, 3);
		NhanKhau nk = TrangThaiService.getNhanKhau(id);
		TrangThai t = TrangThaiService.getTrangThai(id, testCovid);
		System.out.println(t.getKetQua());
		pnSf.getInputName().setText(nk.getHoTen());
		pnSf.getSelectSex().setSelectedItem(nk.getGioiTinh().trim());
		pnSf.getInputID().setText(nk.getCmnd());
		pnSf.getInputReligion().setText(nk.isTonGiao()?"Có":"Không");
		pnSf.getInputDay().setText(DateConverter.dateToString(nk.getNgaySinh()).substring(0, 2));
		pnSf.getInputMonth().setText(DateConverter.dateToString(nk.getNgaySinh()).substring(3, 5));
		pnSf.getInputYear().setText(DateConverter.dateToString(nk.getNgaySinh()).substring(6, 10));
		pnSf.getInputNation().setText(nk.getDanToc());
		pnSf.getInputDiaChi().setText(nk.getNguyenQuan());
		pnSf.getInputNoiSinh().setText(nk.getNoiSinh());
		pnSf.getSelectTinhTrang().setSelectedItem(t.getTtkb());
		pnSf.getInputCachLy().setText(t.getTtsk());
		pnSf.getSelectMucDo().setSelectedItem(t.getMucDoCachLy());
		pnSf.getInputTimeCachLy().setText(DateConverter.dateToString(t.getThoiGianCachLy()));
		pnSf.getSelectTest().setSelectedItem(t.getTestCovid());
		pnSf.getInputHinhThuc().setText(t.getHinhThuc());
		pnSf.getInputTimeTest().setText(DateConverter.dateToString(t.getThoiDiem()));
		pnSf.getSelectKetQua().setSelectedItem(t.getKetQua().trim());
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

        jPanel1 = new JPanel();
        btnThem = new JButton();
        btnSua = new JButton();
        btnXoa = new JButton();
        btnLuu = new JButton();
        btnThoat = new JButton();
        tblNhanKhau = new JTable();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenu3 = new JMenu();
        jMenu4 = new JMenu();
        jMenu5 = new JMenu();
        jMenu2 = new JMenu();
        jMenu6 = new JMenu();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout());

        btnThem.setFont(new Font("Arial", 0, 14)); 
        btnThem.setText("Thêm");

        btnSua.setFont(new Font("Arial", 0, 14)); 
        btnSua.setText("Chỉnh sửa hồ sơ");

        btnXoa.setFont(new Font("Arial", 0, 14)); 
        btnXoa.setText("Xoá hồ sơ");

        btnLuu.setFont(new Font("Arial", 0, 14)); 
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnThoat.setFont(new Font("Arial", 0, 14)); 
        btnThoat.setText("Đăng xuất & Thoát");


        tblNhanKhau.setFont(new Font("Arial", 0, 14)); 
        initTable();
        tblNhanKhau.setModel(dtmNhanKhau);
        formatTableNhanKhau();
        jScrollPane1 = new JScrollPane(tblNhanKhau, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setFont(new Font("Arial", 0, 14)); 


        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(22, 22, 22)
                .add(jPanel1Layout.createParallelGroup(GroupLayout.LEADING)
                    .add(jScrollPane1)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(btnThem, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.UNRELATED)
                        .add(btnSua)
                        .addPreferredGap(LayoutStyle.UNRELATED)
                        .add(btnXoa)
                        .addPreferredGap(LayoutStyle.UNRELATED)
                        .add(btnLuu)
                        .addPreferredGap(LayoutStyle.UNRELATED)
                        .add(btnThoat, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(22, 22, 22)
                .add(jPanel1Layout.createParallelGroup(GroupLayout.BASELINE)
                    .add(btnThem)
                    .add(btnSua)
                    .add(btnXoa)
                    .add(btnLuu)
                    .add(btnThoat))
                .add(29, 29, 29)
                .add(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnSf = new SingleForm();
        jPanel1.setPreferredSize(new Dimension(750, 0));
        JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jPanel1, pnSf);
        getContentPane().add(sp);

        jMenu1.setText("Tuỳ chọn");
        jMenu1.setFont(new Font("Arial", 0, 14)); 

        jMenu3.setText("Chuyển tài khoản");
        jMenu3.setFont(new Font("Arial", 0, 14)); 
        jMenu1.add(jMenu3);

        jMenu4.setText("Đăng xuất");
        jMenu4.setFont(new Font("Arial", 0, 14)); 
        jMenu1.add(jMenu4);

        jMenu5.setText("Thoát");
        jMenu5.setFont(new Font("Arial", 0, 14)); 
        jMenu1.add(jMenu5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Thông tin");
        jMenu2.setFont(new Font("Arial", 0, 14)); 

        jMenu6.setText("Giới thiệu nhóm");
        jMenu6.setFont(new Font("Arial", 0, 14)); 
        jMenu2.add(jMenu6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }

    private void initTable() {
		dtmNhanKhau = new DefaultTableModel(new Object [][] {
        },
        new String [] {
            "ID", " Thời gian cách ly ", "MĐCL", "TestCovid", "Hình thức", "  Thời điểm  ", "Kết quả"
        });
		
	}

	private void btnLuuActionPerformed(ActionEvent evt) {
    	
    }
	
	private void formatTableNhanKhau() {
		JTableHeader header = tblNhanKhau.getTableHeader();
		//header.setBackground(Color.RED);
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

	public void showWindow() {
		this.setSize(1500, 800);
		this.setAlwaysOnTop(true);
		this.setResizable(true);
		this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
