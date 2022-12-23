package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Util.HibernateUtil;
import dao.ChamCongDao;
import entity.ChamCong;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

public class ChamCongDaoImpl extends UnicastRemoteObject implements ChamCongDao{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	EntityManager entityManager;
	EntityTransaction entityTransaction;


	public ChamCongDaoImpl() throws RemoteException {
		// TODO Auto-generated constructor stub
		this.entityManager = HibernateUtil.getInstance().getEntityManager();
	}

	

	@SuppressWarnings("unchecked")
	@Override
	public List<ChamCong> getListChamCongFilterDate(Date date) throws RemoteException {
		// TODO Auto-generated method stub
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date1 = simpleDateFormat.format(date);
		entityTransaction = entityManager.getTransaction();
		List<ChamCong> lstChamCong = new ArrayList<ChamCong>();
		try {
			entityTransaction.begin();
			lstChamCong = entityManager.createNativeQuery("select * from ChamCong cn where CAST(cn.ngayDiLam AS DATE) = '" + date1 + "'",ChamCong.class).getResultList();
			entityTransaction.commit();
			return lstChamCong;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			entityTransaction.rollback();
		}
		return lstChamCong;
	}

	@Override
	public boolean updateChamCongCN(ChamCong chamCong) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addChamCong(ChamCong chamCong) throws RemoteException {
		// TODO Auto-generated method stub
		entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			entityManager.persist(chamCong);
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
	public boolean bCheckChamCongDateNow() throws RemoteException {
		entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			Query query = entityManager.createQuery("select count(cn.soSanPhamLamDuoc) from ChamCong cn where CAST(cn.ngayDiLam AS DATE) = CAST( GETDATE() AS DATE)");
			Long count = (Long) query.getSingleResult();
			 if(count > 0)
			 {
				 entityTransaction.commit();
				 return true;
			 }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			entityTransaction.rollback();
		}
		return false;
	}

	@Override
	public boolean delChamCong(Date date) throws RemoteException {
		// TODO Auto-generated method stub
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date1 = simpleDateFormat.format(date);
		entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			Query query = entityManager.createQuery("delete from ChamCong where  CAST(ngayDiLam AS DATE) = '"+ date1 + "'");
			 int deletedCount = query.executeUpdate();
			 if(deletedCount != 0)
			 {
				 entityTransaction.commit();
				 return true;
			 }
			return false;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			entityTransaction.rollback();
		}
		return false;
	}

	@Override
	public int getSoLuongSPTrongThang(String date, String year, String maCN) throws RemoteException {
		// TODO Auto-generated method stub
		entityTransaction = entityManager.getTransaction();
		try {
			Query query = entityManager.createQuery("select SUM(c.soSanPhamLamDuoc) from ChamCong c where YEAR(c.ngayDiLam) = '"+year.trim()+"' AND MONTH(c.ngayDiLam) = '"+date.trim()+"' AND c.maCN = '"+maCN.trim()+"'");
			Long count = (Long) query.getSingleResult();
			int x = count == null ? 0 : (int) (long) count;
			return x;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			entityTransaction.rollback();
		}
		return 0;
	}


}
