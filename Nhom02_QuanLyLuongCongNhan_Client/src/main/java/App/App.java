package App;

import java.rmi.Naming;

import dao.CongNhanDao;
import dao.TaiKhoanDao;
import entity.TaiKhoan;
import gui.FrmDangNhap;

public class App {
	public static void main(String[] args) {
		try {
			FrmDangNhap frmDN = new FrmDangNhap();
			frmDN.setVisible(true);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
