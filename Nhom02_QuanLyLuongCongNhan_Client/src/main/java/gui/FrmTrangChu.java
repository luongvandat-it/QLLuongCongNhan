/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDateChooserBeanInfo;

import dao.ChamCongDao;
import dao.CongNhanDao;
import entity.ChamCong;
import entity.CongNhan;
import java.awt.Component;
import javax.swing.JCheckBox;

/**
 *
 * @author Van Dat
 */
public class FrmTrangChu extends javax.swing.JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	DefaultTableModel tableModel = new DefaultTableModel();
	boolean bCheckAllChamCong = false;
	boolean bStatusEdit = false;
	java.util.Date dateCheckXoaDate = null;
	private javax.swing.JTable jTable1;

	/**
	 * Creates new form FrmTrangChu
	 * 
	 * @throws NotBoundException
	 * @throws SQLException
	 * @throws RemoteException
	 * @throws MalformedURLException
	 */
	public FrmTrangChu() throws MalformedURLException, RemoteException, SQLException, NotBoundException {
		setTitle("Trang chủ");
		initComponents();
		setSize(1276, 800);
		setLocationRelativeTo(null);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 * 
	 * @throws SQLException
	 * @throws NotBoundException
	 * @throws RemoteException
	 * @throws MalformedURLException
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() throws SQLException, MalformedURLException, RemoteException, NotBoundException {

		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jPanel3 = new javax.swing.JPanel();
		jLabel4 = new javax.swing.JLabel();
		btnChamCong = new javax.swing.JButton();
		btnChamCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				java.util.Date dateTempDate = new java.util.Date();
				dateNgayChamCong.setDate(dateTempDate);
			}
		});
		btnChamCong.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnXem = new javax.swing.JButton();
		btnXem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSua.setEnabled(true);
				dateCheckXoaDate = dateNgayChamCong.getDate();
				try {
					ChamCongDao chamCongDao = (ChamCongDao) Naming.lookup("rmi://localhost:1403/chamCongDao");
					CongNhanDao congNhanDao = (CongNhanDao) Naming.lookup("rmi://localhost:1403/congNhanDao");
					List<ChamCong> lstChamCongs = chamCongDao.getListChamCongFilterDate(dateNgayChamCong.getDate());
					System.out.println(lstChamCongs);
					int tblRow = jTable1.getRowCount();
					for (int i = tblRow - 1; i >= 0; i--) {
						tableModel.removeRow(i);
					}
					CongNhan congNhan = null;
					for (ChamCong cn : lstChamCongs) {
						congNhan = congNhanDao.getCongNhan(cn.getMaCN().getMaCN());
						System.out.println(congNhan);
						tableModel.addRow(new Object[] { cn.getMaCN().getMaCN(), congNhan.getHoTen(), cn.getDiLam(),
								cn.getDiTre(), cn.getsoSanPhamLamDuoc() });
					}
					jTable1.setEnabled(false);

				} catch (MalformedURLException | RemoteException | NotBoundException e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		});
		btnXem.setFont(new Font("Tahoma", Font.PLAIN, 12));
		dateNgayChamCong = new com.toedter.calendar.JDateChooser();
		java.util.Date date2 = new java.util.Date();
		dateNgayChamCong.setDate(date2);
		jPanel4 = new javax.swing.JPanel();
		btnSua = new javax.swing.JButton();
		btnSua.setEnabled(false);
		chkDiLamHet = new javax.swing.JCheckBox();
		jPanel5 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jLabel2 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenuItem3 = new javax.swing.JMenuItem();
		jMenuItem3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FrmQuanLyCongNhan frmQuanLyCongNhan;
					frmQuanLyCongNhan = new FrmQuanLyCongNhan();
					frmQuanLyCongNhan.setVisible(true);
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
		});
		jMenu3 = new javax.swing.JMenu();
		jMenuItem5 = new javax.swing.JMenuItem();
		jMenuItem5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmTrangChu frmTrangChu;
				try {
					frmTrangChu = new FrmTrangChu();
					frmTrangChu.setVisible(true);
				} catch (MalformedURLException | RemoteException | SQLException | NotBoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		jMenuItem4 = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel2.setBackground(new java.awt.Color(37, 109, 133));
		jPanel2.setPreferredSize(new Dimension(1200, 0));

		jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(223, 246, 255));
		jLabel1.setText("CHẤM CÔNG CÔNG NHÂN");

		jPanel1.setBackground(new java.awt.Color(37, 109, 133));
		jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jLabel4.setText("Ngày chấm:");

		btnChamCong.setText("Ngày hiện tại");

		btnXem.setText("Xem");
		jPanel6 = new javax.swing.JPanel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		txtMaNhanVien = new javax.swing.JTextField();
		txtHoTen = new javax.swing.JTextField();
		txtSoLuong = new javax.swing.JTextField();

		jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel7.setBackground(new java.awt.Color(71, 181, 255));
		jLabel7.setFont(new Font("Times New Roman", Font.PLAIN, 14)); // NOI18N
		jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel7.setText("THÔNG TIN CÁ NHÂN");

		jLabel8.setFont(new Font("Times New Roman", Font.PLAIN, 14)); // NOI18N
		jLabel8.setText("Họ tên: ");

		jLabel9.setFont(new Font("Times New Roman", Font.PLAIN, 14)); // NOI18N
		jLabel9.setText("Mã nhân viên: ");

		jLabel10.setFont(new Font("Times New Roman", Font.PLAIN, 14)); // NOI18N
		jLabel10.setText("Số lương: ");

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel6Layout
				.createSequentialGroup().addContainerGap()
				.addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel6Layout
						.createSequentialGroup()
						.addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addComponent(jLabel9)
								.addComponent(jLabel8, Alignment.TRAILING).addComponent(jLabel10, Alignment.TRAILING))
						.addGap(18)
						.addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtHoTen, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtSoLuong, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtMaNhanVien, GroupLayout.PREFERRED_SIZE, 172,
										GroupLayout.PREFERRED_SIZE)))
						.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
				.addContainerGap()));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel6Layout
				.createSequentialGroup().addContainerGap()
				.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE).addGap(2)
				.addGroup(jPanel6Layout
						.createParallelGroup(Alignment.BASELINE).addComponent(jLabel9).addComponent(txtMaNhanVien,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(jPanel6Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel8).addComponent(
						txtHoTen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(jPanel6Layout.createParallelGroup(Alignment.BASELINE).addComponent(txtSoLuong,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel10))
				.addGap(16)));
		jPanel6.setLayout(jPanel6Layout);

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout
				.createSequentialGroup().addGap(198).addComponent(jLabel4).addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup()
								.addComponent(btnXem, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnChamCong))
						.addComponent(dateNgayChamCong, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE))
				.addGap(183)
				.addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(103)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap(12, Short.MAX_VALUE)
						.addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE).addGap(11))
				.addGroup(Alignment.LEADING, jPanel3Layout.createSequentialGroup().addGap(55)
						.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING).addComponent(jLabel4)
								.addComponent(dateNgayChamCong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(18).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(btnXem)
								.addComponent(btnChamCong))
						.addContainerGap(58, Short.MAX_VALUE)));
		jPanel3.setLayout(jPanel3Layout);

		jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		btnSua.setFont(new Font("Times New Roman", Font.BOLD, 14)); // NOI18N
		btnSua.setText("Sửa");
		btnSua.setPreferredSize(new java.awt.Dimension(72, 40));
		btnSua.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSuaActionPerformed(evt);
			}
		});

		chkDiLamHet.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
		chkDiLamHet.setText("Đi làm hết");
		chkDiLamHet.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				chkDiLamHetActionPerformed(evt);
			}
		});

		JButton btnSua_1 = new JButton();
		btnSua_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChamCongDao chamCongDao;
				try {
					chamCongDao = (ChamCongDao) Naming.lookup("rmi://localhost:1403/chamCongDao");
					if (bStatusEdit == true) {
						chamCongDao.delChamCong(date2);
					}
					if (chamCongDao.bCheckChamCongDateNow() == true && bStatusEdit == false) {
						JOptionPane.showMessageDialog(null, "Ngay hom nay da cham cong roi, kiem viec khac lam di !");
						jTable1.setEnabled(false);
						chkDiLamHet.setEnabled(false);
						return;
					} else {
						int tblRow = jTable1.getRowCount();
						for (int j = 0; j < tblRow; j++) {
							Boolean diLamTemp = jTable1.getValueAt(j, 2) == null ? false
									: (Boolean) jTable1.getValueAt(j, 2);
							Boolean diTreTemp = jTable1.getValueAt(j, 3) == null ? false
									: (Boolean) jTable1.getValueAt(j, 3);
							int soLuongSPLamDuocTemp = jTable1.getValueAt(j, 4) == null ? -1
									: (int) jTable1.getValueAt(j, 4);
							if (!diLamTemp && !diTreTemp || soLuongSPLamDuocTemp < 0) {
								JOptionPane.showMessageDialog(null, "Vui long cham cong day du cac cong nhan !");
								return;
							} else if (diLamTemp && diTreTemp) {
								JOptionPane.showMessageDialog(null,
										"Vui long cham cong quang minh chinh dai, khong gian lan !!!");
								return;
							}
						}

						boolean bCheck = false;
						int tblRow1 = jTable1.getRowCount();
						System.out.println("Helllo111: " + tblRow1);
						for (int i = 0; i < tblRow1; i++) {
							String maCN = (String) jTable1.getValueAt(i, 0);
							Boolean diLam = (Boolean) jTable1.getValueAt(i, 2);
							Boolean diTre = jTable1.getValueAt(i, 3) == null ? false
									: (Boolean) jTable1.getValueAt(i, 3);
							diLam = diTre ? false : true;
							diTre = diLam ? false : true;
							int soLuongSPLamDuoc = (int) jTable1.getValueAt(i, 4) < 0 ? 0
									: (int) jTable1.getValueAt(i, 4);
							bCheck = chamCongDao.addChamCong(
									new ChamCong(date2, diLam, diTre, soLuongSPLamDuoc, new CongNhan(maCN, null)));
							if (bCheck == false) {
								bCheck = chamCongDao.addChamCong(
										new ChamCong(date2, diLam, diTre, soLuongSPLamDuoc, new CongNhan(maCN, null)));
							}
						}
						if (bCheck) {
							btnSua.setEnabled(false);
							if (bStatusEdit) {
								JOptionPane.showMessageDialog(null, "Luu cham cong thanh cong!");
								btnSua.setEnabled(false);
								return;
							}
							JOptionPane.showMessageDialog(null, "Cham cong thanh cong!");
							btnSua.setEnabled(false);
							return;
						}
					}
				} catch (MalformedURLException | RemoteException | NotBoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSua_1.setText("Lưu chấm công");
		btnSua_1.setPreferredSize(new Dimension(72, 40));
		btnSua_1.setFont(new Font("Times New Roman", Font.BOLD, 14));

		btnXaHt = new JButton();
		btnXaHt.setEnabled(false);
		btnXaHt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
				int tblRow = jTable1.getRowCount();
				for (int i = 0; i < tblRow; i++) {
					model.setValueAt(false, i, 2);
					model.setValueAt(false, i, 3);
					model.setValueAt(0, i, 4);
				}
			}
		});
		btnXaHt.setText("Xóa hết");
		btnXaHt.setPreferredSize(new Dimension(72, 40));
		btnXaHt.setFont(new Font("Times New Roman", Font.BOLD, 14));

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addGap(30).addComponent(chkDiLamHet).addContainerGap(32,
						Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addContainerGap(17, Short.MAX_VALUE)
						.addGroup(jPanel4Layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnXaHt, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSua, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSua_1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addGap(18)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel4Layout.createSequentialGroup().addGap(19).addComponent(chkDiLamHet)
						.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
						.addComponent(btnXaHt, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addComponent(btnSua, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addComponent(btnSua_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel4.setLayout(jPanel4Layout);

		jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

//        int tblRow = jTable1.getRowCount();
//		for (int i = tblRow - 1; i >= 0; i--) {
//			tableModel.removeRow(i);
//		}
//		for (HoaDon hd : hdDao.getAllHD()) {
//			tableModel.addRow(new Object[] {hd.getMaHoaDon(), hd.getNgayLap(), hd.getMaKH(),hd.getMaNV(),hd.getMaCH()});
//		}

		jTable1.setFont(new Font("Times New Roman", Font.PLAIN, 16)); // NOI18N
		String[] tieuDe = { "Mã Nhân Viên", "Họ Tên", "Đi làm", "Đi trễ", "Số lượng sản phẩm làm được" };
		JTableHeader tableHeader = jTable1.getTableHeader();
		tableHeader.setFont(new Font("Segoe UI", Font.BOLD, 12));
		tableHeader.setAlignmentY(RIGHT_ALIGNMENT);
		jTable1.setRowHeight(30);
		((DefaultTableCellRenderer) tableHeader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
		jTable1.setModel(tableModel = new DefaultTableModel(
				new Object[][] { { null, null, null, null, null }, { null, null, null, null, null },
						{ null, null, null, null, null }, { null, null, null, null, null },
						{ null, null, null, null, null }, },
				new String[] { "M\u00E3 Nh\u00E2n Vi\u00EAn", "H\u1ECD T\u00EAn", "\u0110i l\u00E0m",
						"\u0110i tr\u1EC5",
						"S\u1ED1 l\u01B0\u1EE3ng s\u1EA3n ph\u1EA9m l\u00E0m \u0111\u01B0\u1EE3c" }) {
			Class[] columnTypes = new Class[] { Object.class, Object.class, Boolean.class, Boolean.class,
					Integer.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});

		jTable1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					int rowSelect = jTable1.getSelectedRow();
					String maCN = (String) jTable1.getValueAt(rowSelect, 0);
					String tenCN = (String) jTable1.getValueAt(rowSelect, 1);
					txtMaNhanVien.setText(maCN);
					txtHoTen.setText(tenCN);
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});

		// can giua column
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		DefaultTableCellRenderer centerRenderer2 = new DefaultTableCellRenderer();
		centerRenderer2.setHorizontalAlignment(JLabel.LEFT);
		jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
		jTable1.getColumnModel().getColumn(1).setCellRenderer(centerRenderer2);
		jTable1.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
//        jTable1.setColumnModel({
//        	Class[] columnTypes = new Class[] {
//        		String.class, String.class, Boolean.class, Boolean.class, Integer.class
//        	};
//        	public Class getColumnClass(int columnIndex) {
//        		return columnTypes[columnIndex];
//        	}
//        });
		jScrollPane1.setViewportView(jTable1);

		jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
		jLabel2.setText("Lưu ý: ");

		jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
		jLabel5.setText("Nhân viên nghỉ làm thì không CHECK vào mục đi trễ và số sản phẩm làm được bằng 0");

		jLabel6.setBackground(new java.awt.Color(255, 102, 0));
		jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
		jLabel6.setText("BẢNG CHẤM CÔNG CÔNG NHÂN");

		btnTaiLai = new JButton();
		btnTaiLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					jTable1.setEnabled(true);
					loadChamCong();
				} catch (MalformedURLException | RemoteException | SQLException | NotBoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnTaiLai.setText("Tải lại");
		btnTaiLai.setPreferredSize(new Dimension(72, 40));
		btnTaiLai.setFont(new Font("Times New Roman", Font.BOLD, 14));

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel5Layout
				.createSequentialGroup()
				.addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel5Layout
						.createSequentialGroup().addContainerGap()
						.addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel5Layout.createSequentialGroup().addComponent(jLabel2)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(jLabel5)
										.addPreferredGap(ComponentPlacement.RELATED, 309, Short.MAX_VALUE).addComponent(
												btnTaiLai, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
								.addComponent(jScrollPane1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 977,
										Short.MAX_VALUE)))
						.addGroup(jPanel5Layout.createSequentialGroup().addGap(291).addComponent(jLabel6)))
				.addContainerGap()));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel5Layout
				.createSequentialGroup()
				.addGroup(jPanel5Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel5Layout.createSequentialGroup().addGap(14)
								.addGroup(jPanel5Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(jLabel5))
								.addGap(10).addComponent(jLabel6))
						.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(btnTaiLai,
								GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
				.addGap(18).addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE)));
		jPanel5.setLayout(jPanel5Layout);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup().addContainerGap()
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jPanel3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1176, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)))
				.addGap(22)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE)
								.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))
						.addGap(16)));
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 1212,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel1))
								.addContainerGap(19, Short.MAX_VALUE)));
		jPanel2Layout
				.setVerticalGroup(
						jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup().addGap(24).addComponent(jLabel1)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jPanel1,
												GroupLayout.PREFERRED_SIZE, 652, GroupLayout.PREFERRED_SIZE)
										.addContainerGap(19, Short.MAX_VALUE)));
		jPanel2.setLayout(jPanel2Layout);

		jMenuBar1.setBackground(new java.awt.Color(0, 153, 102));
		jMenuBar1.setPreferredSize(new java.awt.Dimension(200, 30));

		jMenu1.setText("Thông tin");

		jMenuItem1.setText("Cá nhân");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jMenuItem1ActionPerformed(evt);
				} catch (RemoteException | MalformedURLException | NotBoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		jMenu1.add(jMenuItem1);

		jMenuBar1.add(jMenu1);

		jMenu2.setText("Quản lý");

		jMenuItem2.setText("Lương");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jMenuItem2ActionPerformed(evt);
				} catch (MalformedURLException | RemoteException | NotBoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		jMenu2.add(jMenuItem2);

		jMenuItem3.setText("Nhân viên");
		jMenu2.add(jMenuItem3);

		jMenuBar1.add(jMenu2);

		jMenu3.setText("Chức năng");

		jMenuItem5.setText("Chấm công");
		jMenu3.add(jMenuItem5);

		jMenuItem4.setText("Đăng xuất");
		jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem4ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem4);

		jMenuBar1.add(jMenu3);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 1241, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(13, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 737, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(72, Short.MAX_VALUE)));
		getContentPane().setLayout(layout);
		pack();
		
		CongNhan maCNLogin = FrmDangNhap.maCNLogin;
        if(maCNLogin.getMaLoai().getMaLoai().equals("ML3"))
		{
        	jMenuItem2.setEnabled(false);
        	jMenuItem3.setEnabled(false);
			jMenuItem5.setEnabled(false);
		}
		else if (maCNLogin.getMaLoai().getMaLoai().equals("ML2")){
			jMenuItem3.setEnabled(false);
			jMenuItem5.setEnabled(false);
		}
		else {
			jMenuItem2.setEnabled(false);		
		}
		
		loadChamCong();
	}// </editor-fold>

	private void loadChamCong() throws SQLException, MalformedURLException, RemoteException, NotBoundException {
		// TODO Auto-generated method stub
		int tblRow = jTable1.getRowCount();
		for (int i = tblRow - 1; i >= 0; i--) {
			tableModel.removeRow(i);
		}
		CongNhanDao lstCongNhans = (CongNhanDao) Naming.lookup("rmi://localhost:1403/congNhanDao");
		for (CongNhan cn : lstCongNhans.getListCongNhan()) {
			tableModel.addRow(new Object[] { cn.getMaCN(), cn.getHoTen() });
		}
	}

	private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date1 = simpleDateFormat.format(dateCheckXoaDate);
		String date2 = simpleDateFormat.format(new java.util.Date());
		System.out.println(date1);
		System.out.println(date2);
		if (date1.equals(date2)) {
			jTable1.setEnabled(true);
			chkDiLamHet.setEnabled(true);
			btnXaHt.setEnabled(true);
			bStatusEdit = true;
			System.out.println("hello");
		} else {
			JOptionPane.showMessageDialog(null, "Chi chinh sua duoc cho ngay cham cong hien tai ! Tham lam ...");
		}
	}

	private void chkDiLamHetActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if (bCheckAllChamCong == false) {
			DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
			int tblRow = jTable1.getRowCount();
			for (int i = 0; i < tblRow; i++) {
				model.setValueAt(true, i, 2);
			}
			bCheckAllChamCong = true;
		} else {
			DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
			int tblRow = jTable1.getRowCount();
			for (int i = 0; i < tblRow; i++) {
				model.setValueAt(false, i, 2);
			}
			bCheckAllChamCong = false;
		}
	}

	private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		FrmDangNhap frmDangNhap;
		frmDangNhap = new FrmDangNhap();
		frmDangNhap.setVisible(true);

	}

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) throws RemoteException, MalformedURLException, NotBoundException {
		this.setVisible(false);
		new FrmXemThongTin().setVisible(true);
	}

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) throws MalformedURLException, RemoteException, NotBoundException, SQLException {
		// TODO add your handling code here:
		this.setVisible(false);
		new FrmLuongCongNhan().setVisible(true);
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
			java.util.logging.Logger.getLogger(FrmTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FrmTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FrmTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FrmTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new FrmTrangChu().setVisible(true);
				} catch (MalformedURLException | RemoteException | SQLException | NotBoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton btnChamCong;
	private javax.swing.JButton btnSua;
	private javax.swing.JButton btnXem;
	private javax.swing.JCheckBox chkDiLamHet;
	private com.toedter.calendar.JDateChooser dateNgayChamCong;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JMenuItem jMenuItem5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField txtHoTen;
	private javax.swing.JTextField txtMaNhanVien;
	private javax.swing.JTextField txtSoLuong;
	private JButton btnXaHt;
	private JButton btnTaiLai;
}
