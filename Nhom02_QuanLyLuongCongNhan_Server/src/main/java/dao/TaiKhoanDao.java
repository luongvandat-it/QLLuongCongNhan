package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import entity.TaiKhoan;

public interface TaiKhoanDao extends Remote{
	public boolean addTaiKhoan(TaiKhoan taiKhoan) throws RemoteException;
	public TaiKhoan getTaiKhoan(String sdt) throws RemoteException;
	public boolean delTaiKhoan(String sdt) throws RemoteException;
	public boolean updateTaiKhoan(TaiKhoan taiKhoan) throws RemoteException;
}
