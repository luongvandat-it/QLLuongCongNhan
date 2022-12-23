package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class CongNhan implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="maCN")
	private String maCN;
	private String hoTen;
	private String gioiTinh;
	private Date ngaySinh;
	private Date ngayVaoLam;
	private String congDoan;
	private String sdt;
	private String diaChi;
	private Boolean trangThai;

	@ManyToOne
	@JoinColumn(name = "maLoai")
	private LoaiCongNhan maLoai;

	@OneToMany(mappedBy = "maCN", fetch = FetchType.EAGER)
	private List<ChamCong> lstChamCong;

	@OneToOne(mappedBy = "maCN", fetch = FetchType.EAGER)
	private TaiKhoan taiKhoan;
	
	//@OneToOne(mappedBy = "congnhan")
	//private LuongCongNhan luongCongNhan;
	
	public CongNhan() {
		// TODO Auto-generated constructor stub
	}

	public CongNhan(String maCN, String hoTen, String gioiTinh, Date ngaySinh, Date ngayVaoLam,String congDoan, String sdt,
			String diaChi, Boolean trangThai, LoaiCongNhan maLoai) {
		super();
		this.maCN = maCN;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.ngayVaoLam = ngayVaoLam;
		this.congDoan = congDoan;
		this.sdt = sdt;
		this.diaChi = diaChi;
		this.trangThai = trangThai;
		this.maLoai = maLoai;
	}

	public CongNhan(String maCN, String hoTen) {
		super();
		this.maCN = maCN;
		this.hoTen = hoTen;
	}

	@Override
	public int hashCode() {
		return Objects.hash(congDoan, diaChi, gioiTinh, hoTen, lstChamCong, maCN, maLoai, ngaySinh, ngayVaoLam, sdt,
				taiKhoan, trangThai);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CongNhan other = (CongNhan) obj;
		return Objects.equals(congDoan, other.congDoan) && Objects.equals(diaChi, other.diaChi)
				&& Objects.equals(gioiTinh, other.gioiTinh) && Objects.equals(hoTen, other.hoTen)
				&& Objects.equals(lstChamCong, other.lstChamCong) && Objects.equals(maCN, other.maCN)
				&& Objects.equals(maLoai, other.maLoai) && Objects.equals(ngaySinh, other.ngaySinh)
				&& Objects.equals(ngayVaoLam, other.ngayVaoLam) && Objects.equals(sdt, other.sdt)
				&& Objects.equals(taiKhoan, other.taiKhoan) && Objects.equals(trangThai, other.trangThai);
	}

	public String getMaCN() {
		return maCN;
	}

	public void setMaCN(String maCN) {
		this.maCN = maCN;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public Date getNgayVaoLam() {
		return ngayVaoLam;
	}

	public void setNgayVaoLam(Date ngayVaoLam) {
		this.ngayVaoLam = ngayVaoLam;
	}

	public String getCongDoan() {
		return congDoan;
	}

	public void setCongDoan(String congDoan) {
		this.congDoan = congDoan;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public Boolean getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(Boolean trangThai) {
		this.trangThai = trangThai;
	}

	public LoaiCongNhan getMaLoai() {
		return maLoai;
	}

	public void setMaLoai(LoaiCongNhan maLoai) {
		this.maLoai = maLoai;
	}

	public List<ChamCong> getLstChamCong() {
		return lstChamCong;
	}

	public void setLstChamCong(List<ChamCong> lstChamCong) {
		this.lstChamCong = lstChamCong;
	}

	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CongNhan maCN=" + maCN + ", hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh
				+ ", ngayVaoLam=" + ngayVaoLam + ", congDoan=" + congDoan + ", sdt=" + sdt + ", diaChi=" + diaChi
				+ ", trangThai=" + trangThai + ", maLoai=" + maLoai.getMaLoai() + ", lstChamCong=" + lstChamCong.size()+ ", taiKhoan="
				+ taiKhoan + "";
	}
}
