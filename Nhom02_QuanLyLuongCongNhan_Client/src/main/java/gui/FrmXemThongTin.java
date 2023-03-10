/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import dao.ChamCongDao;
import dao.CongNhanDao;
import entity.CongNhan;

import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

/**
 *
 * @author Van Dat
 */
public class FrmXemThongTin extends javax.swing.JFrame {

    /**
     * Creates new form FrmTrangChu
     * @throws NotBoundException 
     * @throws MalformedURLException 
     * @throws RemoteException 
     */
    public FrmXemThongTin() throws RemoteException, MalformedURLException, NotBoundException {
        setTitle("Xem thông tin cá nhân");
        initComponents();
        setSize(1276, 800);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * @throws RemoteException 
     * @throws NotBoundException 
     * @throws MalformedURLException 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() throws RemoteException, MalformedURLException, NotBoundException {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        imgAnhNhanVien = new javax.swing.JPanel();
        lblMaNhanVien = new javax.swing.JLabel();
        lblMaNhanVien.setForeground(Color.WHITE);
        lblNgaySinh = new javax.swing.JLabel();
        lblNgaySinh.setForeground(Color.WHITE);
        lblGioiTinh = new javax.swing.JLabel();
        lblGioiTinh.setForeground(Color.WHITE);
        lblSoDienThoai = new javax.swing.JLabel();
        lblSoDienThoai.setForeground(Color.WHITE);
        lblDiaChi = new javax.swing.JLabel();
        lblDiaChi.setForeground(Color.WHITE);
        lblDonViQuanLy = new javax.swing.JLabel();
        lblDonViQuanLy.setForeground(Color.WHITE);
        lblLoaiNhanVien = new javax.swing.JLabel();
        lblLoaiNhanVien.setForeground(Color.WHITE);
        lblHoTen = new javax.swing.JLabel();
        lblHoTen.setForeground(Color.WHITE);
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblDonGia = new javax.swing.JLabel();
        lblSLSPLD = new javax.swing.JLabel();
        lblThue = new javax.swing.JLabel();
        lblSoNgayCong = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		FrmLuongCongNhan frmLuongCongNhan;
				try {
					frmLuongCongNhan = new FrmLuongCongNhan();
					frmLuongCongNhan.setVisible(true);
				} catch (MalformedURLException | RemoteException | NotBoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        	}
        });
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		FrmQuanLyCongNhan frmQuanLyCongNhan;
				try {
					frmQuanLyCongNhan = new FrmQuanLyCongNhan();
					frmQuanLyCongNhan.setVisible(true);
				} catch (MalformedURLException | RemoteException | NotBoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        	}
        });
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(37, 109, 133));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 650));

        jLabel1.setFont(new Font("Segoe UI", Font.BOLD, 26)); // NOI18N
        jLabel1.setForeground(Color.ORANGE);
        jLabel1.setText("THÔNG TIN CÁ NHÂN");

        jPanel1.setBackground(new java.awt.Color(37, 109, 133));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setIcon(new ImageIcon(FrmXemThongTin.class.getResource("/imgs/user.png")));

        javax.swing.GroupLayout imgAnhNhanVienLayout = new javax.swing.GroupLayout(imgAnhNhanVien);
        imgAnhNhanVienLayout.setHorizontalGroup(
        	imgAnhNhanVienLayout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
        );
        imgAnhNhanVienLayout.setVerticalGroup(
        	imgAnhNhanVienLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(lblNewLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
        );
        imgAnhNhanVien.setLayout(imgAnhNhanVienLayout);

        lblMaNhanVien.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        lblMaNhanVien.setText("M\u00E3 nh\u00E2n vi\u00EAn: ");

        lblNgaySinh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        lblNgaySinh.setText("Ng\u00E0y sinh: ");

        lblGioiTinh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        lblGioiTinh.setText("Gi\u1EDBi t\u00EDnh: ");

        lblSoDienThoai.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        lblSoDienThoai.setText("S\u0111t: ");

        lblDiaChi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        lblDiaChi.setText("\u0110\u1ECBa ch\u1EC9: ");

        lblDonViQuanLy.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        lblDonViQuanLy.setText("Công đoạn: ");

        lblLoaiNhanVien.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        lblLoaiNhanVien.setText("Lo\u1EA1i nh\u00E2n vi\u00EAn: ");

        lblHoTen.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        lblHoTen.setText("H\u1ECD t\u00EAn: ");

        jPanel4.setBackground(new java.awt.Color(37, 109, 133));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new Font("Times New Roman", Font.BOLD, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CHI TI\u1EBET L\u01AF\u01A0NG");

        lblDonGia.setFont(new Font("Dialog", Font.PLAIN, 16)); // NOI18N
        lblDonGia.setForeground(new java.awt.Color(255, 255, 255));
        lblDonGia.setText("Đơn giá: ");

        lblSLSPLD.setFont(new Font("Dialog", Font.PLAIN, 16)); // NOI18N
        lblSLSPLD.setForeground(new java.awt.Color(255, 255, 255));
        lblSLSPLD.setText("Số lượng sản phẩm làm được: ");

        lblThue.setFont(new Font("Dialog", Font.PLAIN, 16)); // NOI18N
        lblThue.setForeground(new java.awt.Color(255, 255, 255));
        lblThue.setText("Phụ cấp: ");

        lblSoNgayCong.setFont(new Font("Dialog", Font.PLAIN, 16)); // NOI18N
        lblSoNgayCong.setForeground(new java.awt.Color(255, 255, 255));
        lblSoNgayCong.setText("Thuế: ");

        jLabel16.setFont(new Font("Dialog", Font.BOLD, 20)); // NOI18N
        jLabel16.setForeground(Color.CYAN);
        jLabel16.setText("T\u1ED5ng l\u01B0\u01A1ng nh\u1EADn: ");
        
        lblSLSPShow = new JLabel("New label");
        lblSLSPShow.setHorizontalAlignment(SwingConstants.CENTER);
        lblSLSPShow.setForeground(new Color(255, 255, 51));
        lblSLSPShow.setFont(new Font("Tahoma", Font.PLAIN, 17));
        
        lblDonGiaShow = new JLabel("New label");
        lblDonGiaShow.setHorizontalAlignment(SwingConstants.CENTER);
        lblDonGiaShow.setForeground(new Color(255, 255, 51));
        lblDonGiaShow.setFont(new Font("Tahoma", Font.PLAIN, 17));
        
        lblPhuCapShow = new JLabel("New label");
        lblPhuCapShow.setHorizontalAlignment(SwingConstants.CENTER);
        lblPhuCapShow.setForeground(new Color(255, 255, 51));
        lblPhuCapShow.setFont(new Font("Tahoma", Font.PLAIN, 17));
        
        lblThueShow = new JLabel("5 %");
        lblThueShow.setHorizontalAlignment(SwingConstants.CENTER);
        lblThueShow.setForeground(new Color(255, 255, 51));
        lblThueShow.setFont(new Font("Tahoma", Font.PLAIN, 17));
        
        lblTongLuongNhanShow = new JLabel("New label");
        lblTongLuongNhanShow.setHorizontalAlignment(SwingConstants.CENTER);
        lblTongLuongNhanShow.setForeground(Color.PINK);
        lblTongLuongNhanShow.setFont(new Font("Tahoma", Font.BOLD, 20));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4Layout.setHorizontalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel4Layout.createSequentialGroup()
        			.addContainerGap(236, Short.MAX_VALUE)
        			.addComponent(jLabel10)
        			.addGap(148))
        		.addGroup(jPanel4Layout.createSequentialGroup()
        			.addGap(51)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblSLSPLD)
        				.addComponent(jLabel16)
        				.addComponent(lblDonGia)
        				.addComponent(lblSoNgayCong)
        				.addComponent(lblThue))
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblDonGiaShow, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblSLSPShow, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblPhuCapShow, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblThueShow, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblTongLuongNhanShow, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel4Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblSLSPLD, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblSLSPShow))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblDonGia, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblDonGiaShow))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblThue, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblPhuCapShow))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblSoNgayCong, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblThueShow))
        			.addGap(18)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(lblTongLuongNhanShow, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 21, Short.MAX_VALUE))
        			.addGap(23))
        );
        jPanel4.setLayout(jPanel4Layout);
        
        JLabel lblMaNVShow = new JLabel("New label");
        lblMaNVShow.setForeground(new Color(255, 255, 51));
        lblMaNVShow.setFont(new Font("Tahoma", Font.PLAIN, 17));
        
        lblHoTenShow = new JLabel("New label");
        lblHoTenShow.setForeground(new Color(255, 255, 51));
        lblHoTenShow.setFont(new Font("Tahoma", Font.PLAIN, 17));
        
        lblNgaySinhShow = new JLabel("New label");
        lblNgaySinhShow.setForeground(new Color(255, 255, 51));
        lblNgaySinhShow.setFont(new Font("Tahoma", Font.PLAIN, 17));
        
        lblGioiTinhShow = new JLabel("New label");
        lblGioiTinhShow.setForeground(new Color(255, 255, 51));
        lblGioiTinhShow.setFont(new Font("Tahoma", Font.PLAIN, 17));
        
        lblSdtShow = new JLabel("New label");
        lblSdtShow.setForeground(new Color(255, 255, 51));
        lblSdtShow.setFont(new Font("Tahoma", Font.PLAIN, 17));
        
        lblDiaChiShow = new JLabel("New label");
        lblDiaChiShow.setForeground(new Color(255, 255, 51));
        lblDiaChiShow.setFont(new Font("Tahoma", Font.PLAIN, 17));
        
        lblCongDoanShow = new JLabel("New label");
        lblCongDoanShow.setForeground(new Color(255, 255, 51));
        lblCongDoanShow.setFont(new Font("Tahoma", Font.PLAIN, 17));
        
        lblLoaiNVShow = new JLabel("New label");
        lblLoaiNVShow.setForeground(new Color(255, 255, 51));
        lblLoaiNVShow.setFont(new Font("Tahoma", Font.PLAIN, 17));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(81)
        			.addComponent(imgAnhNhanVien, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblLoaiNhanVien)
        				.addComponent(lblDonViQuanLy)
        				.addComponent(lblDiaChi)
        				.addComponent(lblMaNhanVien)
        				.addComponent(lblSoDienThoai)
        				.addComponent(lblGioiTinh)
        				.addComponent(lblNgaySinh)
        				.addComponent(lblHoTen))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblHoTenShow, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblNgaySinhShow, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblGioiTinhShow, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblSdtShow, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblCongDoanShow, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblLoaiNVShow, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblDiaChiShow, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(35))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(lblMaNVShow, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap(574, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(103)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(imgAnhNhanVien, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        					.addGroup(jPanel1Layout.createSequentialGroup()
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(lblMaNhanVien, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
        							.addComponent(lblMaNVShow))
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(lblHoTen, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
        							.addComponent(lblHoTenShow))
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(lblNgaySinh, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
        							.addComponent(lblNgaySinhShow))
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(lblGioiTinh, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
        							.addComponent(lblGioiTinhShow))
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(lblSoDienThoai, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
        							.addComponent(lblSdtShow))
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(lblDiaChi, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
        							.addComponent(lblDiaChiShow, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(lblDonViQuanLy, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
        							.addComponent(lblCongDoanShow))
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(lblLoaiNhanVien, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
        							.addComponent(lblLoaiNVShow)))
        					.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap(491, Short.MAX_VALUE)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 348, GroupLayout.PREFERRED_SIZE)
        			.addGap(404))
        		.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup()
        			.addGap(40)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 1193, Short.MAX_VALUE)
        			.addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap(160, Short.MAX_VALUE)
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 382, GroupLayout.PREFERRED_SIZE)
        			.addGap(151))
        );
        jPanel2.setLayout(jPanel2Layout);

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 102));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(200, 30));

        jMenu1.setText("Thông tin");

        jMenuItem1.setText("Cá nhân");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");

        jMenuItem2.setText("Lương");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Nhân viên");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Chức năng");
        
        jMenuItem5 = new JMenuItem();
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
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 1243, GroupLayout.PREFERRED_SIZE)
        			.addGap(91))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 739, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        CongNhan congNhan = FrmDangNhap.maCNLogin;
        lblMaNVShow.setText(congNhan.getMaCN().toString());
        lblHoTenShow.setText(congNhan.getHoTen());
        lblNgaySinhShow.setText( dateFormat.format(congNhan.getNgaySinh()));
        lblGioiTinhShow.setText(congNhan.getGioiTinh());
        lblSdtShow.setText(congNhan.getSdt());
        lblDiaChiShow.setText(congNhan.getDiaChi());
        if(congNhan.getMaCN().toString().equals("ML3"))
        {
        	lblCongDoanShow.setText(congNhan.getCongDoan());
        }
        else {
			lblCongDoanShow.setText("");
		}
        lblLoaiNVShow.setText(congNhan.getMaLoai().getTenLoai());
        
        if(congNhan.getCongDoan() == null)
        {
        	lblSLSPShow.setText("");
        	lblDonGiaShow.setText("");
        	lblThueShow.setText("");
        	lblPhuCapShow.setText("");
        	lblTongLuongNhanShow.setText("");
        }
        else {
        	lblCongDoanShow.setText(congNhan.getCongDoan());
        	ChamCongDao chamCongDao = (ChamCongDao) Naming.lookup("rmi://localhost:1403/chamCongDao");
    		int iSumSLSPLamDuoc = 0;
    		int iThucNhan = 0;
    		int iDonGia = 0;
    		java.util.Date date= new Date();
    		Calendar cal = Calendar.getInstance();
    		cal.setTime(date);
    		int month = cal.get(Calendar.MONTH);
    		int year = cal.get(Calendar.YEAR);
    			iSumSLSPLamDuoc = chamCongDao.getSoLuongSPTrongThang(Integer.toString(month), Integer.toString(year), congNhan.getMaCN().toString());
    			if(congNhan.getCongDoan().toString().equals("San Xuat"))
    			{
    				iDonGia = 20000;
    			}
    			else if(congNhan.getCongDoan().toString().equals("Kiem Tra")) {
    				iDonGia = 2000;
    			}
    			else {
    				iDonGia = 4000;
    			}
    			iThucNhan = (int) (iSumSLSPLamDuoc * iDonGia + 800000 - (iSumSLSPLamDuoc * iDonGia*0.05));
    			
    			lblSLSPShow.setText(iSumSLSPLamDuoc + "");
    			lblDonGiaShow.setText(iDonGia + "");
    			lblPhuCapShow.setText("800.000");
    			lblThueShow.setText("5 %");
    			lblTongLuongNhanShow.setText(String.format("%,8d%n",iThucNhan));
		}
        
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
			//tableModel.addRow(new Object[] { cn.getMaCN(), cn.getHoTen(), cn.getCongDoan(), iSumSLSPLamDuoc, "800.000", "0.15", String.format("%,8d%n",iTongLuong),String.format("%,8d%n",iThucNhan)});
        
    }// </editor-fold>                        

	private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
		this.setVisible(false);
		new FrmDangNhap().setVisible(true);
    }                                          

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
    }                                          

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmXemThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmXemThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmXemThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmXemThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new FrmXemThongTin().setVisible(true);
				} catch (RemoteException | MalformedURLException | NotBoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel imgAnhNhanVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblDonViQuanLy;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblLoaiNhanVien;
    private javax.swing.JLabel lblSLSPLD;
    private javax.swing.JLabel lblMaNhanVien;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblDonGia;
    private javax.swing.JLabel lblSoDienThoai;
    private javax.swing.JLabel lblSoNgayCong;
    private javax.swing.JLabel lblThue;
    private JMenuItem jMenuItem5;
    private JLabel lblNewLabel;
    private JLabel lblHoTenShow;
    private JLabel lblNgaySinhShow;
    private JLabel lblGioiTinhShow;
    private JLabel lblSdtShow;
    private JLabel lblDiaChiShow;
    private JLabel lblCongDoanShow;
    private JLabel lblLoaiNVShow;
    private JLabel lblSLSPShow;
    private JLabel lblDonGiaShow;
    private JLabel lblPhuCapShow;
    private JLabel lblThueShow;
    private JLabel lblTongLuongNhanShow;
}
