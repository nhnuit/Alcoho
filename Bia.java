import java.util.Date;

public class Bia extends SanPham {
	private Date ngayHetHan;
	private boolean tinhTrang;

public Bia(String ma, String ten, LoaiSanPham loai, Date ngaySanXuat, float dungTich, float giaNhap, float giaBan, String donViTinh, Date ngayHetHan, boolean tinhTrang) {
        super(ma, ten, loai, ngaySanXuat, dungTich, giaNhap, giaBan, donViTinh);
        this.ngayHetHan = ngayHetHan;
        this.tinhTrang = tinhTrang;
    }
}
