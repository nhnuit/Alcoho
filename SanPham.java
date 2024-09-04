public enum LoaiSanPham{
	ruouNoi, ruouNgoai, biaNoi, biaNgoai
}

public abstract class SanPham {
	private String ma;
	private String ten;
	private LoaiSanPham loai;
	private Date ngaySanXuat;
	private float dungTich;
	private float giaNhap;
	private float giaBan;
	private String donViTinh;

	public SanPham SanPham(String ma, String ten, LoaiSanPham loai, Date ngaySanXuat, float dungTich, float giaNhap, float giaBan, String donViTinh) {
		this.ma = ma;
		this.ten = ten;
		this.loai = loai;
		this.ngaySanXuat = ngaySanXuat;
		this.dungTich = dungTich;
		this.giaNhap = giaNhap;
		this.giaBan = giaBan;
		this.donViTinh = donViTinh;
	}
	
	public String getMa(){
		return ma;
	}

	public String getTen(){
		return ten;
	}

	public LoaiSanPham getLoai() {
		return loai;
	}

	public float getGiaBan(){
		return giaBan;
	}

}
