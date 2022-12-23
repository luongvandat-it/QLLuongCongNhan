package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

import entity.ChamCong;

public interface ChamCongDao extends Remote{
	public boolean addChamCong(ChamCong chamCong) throws RemoteException;
	public int getSoLuongSPTrongThang(String date, String year, String maCN) throws RemoteException;
	public List<ChamCong> getListChamCongFilterDate(Date date) throws RemoteException;
	public boolean updateChamCongCN(ChamCong chamCong) throws RemoteException;
	public boolean bCheckChamCongDateNow() throws RemoteException;
	public boolean delChamCong(Date date) throws RemoteException;
}
