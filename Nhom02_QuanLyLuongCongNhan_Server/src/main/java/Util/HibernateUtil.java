package Util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class HibernateUtil {
	/**
	 * Launch the application. Tên: Dinh Quang Huy - Ngày tạo: 25/10/2022
	 */
private static HibernateUtil instance = null;
	
	private EntityManager entityManager;
	
	public HibernateUtil() {
		entityManager = Persistence.createEntityManagerFactory("Nhom02_QuanLyLuongCongNhan_Server")
				.createEntityManager();
	}
	
	public synchronized static HibernateUtil getInstance() {
		if(instance == null) {
			instance = new HibernateUtil();			
		}
		return instance;
		
	}
	public EntityManager getEntityManager() {
		return entityManager;
	}
}
