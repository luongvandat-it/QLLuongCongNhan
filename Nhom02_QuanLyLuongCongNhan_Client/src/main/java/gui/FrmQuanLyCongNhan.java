package gui;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import com.toedter.calendar.JDateChooser;

import dao.CongNhanDao;
import dao.TaiKhoanDao;
import entity.CongNhan;
import entity.LoaiCongNhan;
import entity.TaiKhoan;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 *
 * @author Van Dat
 */
public class FrmQuanLyCongNhan extends javax.swing.JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean bThemOpen = false;
	DefaultTableModel tableModel = new DefaultTableModel();
	private int MaNVAdd = 6;

	public FrmQuanLyCongNhan() throws MalformedURLException, RemoteException, NotBoundException {
		initComponents();
		setTitle("Quản Lý Công Nhân");
		setSize(1276, 800);
		setLocationRelativeTo(null);
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() throws MalformedURLException, RemoteException, NotBoundException {

		jPanel1 = new javax.swing.JPanel();
		lblQuanLyCongNhan = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		tbQLCongNhan = new javax.swing.JTable();
		jPanel4 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		txtMaCN = new javax.swing.JTextField();
		txtTenCN = new javax.swing.JTextField();
		txtDiaChi = new javax.swing.JTextField();
		txtSDT = new javax.swing.JTextField();
		cbCongDoan = new javax.swing.JComboBox<>();
		cbGioiTinh = new javax.swing.JComboBox<>();
		cbTrangThai = new javax.swing.JComboBox<>();
		cldNgaySinh = new com.toedter.calendar.JDateChooser();
		cldNgayVaoLam = new com.toedter.calendar.JDateChooser();
		jPanel3 = new javax.swing.JPanel();
		btnThemCN = new javax.swing.JButton();
		btnThemCN.setText("Thêm");
		btnThemCN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bThemOpen = true;
				txtPass.setEnabled(true);
				clearFormQLNV();
				txtMaCN.setEnabled(true);
			}
		});
		btnXoaNV = new javax.swing.JButton();
		btnXoaNV.setEnabled(false);
		btnLamRongNV = new javax.swing.JButton();
		btnLuu = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(13, 76, 146));

		lblQuanLyCongNhan.setBackground(new java.awt.Color(0, 43, 91));
		lblQuanLyCongNhan.setFont(new Font("Times New Roman", Font.BOLD, 21)); // NOI18N
		lblQuanLyCongNhan.setForeground(new java.awt.Color(255, 255, 255));
		lblQuanLyCongNhan.setText("QUẢN LÝ CÔNG NHÂN");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGap(439)
						.addComponent(lblQuanLyCongNhan).addContainerGap(552, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING).addGroup(
				jPanel1Layout.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblQuanLyCongNhan).addContainerGap()));
		jPanel1.setLayout(jPanel1Layout);

		JTableHeader tableHeader = tbQLCongNhan.getTableHeader();
		tableHeader.setFont(new Font("Segoe UI", Font.BOLD, 12));
		tableHeader.setAlignmentY(RIGHT_ALIGNMENT);
		tbQLCongNhan.setRowHeight(30);
		tbQLCongNhan.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		((DefaultTableCellRenderer) tableHeader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
		tbQLCongNhan.setModel(tableModel = new DefaultTableModel(new Object[][] {},
				new String[] { "M\u00E3 CN", "H\u1ECD t\u00EAn", "C\u00F4ng \u0110o\u1EA1n", "\u0110\u1ECBa ch\u1EC9",
						"Gi\u1EDBi t\u00EDnh", "Ng\u00E0y sinh", "Ng\u00E0y v\u00E0o l\u00E0m", "S\u0110T",
						"Tr\u1EA1ng th\u00E1i" }));

		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		DefaultTableCellRenderer centerRenderer2 = new DefaultTableCellRenderer();
		centerRenderer2.setHorizontalAlignment(JLabel.LEFT);
		tbQLCongNhan.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
		tbQLCongNhan.getColumnModel().getColumn(1).setCellRenderer(centerRenderer2);
		tbQLCongNhan.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
		tbQLCongNhan.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
		tbQLCongNhan.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
		tbQLCongNhan.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
		tbQLCongNhan.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
		tbQLCongNhan.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
		jScrollPane1.setViewportView(tbQLCongNhan);

		tbQLCongNhan.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtPass.setEnabled(false);
				txtPass.setText("");
				txtMaCN.setEnabled(false);
				try {
					int rowSelect = tbQLCongNhan.getSelectedRow();
					String maCN = (String) tbQLCongNhan.getValueAt(rowSelect, 0);
					String tenCN = (String) tbQLCongNhan.getValueAt(rowSelect, 1);
					String congDOanString = (String) tbQLCongNhan.getValueAt(rowSelect, 2);
					String diaString = (String) tbQLCongNhan.getValueAt(rowSelect, 3);
					String gioiTinh = (String) tbQLCongNhan.getValueAt(rowSelect, 4);
					String ngaySinhString = (String) tbQLCongNhan.getValueAt(rowSelect, 5);
					Date dateNgaySinh = new SimpleDateFormat("yyyy-MM-dd").parse(ngaySinhString);
					String ngayVaoLamString = (String) tbQLCongNhan.getValueAt(rowSelect, 6);
					Date dateNgayVaoLam = new SimpleDateFormat("yyyy-MM-dd").parse(ngayVaoLamString);
					String sdtString = (String) tbQLCongNhan.getValueAt(rowSelect, 7);
					String trangThai = (String) tbQLCongNhan.getValueAt(rowSelect, 8);
					txtMaCN.setText(maCN);
					txtTenCN.setText(tenCN);
					int xi = congDOanString.equals("San Xuat") ? 0 : congDOanString.equals("Kiem Tra") ? 1 : 2;
					cbCongDoan.setSelectedIndex(xi);
					txtDiaChi.setText(diaString);
					int xi2 = gioiTinh.equals("Nam") ? 0 : 1;
					cbGioiTinh.setSelectedIndex(xi2);
					cldNgaySinh.setDate(dateNgaySinh);
					cldNgayVaoLam.setDate(dateNgayVaoLam);
					txtSDT.setText(sdtString);
					int xi3 = trangThai.equals("Dang lam viec") ? 0 : 1;
					cbTrangThai.setSelectedIndex(xi3);
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		});

		jLabel1.setText("Mã CN:");

		jLabel2.setText("Họ tên:");

		jLabel3.setText("Công đoạn:");

		jLabel4.setText("Địa chỉ:");

		jLabel5.setText("Giới tính:");

		jLabel6.setText("Ngày sinh:");

		jLabel7.setText("Ngày vào làm:");

		jLabel9.setText("SĐT:");

		jLabel10.setText("Trạng thái:");
		txtMaCN.setBackground(new java.awt.Color(204, 204, 204));

		txtTenCN.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtTenCNActionPerformed(evt);
			}
		});

		txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtDiaChiActionPerformed(evt);
			}
		});

		txtSDT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtSDTActionPerformed(evt);
			}
		});

		cbCongDoan.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "Sản xuất sản phẩm", "Kiểm tra sản phẩm", "Đóng gói sản phẩm" }));

		cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

		cbTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang làm việc", "Đã nghĩ việc" }));

		jLabel9_1 = new JLabel();
		jLabel9_1.setText("Password: ");

		txtPass = new JTextField();
		txtPass.setEnabled(false);

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout
				.createSequentialGroup().addContainerGap()
				.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
								.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addComponent(jLabel2)
										.addComponent(jLabel1).addComponent(jLabel4).addComponent(jLabel6)
										.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(cldNgayVaoLam, GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
										.addComponent(cldNgaySinh, GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
										.addComponent(txtMaCN, GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
										.addComponent(txtTenCN, GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
										.addComponent(txtDiaChi, GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)))
						.addGroup(Alignment.TRAILING,
								jPanel4Layout.createSequentialGroup()
										.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
												.addComponent(jLabel9_1)
												.addGroup(jPanel4Layout
														.createSequentialGroup().addGap(19).addComponent(jLabel9)))
										.addGap(24)
										.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
												.addComponent(txtPass, GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
												.addComponent(txtSDT, GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)))
						.addGroup(jPanel4Layout.createSequentialGroup()
								.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
										.addGroup(jPanel4Layout.createParallelGroup(Alignment.TRAILING)
												.addComponent(jLabel5).addComponent(jLabel3))
										.addComponent(jLabel10))
								.addGap(22)
								.addGroup(jPanel4Layout.createParallelGroup(Alignment.TRAILING)
										.addComponent(cbTrangThai, 0, 317, Short.MAX_VALUE)
										.addComponent(cbGioiTinh, Alignment.LEADING, 0, 317, Short.MAX_VALUE)
										.addComponent(cbCongDoan, Alignment.LEADING, 0, 317, Short.MAX_VALUE))))
				.addGap(57)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addGap(35)
						.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel1)
								.addComponent(txtMaCN, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel2)
								.addComponent(txtTenCN, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addGap(26)
						.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel4)
								.addComponent(txtDiaChi, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel4Layout.createSequentialGroup().addGap(18).addComponent(cldNgaySinh,
										GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel4Layout.createSequentialGroup().addGap(30).addComponent(jLabel6)))
						.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel4Layout.createSequentialGroup().addGap(18).addComponent(cldNgayVaoLam,
										GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel4Layout.createSequentialGroup().addGap(29).addComponent(jLabel7)))
						.addGap(18)
						.addGroup(
								jPanel4Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(cbCongDoan, GroupLayout.PREFERRED_SIZE, 34,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel3))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(
								jPanel4Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(cbGioiTinh, GroupLayout.PREFERRED_SIZE, 33,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel5))
						.addGap(18)
						.addGroup(
								jPanel4Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(cbTrangThai, GroupLayout.PREFERRED_SIZE, 33,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel10))
						.addGap(18)
						.addGroup(
								jPanel4Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtSDT, GroupLayout.PREFERRED_SIZE, 35,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel9))
						.addGap(18)
						.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel9_1)
								.addComponent(txtPass, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(34, Short.MAX_VALUE)));
		jPanel4.setLayout(jPanel4Layout);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 330, Short.MAX_VALUE).addGap(18)
						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 722, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel2Layout
				.createSequentialGroup().addContainerGap()
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jPanel4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
						.addComponent(jScrollPane1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE))
				.addContainerGap()));
		jPanel2.setLayout(jPanel2Layout);

		jPanel3.setBackground(new java.awt.Color(0, 43, 91));

		btnXoaNV.setText("Xóa");
		btnXoaNV.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnXoaNVMouseClicked(evt);
			}
		});

		btnLamRongNV.setText("Làm rỗng");
		btnLamRongNV.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnLamRongNVMouseClicked(evt);
			}
		});

		btnLuu.setText("Lưu");
		btnLuu.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnLuuMouseClicked(evt);
			}
		});
		btnLuu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					if (bThemOpen) {
						if (!checkFormQLNV()) {
							JOptionPane.showMessageDialog(null, "Vui long dien day du thong tin cong nhan!");
							return;
						}
						try {
							CongNhanDao congNhanDao = (CongNhanDao) Naming.lookup("rmi://localhost:1403/congNhanDao");
							String maCN = txtMaCN.getText();
							String hoTen = txtTenCN.getText();
							int congDoan = cbCongDoan.getSelectedIndex();
							String saveCD = congDoan == 0 ? "San Xuat" : congDoan == 1 ? "Kiem Tra" : "Dong Goi";
							String diaChi = txtDiaChi.getText();
							String gioiTinh = (String) cbGioiTinh.getSelectedItem();
							Date ngaySinh = cldNgaySinh.getDate();
							Date ngayVaoLam = cldNgayVaoLam.getDate();
							String sdt = txtSDT.getText();
							Boolean trangThai = cbTrangThai.getSelectedIndex() == 0 ? true : false;
							LoaiCongNhan loaiCongNhan = new LoaiCongNhan("ML3", null, null);
							CongNhan congNhan = new CongNhan(maCN, hoTen, gioiTinh, ngaySinh, ngayVaoLam, saveCD, sdt,
									diaChi, trangThai, loaiCongNhan);
							CongNhan congNhan2 = congNhanDao.getCongNhan(maCN);
							if (congNhan2 != null) {
								JOptionPane.showMessageDialog(null, "Ma cong nhan da ton tai!");
								return;
							}
							Boolean bCheckBoolean = congNhanDao.addCongNhan(congNhan);
							if (bCheckBoolean) {
								TaiKhoanDao taiKhoanDao = (TaiKhoanDao) Naming
										.lookup("rmi://localhost:1403/taiKhoanDao");
								CongNhan congNhan3 = new CongNhan(maCN, null);
								TaiKhoan taiKhoan = new TaiKhoan(sdt, txtPass.getText().toString(), congNhan3);
								Boolean bCheckAddTK = taiKhoanDao.addTaiKhoan(taiKhoan);
								if (bCheckAddTK) {
									JOptionPane.showMessageDialog(null, "Them cong nhan thanh cong!");
									loadTable();
									bThemOpen = false;
									txtMaCN.setEnabled(false);
									return;
								}
							}
						} catch (MalformedURLException | RemoteException | NotBoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					btnLuuActionPerformed(evt);
				} catch (MalformedURLException | RemoteException | NotBoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		JButton btnTiLi = new JButton();
		btnTiLi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					loadTable();
				} catch (MalformedURLException | RemoteException | NotBoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnTiLi.setText("Tải lại");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap(171, Short.MAX_VALUE)
						.addComponent(btnThemCN, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE).addGap(109)
						.addComponent(btnXoaNV, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE).addGap(129)
						.addComponent(btnLuu, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE).addGap(124)
						.addComponent(btnLamRongNV, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
						.addGap(106).addComponent(btnTiLi, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addGap(138)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap(18, Short.MAX_VALUE)
						.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnTiLi, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnLamRongNV, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnLuu, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnXoaNV, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnThemCN, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
						.addGap(17)));
		jPanel3.setLayout(jPanel3Layout);

		JPanel panel = new JPanel();

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE).addContainerGap())
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(panel, GroupLayout.DEFAULT_SIZE,
						1080, Short.MAX_VALUE))
				.addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(Alignment.LEADING,
						layout.createSequentialGroup()
								.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 1219, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 569, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panel.setLayout(new GridLayout(0, 1, 0, 0));

		JMenuBar jMenuBar1 = new JMenuBar();
		jMenuBar1.setPreferredSize(new Dimension(200, 30));
		jMenuBar1.setBackground(new Color(0, 153, 102));
		panel.add(jMenuBar1);

		JMenu jMenu1 = new JMenu();
		jMenu1.setText("Thông tin");
		jMenuBar1.add(jMenu1);

		JMenuItem jMenuItem1 = new JMenuItem();
		jMenuItem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new FrmXemThongTin().setVisible(true);
				} catch (RemoteException | MalformedURLException | NotBoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		jMenuItem1.setText("Cá nhân");
		jMenu1.add(jMenuItem1);

		JMenu jMenu2 = new JMenu();
		jMenu2.setText("Quản lý");
		jMenuBar1.add(jMenu2);

		JMenuItem jMenuItem2 = new JMenuItem();
		jMenuItem2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new FrmLuongCongNhan().setVisible(true);
				} catch (MalformedURLException | RemoteException | NotBoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		jMenuItem2.setText("Lương");
		jMenu2.add(jMenuItem2);

		JMenuItem jMenuItem3 = new JMenuItem();
		jMenuItem3.setText("Nhân sự");
		jMenu2.add(jMenuItem3);

		JMenu jMenu3 = new JMenu();
		jMenu3.setText("Chức năng");
		jMenuBar1.add(jMenu3);

		JMenuItem jMenuItem5 = new JMenuItem();
		jMenuItem5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new FrmTrangChu().setVisible(true);
				} catch (MalformedURLException | RemoteException | SQLException | NotBoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		jMenuItem5.setText("Chấm công");
		jMenu3.add(jMenuItem5);

		JMenuItem jMenuItem4 = new JMenuItem();
		jMenuItem4.setText("Đăng xuất");
		jMenu3.add(jMenuItem4);
		getContentPane().setLayout(layout);

		pack();

		CongNhan maCNLogin = FrmDangNhap.maCNLogin;
		if (maCNLogin.getMaLoai().getMaLoai().equals("ML3")) {
			jMenuItem2.setEnabled(false);
			jMenuItem3.setEnabled(false);
			jMenuItem5.setEnabled(false);
		} else if (maCNLogin.getMaLoai().getMaLoai().equals("ML2")) {
			jMenuItem3.setEnabled(false);
			jMenuItem5.setEnabled(false);
		} else {
			jMenuItem2.setEnabled(false);
		}

		loadTable();
	}// </editor-fold>//GEN-END:initComponents

	private void loadTable() throws MalformedURLException, RemoteException, NotBoundException {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		// String date1 = simpleDateFormat.format(date);
		// TODO Auto-generated method stub
		int tblRow = tableModel.getRowCount();
		for (int i = tblRow - 1; i >= 0; i--) {
			tableModel.removeRow(i);
		}
		CongNhanDao lstCongNhans = (CongNhanDao) Naming.lookup("rmi://localhost:1403/congNhanDao");
		for (CongNhan cn : lstCongNhans.getListCongNhan()) {
			tableModel.addRow(
					new Object[] { cn.getMaCN(), cn.getHoTen(), cn.getCongDoan(), cn.getDiaChi(), cn.getGioiTinh(),
							simpleDateFormat.format(cn.getNgaySinh()), simpleDateFormat.format(cn.getNgayVaoLam()),
							cn.getSdt(), cn.getTrangThai() ? "Dang lam viec" : "Da nghi viec" });
		}
	}

	private void btnLuuActionPerformed(java.awt.event.ActionEvent evt)
			throws MalformedURLException, RemoteException, NotBoundException {// GEN-FIRST:event_btnLuuActionPerformed
		// TODO add your handling code here:
		if (txtMaCN == null || txtMaCN.getText() == "") {
			JOptionPane.showMessageDialog(null, "Vui long chon mot cong nhan de thao tac !");
			return;
		}
		int n = JOptionPane.showConfirmDialog(null, "Ban co muon luu nhung thay doi ?", "Cap nhat thong tin nhan vien",
				JOptionPane.YES_NO_OPTION);
		if (n == JOptionPane.YES_OPTION) {
			CongNhanDao congNhanDao = (CongNhanDao) Naming.lookup("rmi://localhost:1403/congNhanDao");
			String maCN = txtMaCN.getText();
			String hoTen = txtTenCN.getText();
			String congDoan = (String) cbCongDoan.getSelectedItem();
			String diaChi = txtDiaChi.getText();
			String gioiTinh = (String) cbGioiTinh.getSelectedItem();
			Date ngaySinh = cldNgaySinh.getDate();
			Date ngayVaoLam = cldNgayVaoLam.getDate();
			String sdt = txtSDT.getText();
			Boolean trangThai = cbTrangThai.getSelectedIndex() == 0 ? true : false;
			CongNhan congNhan = new CongNhan(maCN, hoTen, gioiTinh, ngaySinh, ngayVaoLam, congDoan, sdt, diaChi,
					trangThai, null);
			Boolean bCheckBoolean = congNhanDao.updateCongNhan(congNhan);
			if (bCheckBoolean) {
				loadTable();
				JOptionPane.showMessageDialog(null, "Cap nhat thanh cong!");
			}
		}
	}// GEN-LAST:event_btnLuuActionPerformed

	private void txtTenCNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtTenCNActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtTenCNActionPerformed

	private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtDiaChiActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtDiaChiActionPerformed

	private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtSDTActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtSDTActionPerformed

	private void btnXoaNVMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnXoaNVMouseClicked
		// TODO add your handling code here:
		tableModel.removeRow(tbQLCongNhan.getSelectedRow());
		JOptionPane.showMessageDialog(null, "Đã xóa thành công!");
	}// GEN-LAST:event_btnXoaNVMouseClicked

	private void btnLuuMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnLuuMouseClicked
		// TODO add your handling code here:
		JOptionPane.showMessageDialog(null, "Đã lưu các thông tin vào CSDL!");
	}// GEN-LAST:event_btnLuuMouseClicked

	private void btnLamRongNVMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnLamRongNVMouseClicked
		// TODO add your handling code here:
		clearFormQLNV();
	}// GEN-LAST:event_btnLamRongNVMouseClicked

	public void clearFormQLNV() {
		txtMaCN.setText("");
		txtTenCN.setText("");
		cbCongDoan.setSelectedIndex(0);
		txtDiaChi.setText("");
		cbGioiTinh.setSelectedIndex(0);
		cldNgaySinh.setDate(new Date());
		cldNgayVaoLam.setDate(new Date());
		txtSDT.setText("");
		cbTrangThai.setSelectedIndex(0);
	}

	public boolean checkFormQLNV() {
		Date now = new Date();
		if ((now.getYear() - cldNgaySinh.getDate().getYear()) < 16) {
			JOptionPane.showMessageDialog(null, "Duoi 16 tuoi, chua toi tuoi lao dong !");
			return false;
		}
		if(!cldNgayVaoLam.getDate().before(now))
		{
			JOptionPane.showMessageDialog(null, "Ngay vao lam phai la ngay hien tai hoac sau ngay hien tai !");
			return false;
		}
		if (txtTenCN.getText().equals("") || txtDiaChi.getText().equals("") || txtSDT.getText().equals("")) {
			return false;
		}
		if(txtSDT.getText().toString().length() < 10 || txtSDT.getText().toString().length() > 11)
		{
			JOptionPane.showMessageDialog(null, "So dien thoai khong hop ly !");
			return false;
		}
		if(txtPass.getText().toString().length() < 6)
		{
			JOptionPane.showMessageDialog(null, "Password phai tu 6 ki tu tro len");
			return false;
		}
		return true;
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(FrmQuanLyCongNhan.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FrmQuanLyCongNhan.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FrmQuanLyCongNhan.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FrmQuanLyCongNhan.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new FrmQuanLyCongNhan().setVisible(true);
				} catch (MalformedURLException | RemoteException | NotBoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnLamRongNV;
	private javax.swing.JButton btnLuu;
	private javax.swing.JButton btnThemCN;
	private javax.swing.JButton btnXoaNV;
	private javax.swing.JComboBox<String> cbCongDoan;
	private javax.swing.JComboBox<String> cbGioiTinh;
	private javax.swing.JComboBox<String> cbTrangThai;
	private com.toedter.calendar.JDateChooser cldNgaySinh;
	private com.toedter.calendar.JDateChooser cldNgayVaoLam;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel lblQuanLyCongNhan;
	private javax.swing.JTable tbQLCongNhan;
	private javax.swing.JTextField txtDiaChi;
	private javax.swing.JTextField txtMaCN;
	private javax.swing.JTextField txtSDT;
	private javax.swing.JTextField txtTenCN;
	private JLabel jLabel9_1;
	private JTextField txtPass;
}
