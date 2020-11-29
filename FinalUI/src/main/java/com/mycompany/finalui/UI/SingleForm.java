package com.mycompany.finalui.UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author ducng
 */
public class SingleForm extends JPanel {

	private JLabel ID;
	private JLabel birthday;
	private JButton buttomAdd;
	private JButton buttomExit;
	private JButton buttomSave;
	private JButton buttomView;
	private JPanel imagePanel;
	private JTextField inputCachLy;
	private JTextField inputDay;
	private JTextField inputDiaChi;
	private JTextField inputHinhThuc;
	private JTextField inputID;
	private JTextField inputMonth;
	private JTextField inputName;
	private JTextField inputNation;
	private JTextField inputNoiSinh;
	private JTextField inputReligion;
	private JTextField inputTimeCachLy;
	private JTextField inputTimeTest;
	private JTextField inputYear;
	private JPanel jPanel1;
	private JLabel labelCachLy;
	private JLabel labelDiaChi;
	private JLabel labelHinhThuc;
	private JLabel labelKetQua;
	private JLabel labelLichTrinh;
	private JLabel labelMucDo;
	private JLabel labelName;
	private JLabel labelNation;
	private JLabel labelNoiSinh;
	private JLabel labelReligion;
	private JLabel labelSex;
	private JLabel labelTest;
	private JLabel labelThoiGianCachLy;
	private JLabel labelTimeTest;
	private JLabel labelTinhTrang;
	private JComboBox<String> selectKetQua;
	private JComboBox<String> selectMucDo;
	private JToggleButton selectPictureButtom;
	private JComboBox<String> selectSex;
	private JComboBox<String> selectTest;
	private JComboBox<String> selectTinhTrang;
	private JTextField showLichTriinh;

	public SingleForm() {
		initComponents();
	}

