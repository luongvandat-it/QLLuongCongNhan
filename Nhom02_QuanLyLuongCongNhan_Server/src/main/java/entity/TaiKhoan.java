package entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class TaiKhoan implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String sdt;
	private String matKhau;
	
	@OneToOne
	@JoinColumn(name="maCN", unique = true)
	private CongNhan maCN;
	
	public TaiKhoan() {
		// TODO Auto-generated constructor stub
	}

	public TaiKhoan(String sdt, String matKhau) {
		super();
		this.sdt = sdt;
		this.matKhau = matKhau;
	}

	
	
	public TaiKhoan(String sdt, String matKhau, CongNhan maCN) {
		super();
		this.sdt = sdt;
		this.matKhau = matKhau;
		this.maCN = maCN;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maCN, matKhau, sdt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaiKhoan other = (TaiKhoan) obj;
		return Objects.equals(maCN, other.maCN) && Objects.equals(matKhau, other.matKhau)
				&& Objects.equals(sdt, other.sdt);
	}

	public CongNhan getMaCN() {
		return maCN;
	}

	public void setMaCN(CongNhan maCN) {
		this.maCN = maCN;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	@Override
	public String toString() {
		return "TaiKhoan [sdt=" + sdt + ", matKhau=" + matKhau + "]";
	}
	
	
}
