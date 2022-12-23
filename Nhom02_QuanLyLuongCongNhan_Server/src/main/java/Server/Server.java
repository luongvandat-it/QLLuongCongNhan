package Server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.time.LocalDateTime;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import dao.ChamCongDao;
import dao.CongNhanDao;
import dao.LoaiCongNhanDao;
import dao.TaiKhoanDao;
import daoImpl.ChamCongDaoImpl;
import daoImpl.CongNhanDaoImpl;
import daoImpl.LoaiCongNhanDaoImpl;
import daoImpl.TaiKhoanDaoImpl;

public class Server {
	public static final String CONFIG = "rmi://localhost:1403";
	public static final int PORT = 1403;
	public static void main(String[] args) throws NamingException, RemoteException{
		SecurityManager securityManager= System.getSecurityManager();
		if(securityManager==null) {
			System.setProperty("java.security.policy", "policy/policy.policy");
			System.setSecurityManager(new SecurityManager());
		}
		Context context = new InitialContext();
		try {
			ChamCongDao chamCongDao = new ChamCongDaoImpl();
			CongNhanDao congNhanDao = new CongNhanDaoImpl();
			LoaiCongNhanDao loaiCongNhanDao = new LoaiCongNhanDaoImpl();
			TaiKhoanDao taiKhoanDao = new TaiKhoanDaoImpl();
			
			LocateRegistry.createRegistry(PORT);
			context.bind(CONFIG + "/chamCongDao", chamCongDao);
			context.bind(CONFIG + "/congNhanDao", congNhanDao);
			context.bind(CONFIG + "/loaiCongNhanDao", loaiCongNhanDao);
			context.bind(CONFIG + "/taiKhoanDao", taiKhoanDao);
			System.out.println("Server started at " + LocalDateTime.now() + " on port " + PORT);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