	private void initComponents() {

		jPanel1 = new JPanel();
		labelName = new JLabel();
		inputName = new JTextField();
		labelSex = new JLabel();
		selectSex = new JComboBox<>();
		ID = new JLabel();
		inputID = new JTextField();
		labelReligion = new JLabel();
		inputReligion = new JTextField();
		birthday = new JLabel();
		labelNation = new JLabel();
		inputDay = new JTextField();
		inputYear = new JTextField();
		inputMonth = new JTextField();
		inputNation = new JTextField();
		labelNoiSinh = new JLabel();
		inputNoiSinh = new JTextField();
		labelDiaChi = new JLabel();
		inputDiaChi = new JTextField();
		imagePanel = new JPanel();
		selectPictureButtom = new JToggleButton();
		labelTinhTrang = new JLabel();
		selectTinhTrang = new JComboBox<>();
		labelCachLy = new JLabel();
		inputCachLy = new JTextField();
		labelThoiGianCachLy = new JLabel();
		inputTimeCachLy = new JTextField();
		labelMucDo = new JLabel();
		selectMucDo = new JComboBox<>();
		labelTest = new JLabel();
		selectTest = new JComboBox<>();
		labelHinhThuc = new JLabel();
		inputHinhThuc = new JTextField();
		labelTimeTest = new JLabel();
		inputTimeTest = new JTextField();
		labelKetQua = new JLabel();
		selectKetQua = new JComboBox<>();
		labelLichTrinh = new JLabel();
		showLichTriinh = new JTextField();
		buttomSave = new JButton();
		buttomAdd = new JButton();
		buttomView = new JButton();
		buttomExit = new JButton();

		labelName.setFont(new Font("Tahoma 11 Plain", Font.BOLD, 14)); 
		labelName.setText("Họ tên:");

		inputName.setFont(new Font("Tahoma 11 Plain", 0, 14)); 

		labelSex.setFont(new Font("Tahoma 11 Plain", Font.BOLD, 14)); 
		labelSex.setText("Giới tính");

		selectSex.setFont(new Font("Tahoma 11 Plain", 0, 14)); 
		selectSex.setModel(new DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

		ID.setFont(new Font("Tahoma 11 Plain", Font.BOLD, 14)); 
		ID.setText("Số CMND/CCCD:");

		inputID.setFont(new Font("Tahoma 11 Plain", 0, 14)); 

		labelReligion.setFont(new Font("Tahoma 11 Plain", Font.BOLD, 14)); 
		labelReligion.setText("Tôn giáo:");

		inputReligion.setFont(new Font("Tahoma 11 Plain", 0, 14)); 

		birthday.setFont(new Font("Tahoma 11 Plain", Font.BOLD, 14)); 
		birthday.setText("Ngày sinh:");

		labelNation.setFont(new Font("Tahoma 11 Plain", Font.BOLD, 14)); 
		labelNation.setText("Dân tộc:");

		inputDay.setFont(new Font("Tahoma 11 Plain", 0, 14)); 
		inputDay.setText("dd");

		inputYear.setFont(new Font("Tahoma 11 Plain", 0, 14)); 
		inputYear.setText("yyyy");

		inputMonth.setFont(new Font("Tahoma 11 Plain", 0, 14)); 
		inputMonth.setText("mm");
		inputMonth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				inputMonthActionPerformed(evt);
			}
		});

		inputNation.setFont(new Font("Tahoma 11 Plain", 0, 14)); 

		labelNoiSinh.setFont(new Font("Tahoma 11 Plain", Font.BOLD, 14)); 
		labelNoiSinh.setText("Nơi sinh:");

		inputNoiSinh.setFont(new Font("Tahoma 11 Plain", 0, 14)); 

		labelDiaChi.setFont(new Font("Tahoma 11 Plain", Font.BOLD, 14)); 
		labelDiaChi.setText("Địa chỉ thường trú:");

		inputDiaChi.setFont(new Font("Tahoma 11 Plain", 0, 14)); 
		inputDiaChi.setToolTipText("");

		imagePanel.setBackground(new Color(153, 255, 255));

		selectPictureButtom.setFont(new Font("Tahoma 11 Plain", 0, 14)); 
		selectPictureButtom.setText("Chọn ảnh");

		GroupLayout imagePanelLayout = new GroupLayout(imagePanel);
		imagePanel.setLayout(imagePanelLayout);
		imagePanelLayout.setHorizontalGroup(
				imagePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(GroupLayout.Alignment.TRAILING, imagePanelLayout.createSequentialGroup()
						.addContainerGap(24, Short.MAX_VALUE)
						.addComponent(selectPictureButtom)
						.addGap(21, 21, 21))
				);
		imagePanelLayout.setVerticalGroup(
				imagePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(GroupLayout.Alignment.TRAILING, imagePanelLayout.createSequentialGroup()
						.addContainerGap(126, Short.MAX_VALUE)
						.addComponent(selectPictureButtom)
						.addContainerGap())
				);

		labelTinhTrang.setFont(new Font("Tahoma 11 Plain", Font.BOLD, 14)); 
		labelTinhTrang.setText("Tình trạng khai báo:");

		selectTinhTrang.setFont(new Font("Tahoma 11 Plain", 0, 14)); 
		selectTinhTrang.setModel(new DefaultComboBoxModel<>(new String[] { "Đã khai báo", "Chưa có thông tin khai báo" }));

		labelCachLy.setFont(new Font("Tahoma 11 Plain", Font.BOLD, 14)); 
		labelCachLy.setText("Tình trạng sức khoẻ:");

		inputCachLy.setFont(new Font("Tahoma 11 Plain", 0, 14)); 

		labelThoiGianCachLy.setFont(new Font("Tahoma 11 Plain", Font.BOLD, 14)); 
		labelThoiGianCachLy.setText("Thời gian cách ly:");

		inputTimeCachLy.setFont(new Font("Tahoma 11 Plain", 0, 14)); 

		labelMucDo.setFont(new Font("Tahoma 11 Plain", Font.BOLD, 14)); 
		labelMucDo.setText("Mức độ cách ly:");

		selectMucDo.setFont(new Font("Tahoma 11 Plain", 0, 14)); 
		selectMucDo.setModel(new DefaultComboBoxModel<>(new String[] { "F0", "F1", "F3", "F4", "F5" }));

		labelTest.setFont(new Font("Tahoma 11 Plain", Font.BOLD, 14)); 
		labelTest.setText("Test Covid");

		selectTest.setFont(new Font("Tahoma 11 Plain", 0, 14)); 
		selectTest.setModel(new DefaultComboBoxModel<>(new String[] { "Lần 1", "Lần 2", "Lần 3" }));

		labelHinhThuc.setFont(new Font("Tahoma 11 Plain", Font.BOLD, 14)); 
		labelHinhThuc.setText("Hình thức:");

		inputHinhThuc.setFont(new Font("Tahoma 11 Plain", 0, 14)); 

		labelTimeTest.setFont(new Font("Tahoma 11 Plain", Font.BOLD, 14)); 
		labelTimeTest.setText("Thời gian:");

		inputTimeTest.setFont(new Font("Tahoma 11 Plain", 0, 14)); 
		inputTimeTest.setText("dd/mm/yyyy");

		labelKetQua.setFont(new Font("Tahoma 11 Plain", Font.BOLD, 14)); 
		labelKetQua.setText("Kết quả:");

		selectKetQua.setFont(new Font("Tahoma 11 Plain", 0, 14)); 
		selectKetQua.setModel(new DefaultComboBoxModel<>(new String[] { "Âm tính", "Dương tính" }));

		labelLichTrinh.setFont(new Font("Tahoma 11 Plain", Font.BOLD, 14)); 
		labelLichTrinh.setText("Lịch trình di chuyển:");

		showLichTriinh.setFont(new Font("Tahoma 11 Plain", 0, 14)); 

		buttomSave.setFont(new Font("Tahoma 11 Plain", 0, 14)); 
		buttomSave.setIcon(new ImageIcon("icon\\Paomedia-Small-N-Flat-Floppy-0.png")); 
		buttomSave.setText("Lưu");

		buttomAdd.setFont(new Font("Tahoma 11 Plain", 0, 14)); 
		buttomAdd.setIcon(new ImageIcon("icon\\Icojam-Blue-Bits-Math-add-0.png")); 
		buttomAdd.setText("Thêm lịch trình");

		buttomView.setFont(new Font("Tahoma 11 Plain", 0, 14)); 
		buttomView.setIcon(new ImageIcon("icon\\view-icon.png")); 
		buttomView.setText("Xem lịch trình");

		buttomExit.setFont(new Font("Tahoma 11 Plain", 0, 14)); 
		buttomExit.setIcon(new ImageIcon("icon\\Awicons-Vista-Artistic-Delete-0.png")); 
		buttomExit.setText("Thoát");

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(buttomAdd)
						.addGap(18, 18, 18)
						.addComponent(buttomView)
						.addGap(18, 18, 18)
						.addComponent(buttomSave)
						.addGap(18, 18, 18)
						.addComponent(buttomExit)
						.addGap(23, 23, 23))
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(showLichTriinh)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
														.addComponent(labelTinhTrang)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(selectTinhTrang, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addComponent(labelTest)
																		.addGap(18, 18, 18))
																.addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
																		.addComponent(labelTimeTest)
																		.addGap(30, 30, 30)))
														.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addComponent(selectTest, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																		.addGap(18, 18, 18)
																		.addComponent(labelHinhThuc))
																.addComponent(inputTimeTest))))
										.addGap(18, 18, 18)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addComponent(labelCachLy)
														.addGap(18, 18, 18)
														.addComponent(inputCachLy))
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addComponent(inputHinhThuc, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
														.addGap(0, 0, Short.MAX_VALUE))
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addComponent(labelKetQua)
														.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(selectKetQua, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(labelMucDo)
										.addGap(26, 26, 26)
										.addComponent(selectMucDo, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(labelThoiGianCachLy)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(inputTimeCachLy))
								.addComponent(labelLichTrinh)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addComponent(labelDiaChi, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
														.addGap(26, 26, 26)
														.addComponent(inputDiaChi, GroupLayout.PREFERRED_SIZE, 413, GroupLayout.PREFERRED_SIZE))
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addComponent(labelNoiSinh)
														.addGap(18, 18, 18)
														.addComponent(inputNoiSinh, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addComponent(labelName)
																		.addGap(26, 26, 26)
																		.addComponent(inputName, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE))
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addComponent(ID)
																		.addGap(26, 26, 26)
																		.addComponent(inputID, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addComponent(birthday)
																		.addGap(26, 26, 26)
																		.addComponent(inputDay, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
																		.addGap(18, 18, 18)
																		.addComponent(inputMonth, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
																		.addGap(18, 18, 18)
																		.addComponent(inputYear, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
																		.addGap(18, 18, 18)
																		.addComponent(labelNation)))
														.addGap(28, 28, 28)
														.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
																				.addComponent(labelSex)
																				.addComponent(labelReligion))
																		.addGap(18, 18, 18)
																		.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
																				.addComponent(selectSex, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																				.addComponent(inputReligion, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
																.addComponent(inputNation, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))))
										.addGap(18, 18, Short.MAX_VALUE)
										.addComponent(imagePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap())
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(23, 23, 23)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(imagePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(labelName)
												.addComponent(inputName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(labelSex)
												.addComponent(selectSex, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(ID)
												.addComponent(inputID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(labelReligion)
												.addComponent(inputReligion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(birthday)
												.addComponent(inputDay, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(inputMonth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(inputYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(labelNation)
												.addComponent(inputNation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(labelNoiSinh)
												.addComponent(inputNoiSinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(labelDiaChi)
												.addComponent(inputDiaChi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(selectTinhTrang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(labelCachLy)
										.addComponent(inputCachLy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(labelTinhTrang))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(labelMucDo)
								.addComponent(selectMucDo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(labelThoiGianCachLy)
								.addComponent(inputTimeCachLy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(labelTest)
								.addComponent(selectTest, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(labelHinhThuc)
								.addComponent(inputHinhThuc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(labelTimeTest)
								.addComponent(inputTimeTest, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(labelKetQua)
								.addComponent(selectKetQua, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addComponent(labelLichTrinh)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(showLichTriinh, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
						.addGap(16, 16, 16)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(buttomExit)
								.addComponent(buttomSave)
								.addComponent(buttomView)
								.addComponent(buttomAdd))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);

		GroupLayout layout = new GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
				);
		
				
	}

	public JButton getButtomAdd() {
		return buttomAdd;
	}

	public JButton getButtomExit() {
		return buttomExit;
	}

	public JButton getButtomSave() {
		return buttomSave;
	}

	public JButton getButtomView() {
		return buttomView;
	}

	public JPanel getImagePanel() {
		return imagePanel;
	}

	public JTextField getInputCachLy() {
		return inputCachLy;
	}

	public JTextField getInputDay() {
		return inputDay;
	}

	public JTextField getInputDiaChi() {
		return inputDiaChi;
	}

	public JTextField getInputHinhThuc() {
		return inputHinhThuc;
	}

	public JTextField getInputID() {
		return inputID;
	}

	public JTextField getInputMonth() {
		return inputMonth;
	}

	public JTextField getInputName() {
		return inputName;
	}

	public JTextField getInputNation() {
		return inputNation;
	}

	public JTextField getInputNoiSinh() {
		return inputNoiSinh;
	}

	public JTextField getInputReligion() {
		return inputReligion;
	}

	public JTextField getInputTimeCachLy() {
		return inputTimeCachLy;
	}

	public JTextField getInputTimeTest() {
		return inputTimeTest;
	}

	public JTextField getInputYear() {
		return inputYear;
	}

	public JComboBox<String> getSelectKetQua() {
		return selectKetQua;
	}

	public JComboBox<String> getSelectMucDo() {
		return selectMucDo;
	}

	public JToggleButton getSelectPictureButtom() {
		return selectPictureButtom;
	}

	public JComboBox<String> getSelectSex() {
		return selectSex;
	}

	public JComboBox<String> getSelectTest() {
		return selectTest;
	}

	public JComboBox<String> getSelectTinhTrang() {
		return selectTinhTrang;
	}

	public JTextField getShowLichTriinh() {
		return showLichTriinh;
	}

	private void inputMonthActionPerformed(ActionEvent evt) {
		
	}

}
