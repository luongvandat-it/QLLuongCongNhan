package app;

import java.rmi.RemoteException;
import java.util.Date;

import dao.ChamCongDao;
import dao.CongNhanDao;
import dao.TaiKhoanDao;
import daoImpl.ChamCongDaoImpl;
import daoImpl.CongNhanDaoImpl;
import daoImpl.TaiKhoanDaoImpl;
import entity.CongNhan;
import entity.TaiKhoan;

public class App {
	public static void main(String[] args) throws RemoteException {
		//CongNhanDao congNhanDao = new CongNhanDaoImpl();
		//System.out.println(congNhanDao.getListCongNhan());
		
		//TaiKhoanDao taiKhoanDao = new TaiKhoanDaoImpl();
		//System.out.println(taiKhoanDao.getTaiKhoan("0335293294"));
		
		ChamCongDao chamCongDao = new ChamCongDaoImpl();
		//chamCongDao.delChamCong(new Date());
		//int ix = chamCongDao.getSoLuongSPTrongThang("1", "2020", "CN005");
		//System.out.println(ix);
		//boolean b = chamCongDao.bCheckChamCongDateNow();
		//System.out.println(b);
		chamCongDao.getListChamCongFilterDate(new Date()).forEach(s -> System.out.println(s));
		
//		CongNhanDao congNhanDao = new CongNhanDaoImpl();
//		CongNhan cNhan = congNhanDao.getCongNhan("CN001");
//		System.out.println(cNhan);
	}
}
