package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entity.CongNhan;

public interface CongNhanDao extends Remote{
	public List<CongNhan> getListCongNhan() throws RemoteException;
	public CongNhan getCongNhan(String maCN) throws RemoteException;
	public boolean addCongNhan(CongNhan congNhan) throws RemoteException;
	public boolean delCongNhan(String congNhanId) throws RemoteException;
	public boolean updateCongNhan(CongNhan congNhan) throws RemoteException;
}
