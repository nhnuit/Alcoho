public class RuouNhapKhau extends Ruou implements TinhThueNhapKhau {
    private float thue;

    public RuouNhapKhau(String ma, String ten, LoaiSanPham loai, Date ngaySanXuat, float dungTich, float giaNhap, float giaBan, String donViTinh, float thue) {
        super(ma, ten, loai, ngaySanXuat, dungTich, giaNhap, giaBan, donViTinh);
        this.thue = thue;
    }

    @Override
    public double tinhThueNhapKhau() {
        return thue;
    }
}

