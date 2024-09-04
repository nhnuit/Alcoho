import java.util.Date;
import java.util.List;

public class DonHang {
    private String maDonHang;
    private Date ngayBan;
    private List<KhachHang> khachHang;
    private ChiTietDonHang chiTiet;

    public DonHang(String maDonHang, Date ngayBan, List<KhachHang> khachHang, ChiTietDonHang chiTiet) {
        this.maDonHang = maDonHang;
        this.ngayBan = ngayBan;
        this.khachHang = khachHang;
        this.chiTiet = chiTiet;
    }

    public double tinhThanhTien() {
        public tongTien = 0;

		for(ChiTietDonHang chiTiet : ChiTietDonHangList){
			SanPham sanPham = chiTiet.getSanPham();
			int soLuong = chiTiet.getSoLuong();

			//Giá bán chưa tính thuế
			double giaBan = sanPham.getGiaBan();

			//tính thuế GTGT 10%
			double thueGTGT = giaBan * 0.10;

			//Nếu sản phẩm là nhập khẩu, tính thêm thuể nhập khẩu
			double thueNhapKhau = 0;
			if(sanPham instanceof TinhThueNhapKhau){
				thueNhapKhau = ((TinhThueNhapKhau) sanPham).tinhThueNhapKhau();
			}
			//Giá cuối cùng của sản phẩm bao gồm cả thuế GTGT và thuế nhập khẩu
			double giaCuoiCung = giaBan + thueGTGT + thueNhapKhau;

			//tính tiền cho sản phẩm này và cộng vào tổng tiền
			tongTien += giaCuoiCung * soLuong;
		}
		return tongTien;
    }

    // Add getters and other methods as needed
}
