package entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class LoaiCongNhan implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String maLoai;
	@Column(name = "tenLoai", columnDefinition = "nvarchar(255)")
	private String tenLoai;
	private String trangThai;
	
	@OneToMany(mappedBy = "maLoai", fetch = FetchType.EAGER)
	private List<CongNhan> lstCongNhan;
	
	public LoaiCongNhan() {
		// TODO Auto-generated constructor stub
	}

	public LoaiCongNhan(String maLoai, String tenLoai, String trangThai) {
		super();
		this.maLoai = maLoai;
		this.tenLoai = tenLoai;
		this.trangThai = trangThai;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(lstCongNhan, maLoai, tenLoai, trangThai);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoaiCongNhan other = (LoaiCongNhan) obj;
		return Objects.equals(lstCongNhan, other.lstCongNhan) && Objects.equals(maLoai, other.maLoai)
				&& Objects.equals(tenLoai, other.tenLoai) && Objects.equals(trangThai, other.trangThai);
	}

	public String getMaLoai() {
		return maLoai;
	}

	public void setMaLoai(String maLoai) {
		this.maLoai = maLoai;
	}

	public String getTenLoai() {
		return tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	@Override
	public String toString() {
		return "LoaiCongNhan [maLoai=" + maLoai + ", tenLoai=" + tenLoai + ", trangThai=" + trangThai + "]";
	}
	
	
}
