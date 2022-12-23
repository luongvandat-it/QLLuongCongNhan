package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ChamCong implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maChamCong;
	private Date ngayDiLam;
	private Boolean diLam;
	private Boolean diTre;
	private int soSanPhamLamDuoc;

	@ManyToOne
	@JoinColumn(name = "maCN")
	private CongNhan maCN;

	public ChamCong() {
		// TODO Auto-generated constructor stub
	}

	public ChamCong(Date ngayDiLam, Boolean diLam, Boolean diTre, int soSanPhamLamDuoc, CongNhan maCN) {
		super();
		this.ngayDiLam = ngayDiLam;
		this.diLam = diLam;
		this.diTre = diTre;
		this.soSanPhamLamDuoc = soSanPhamLamDuoc;
		this.maCN = maCN;
	}

	@Override
	public int hashCode() {
		return Objects.hash(diLam, diTre, maCN, maChamCong, ngayDiLam, soSanPhamLamDuoc);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChamCong other = (ChamCong) obj;
		return Objects.equals(diLam, other.diLam) && Objects.equals(diTre, other.diTre)
				&& Objects.equals(maCN, other.maCN) && Objects.equals(maChamCong, other.maChamCong)
				&& Objects.equals(ngayDiLam, other.ngayDiLam) && soSanPhamLamDuoc == other.soSanPhamLamDuoc;
	}

	public int getSoSanPhamLamDuoc() {
		return soSanPhamLamDuoc;
	}

	public void setSoSanPhamLamDuoc(int soSanPhamLamDuoc) {
		this.soSanPhamLamDuoc = soSanPhamLamDuoc;
	}

	public CongNhan getMaCN() {
		return maCN;
	}

	public void setMaCN(CongNhan maCN) {
		this.maCN = maCN;
	}

	public Date getNgayDiLam() {
		return ngayDiLam;
	}

	public void setNgayDiLam(Date ngayDiLam) {
		this.ngayDiLam = ngayDiLam;
	}

	public Boolean getDiLam() {
		return diLam;
	}

	public void setDiLam(Boolean diLam) {
		this.diLam = diLam;
	}

	public Boolean getDiTre() {
		return diTre;
	}

	public void setDiTre(Boolean diTre) {
		this.diTre = diTre;
	}

	public int getsoSanPhamLamDuoc() {
		return soSanPhamLamDuoc;
	}

	public void setsoSanPhamLamDuoc(int soSanPhamLamDuoc) {
		this.soSanPhamLamDuoc = soSanPhamLamDuoc;
	}

	@Override
	public String toString() {
		return "ChamCong [maChamCong=" + maChamCong + ", ngayDiLam=" + ngayDiLam + ", diLam=" + diLam + ", diTre="
				+ diTre + ", soSanPhamLamDuoc=" + soSanPhamLamDuoc + ", maCN=" + maCN.getMaCN() + "]";
	}


}
