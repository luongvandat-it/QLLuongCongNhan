package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import Util.HibernateUtil;
import dao.LoaiCongNhanDao;
import entity.LoaiCongNhan;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class LoaiCongNhanDaoImpl extends UnicastRemoteObject implements LoaiCongNhanDao{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	EntityManager entityManager;
	EntityTransaction entityTransaction;

	public LoaiCongNhanDaoImpl() throws RemoteException {
		// TODO Auto-generated constructor stub
		this.entityManager = HibernateUtil.getInstance().getEntityManager();
	}

	@Override
	public List<LoaiCongNhan> getListLoaiCongNhan() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addLoaiCongNhan(LoaiCongNhan loaiCongNhan) throws RemoteException {
		// TODO Auto-generated method stub
		entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			entityManager.persist(loaiCongNhan);
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
	public boolean delLoaiCongNhan(String idLoaiCN) throws RemoteException {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public boolean updateLoaiCongNhan(LoaiCongNhan loaiCongNhan) throws RemoteException {
		// TODO Auto-generated method stub
		entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			LoaiCongNhan loaiCN = entityManager.find(LoaiCongNhan.class, loaiCongNhan.getMaLoai());
			loaiCN.setTenLoai(loaiCongNhan.getTenLoai());
			loaiCN.setTrangThai(loaiCongNhan.getTrangThai());
			entityManager.merge(loaiCN);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

}
