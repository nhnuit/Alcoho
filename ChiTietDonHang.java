public class ChiTietDonHang {
    private SanPham sanPham;
    private int soLuong;

    public ChiTietDonHang(SanPham sanPham, int soLuong) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
    }
	
    public SanPham getSanPham(){
		return sanPham;
	}

	public int getSoLuong(){
		return soLuong;
	}
}
