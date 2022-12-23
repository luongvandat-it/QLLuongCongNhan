package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Window;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

public class FrmChiTietPhieuLuong extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JScrollPane scrollPane;
	private JLabel lblMaHD, lblTenKH,lblTongThue;
	private DefaultTableModel dataModel;
	private Locale localeVN = new Locale("vi", "VN");
	private NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
	private boolean bStatus = false;
	private JLabel lblTong,lblNgayLap;

	/**
	 * Launch the application.
	 */
	public interface FrmChiTietHDResponse{
		void getResponse(boolean bStatusPnCTHD);
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public FrmChiTietPhieuLuong(FrmChiTietHDResponse frmChiTietHDResponse, String maCN, String tenCN, String congDoan, String soLuongSPLD) throws ClassNotFoundException, SQLException {
		getContentPane().setBackground(SystemColor.inactiveCaption);
		setForeground(SystemColor.activeCaption);
		getContentPane().setForeground(SystemColor.activeCaption);
		getContentPane().setFont(new Font("Segoe UI", Font.PLAIN, 10));
		setBounds(100, 100, 408, 472);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PHIẾU LƯƠNG");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(144, 69, 111, 35);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TSMC");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(36, 9, 54, 26);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MST: 288 28 6868");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(13, 37, 121, 26);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ngày:");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_3.setBounds(219, 39, 54, 20);
		getContentPane().add(lblNewLabel_3);
		
		lblNgayLap = new JLabel("2425");
		lblNgayLap.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNgayLap.setBounds(283, 39, 87, 24);
		getContentPane().add(lblNgayLap);
		lblNgayLap.setText(maCN);
		
		JPanel panel = new JPanel();
		panel.setBounds(13, 133, 362, 106);
		getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		String[] tieuDe = { "Họ Tên","Số lượng","Đơn giá","Thành Tiền"};
		table.setRowHeight(30);
		panel.add(scrollPane = new JScrollPane(table = new JTable(dataModel = new DefaultTableModel(tieuDe, 0))));
		table.setRowHeight(15);
		
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
		table.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
		table.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
		table.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
		table.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
		
		JTableHeader tableHeader = table.getTableHeader();
		tableHeader.setFont(new Font("Segoe UI", Font.BOLD , 12));
		
		JLabel lblNewLabel_5 = new JLabel("Nhân Viên");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(294, 358, 78, 26);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Người nhận");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5_1.setBounds(17, 358, 98, 26);
		getContentPane().add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6 = new JLabel("(Ký ghi rõ họ tên)");
		lblNewLabel_6.setBounds(283, 382, 98, 13);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("(Ký ghi rõ họ tên)");
		lblNewLabel_6_1.setBounds(13, 382, 102, 13);
		getContentPane().add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Hotline: 0909 829 829");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(219, 10, 138, 26);
		getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_7 = new JLabel("Mã HD:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(36, 103, 54, 20);
		getContentPane().add(lblNewLabel_7);
		
		lblMaHD = new JLabel("MaHD");
		lblMaHD.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMaHD.setBounds(93, 103, 111, 20);
		getContentPane().add(lblMaHD);
		
		lblMaHD.setText("PL" + maCN);
		
		JLabel lblNewLabel_7_1 = new JLabel("Công đoạn:");
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_7_1.setBounds(219, 103, 65, 20);
		getContentPane().add(lblNewLabel_7_1);
		
		lblTenKH = new JLabel("Tên KH");
		lblTenKH.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTenKH.setBounds(296, 103, 92, 20);
		getContentPane().add(lblTenKH);
		lblTenKH.setText(congDoan);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(10, 9, 54, 51);
		getContentPane().add(lblNewLabel_9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(13, 307, 362, 42);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_5_2 = new JLabel("TỔNG TIỀN:");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5_2.setBounds(140, 9, 78, 26);
		panel_1.add(lblNewLabel_5_2);
		
		lblTong = new JLabel("VND");
		lblTong.setForeground(Color.RED);
		lblTong.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTong.setBounds(326, 9, 26, 26);
		panel_1.add(lblTong);
		
		JLabel lblThanhTien = new JLabel("New label");
		lblThanhTien.setForeground(Color.RED);
		lblThanhTien.setHorizontalAlignment(SwingConstants.CENTER);
		lblThanhTien.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblThanhTien.setBounds(228, 9, 99, 26);
		panel_1.add(lblThanhTien);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(13, 275, 362, 35);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblThue = new JLabel("THUẾ:");
		lblThue.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblThue.setBounds(173, 10, 44, 15);
		panel_2.add(lblThue);
		
		JLabel lblNewLabel_8 = new JLabel("- 5%");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setBounds(322, 11, 30, 13);
		panel_2.add(lblNewLabel_8);
		
		lblTongThue = new JLabel("0 ₫");
		lblTongThue.setForeground(Color.BLACK);
		lblTongThue.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblTongThue.setBounds(431, 10, 141, 26);
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date1 = simpleDateFormat.format(new Date());
		lblNgayLap.setText(date1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmChiTietHDResponse.getResponse(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon(FrmChiTietPhieuLuong.class.getResource("/imgs/cross.png")));
		btnNewButton.setBounds(366, 0, 22, 20);
		getContentPane().add(btnNewButton);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(13, 242, 362, 35);
		getContentPane().add(panel_2_1);
		
		JLabel lblPhCp = new JLabel("PHỤ CẤP: ");
		lblPhCp.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhCp.setBounds(153, 10, 66, 15);
		panel_2_1.add(lblPhCp);
		
		JLabel lblNewLabel_4 = new JLabel("800,000");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(308, 11, 55, 13);
		panel_2_1.add(lblNewLabel_4);
		
		int tblRow = table.getRowCount();
		for (int i = tblRow - 1; i >= 0; i--) {
			dataModel.removeRow(i);
		}
		//dataModel.addRow(new Object[] {hd.getMaHoaDon(), hd.getNgayLap(), hd.getMaKH(),hd.getMaNV(),hd.getMaCH()});
		int iDonGia = 0;
		int iThanhTien = 0;
		if(congDoan.equals("San Xuat"))
		{
			iDonGia = 20000;
		}
		else if(congDoan.equals("Kiem Tra")) {
			iDonGia = 2000;
		}
		else {
			iDonGia = 4000;
		}
		int iTong = Integer.parseInt(soLuongSPLD) * iDonGia;
		iThanhTien = (int) (iTong + 800000 - (iTong)*0.05);
			dataModel.addRow(new Object[] {tenCN, soLuongSPLD, iDonGia, String.format("%,8d%n",iTong)});
			lblThanhTien.setText( String.format("%,8d%n",iThanhTien));
		//loadTongTien();
		//loadNgayLapHD();

	}

}
