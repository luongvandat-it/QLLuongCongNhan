package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import entity.LoaiCongNhan;

public interface LoaiCongNhanDao extends Remote{
	public List<LoaiCongNhan> getListLoaiCongNhan() throws RemoteException;
	public boolean addLoaiCongNhan(LoaiCongNhan loaiCongNhan) throws RemoteException;
	public boolean delLoaiCongNhan(String idLoaiCN) throws RemoteException;
	public boolean updateLoaiCongNhan(LoaiCongNhan loaiCongNhan) throws RemoteException;
}
