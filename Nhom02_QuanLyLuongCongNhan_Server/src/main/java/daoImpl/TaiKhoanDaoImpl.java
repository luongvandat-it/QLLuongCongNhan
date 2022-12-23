package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import Util.HibernateUtil;
import dao.TaiKhoanDao;
import entity.TaiKhoan;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class TaiKhoanDaoImpl extends UnicastRemoteObject implements TaiKhoanDao{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	EntityManager entityManager;
	EntityTransaction entityTransaction;

	public TaiKhoanDaoImpl() throws RemoteException {
		// TODO Auto-generated constructor stub
		this.entityManager = HibernateUtil.getInstance().getEntityManager();
	}

	@Override
	public boolean addTaiKhoan(TaiKhoan taiKhoan) throws RemoteException {
		// TODO Auto-generated method stub
		entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			entityManager.persist(taiKhoan);
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
	public boolean delTaiKhoan(String sdt) throws RemoteException {
		// TODO Auto-generated method stub
		entityTransaction = entityManager.getTransaction();
		//TaiKhoan taiKhoan = entityManager.createNativeQuery("select * from TaiKhoan tk where tk.sdt =\'" + sdt + "\'", TaiKhoan.class).getFirstResult();
		TaiKhoan tk = null;
		try {
			entityTransaction.begin();
			 tk = entityManager.find(TaiKhoan.class, sdt);
			 entityManager.remove(tk);
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
	public boolean updateTaiKhoan(TaiKhoan taiKhoan) throws RemoteException {
		// TODO Auto-generated method stub
		entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			TaiKhoan tk = entityManager.find(TaiKhoan.class, taiKhoan.getSdt());
			tk.setMatKhau(taiKhoan.getMatKhau());
			entityManager.merge(tk);
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
	public TaiKhoan getTaiKhoan(String sdt) throws RemoteException {
		// TODO Auto-generated method stub
		entityTransaction = entityManager.getTransaction();
		TaiKhoan taiKhoan = null;
		try {
			entityTransaction.begin();
				taiKhoan = entityManager.find(TaiKhoan.class, sdt);
			entityTransaction.commit();
			return taiKhoan;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			entityTransaction.rollback();
		}
		return taiKhoan;
	}

}
