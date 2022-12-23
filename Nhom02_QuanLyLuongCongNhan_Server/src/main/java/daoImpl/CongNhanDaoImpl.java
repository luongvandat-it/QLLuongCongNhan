package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import Util.HibernateUtil;
import dao.CongNhanDao;
import entity.CongNhan;
import entity.TaiKhoan;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class CongNhanDaoImpl extends UnicastRemoteObject implements CongNhanDao{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	EntityManager entityManager;
	EntityTransaction entityTransaction;

	public CongNhanDaoImpl() throws RemoteException {
		// TODO Auto-generated constructor stub
		this.entityManager = HibernateUtil.getInstance().getEntityManager();
	}

	@Override
	public List<CongNhan> getListCongNhan() throws RemoteException {
		// TODO Auto-generated method stub
		entityTransaction = entityManager.getTransaction();
		List<CongNhan> lstCongNhans = null;
		try {
			entityTransaction.begin();
			lstCongNhans = entityManager.createNativeQuery("select * from CongNhan cn where cn.maLoai='ML3'", CongNhan.class).getResultList();
			entityTransaction.commit();
			return lstCongNhans;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			entityTransaction.rollback();
		}
		return lstCongNhans;
	}

	@Override
	public boolean addCongNhan(CongNhan congNhan) throws RemoteException {
		// TODO Auto-generated method stub
		entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			entityManager.persist(congNhan);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			entityTransaction.rollback();
		}
		return false;
	}

	@Override
	public boolean delCongNhan(String congNhanId) throws RemoteException {
		// TODO Auto-generated method stub
		entityTransaction = entityManager.getTransaction();
		//TaiKhoan taiKhoan = entityManager.createNativeQuery("select * from TaiKhoan tk where tk.sdt =\'" + sdt + "\'", TaiKhoan.class).getFirstResult();
		CongNhan cn = null;
		try {
			entityTransaction.begin();
			cn = entityManager.find(CongNhan.class, congNhanId);
			 entityManager.remove(cn);
			entityTransaction.commit();
			return true;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			entityTransaction.rollback();
		}
		return false;
	}

	@Override
	public boolean updateCongNhan(CongNhan congNhan) throws RemoteException {
		// TODO Auto-generated method stub
		entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			CongNhan cn = entityManager.find(CongNhan.class, congNhan.getMaCN());
			cn.setDiaChi(congNhan.getDiaChi());
			cn.setGioiTinh(congNhan.getGioiTinh());
			cn.setHoTen(congNhan.getHoTen());
			cn.setNgaySinh(congNhan.getNgaySinh());
			cn.setNgayVaoLam(congNhan.getNgayVaoLam());
			cn.setSdt(congNhan.getSdt());
			cn.setTrangThai(congNhan.getTrangThai());
			entityManager.merge(cn);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			entityTransaction.rollback();
		}
		return false;
	}

	@Override
	public CongNhan getCongNhan(String maCN) throws RemoteException {
		// TODO Auto-generated method stub
		entityTransaction = entityManager.getTransaction();
		CongNhan congNhan = null;
		try {
			entityTransaction.begin();
				congNhan = entityManager.find(CongNhan.class, maCN);
			entityTransaction.commit();
			return congNhan;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			entityTransaction.rollback();
		}
		return null;
	}

}
