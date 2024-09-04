import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng QuanLySanPham
        QuanLySanPham quanLySanPham = new QuanLySanPham();

        // Giả định ngày sản xuất và ngày hết hạn
        Date ngaySanXuat = new Date();
        Date ngayHetHan = new Date();

        // Tạo các đối tượng Rượu ngoại
        RuouNhapKhau chivas = new RuouNhapKhau("001", "Chivas Regal", LoaiSanPham.ruouNgoai, ngaySanXuat, 0.75f, 100.0f, 150.0f, "lít", 20.0f);
        RuouNhapKhau johnnieWalker = new RuouNhapKhau("002", "Johnnie Walker", LoaiSanPham.ruouNgoai, ngaySanXuat, 0.75f, 110.0f, 160.0f, "lít", 25.0f);
        RuouNhapKhau hennessy = new RuouNhapKhau("003", "Hennessy", LoaiSanPham.ruouNgoai, ngaySanXuat, 0.75f, 120.0f, 170.0f, "lít", 30.0f);
        RuouNhapKhau macallan = new RuouNhapKhau("004", "Macallan", LoaiSanPham.ruouNgoai, ngaySanXuat, 0.75f, 130.0f, 180.0f, "lít", 35.0f);

        // Tạo các đối tượng Rượu nội
        Ruou ruouNoi = new Ruou("005", "Ruou Noi", LoaiSanPham.ruouNoi, ngaySanXuat, 0.75f, 50.0f, 80.0f, "lít");
        Ruou ruouCan = new Ruou("006", "Ruou can", LoaiSanPham.ruouNoi, ngaySanXuat, 1.0f, 60.0f, 90.0f, "lít");

        // Tạo các đối tượng Bia ngoại
        BiaNhapKhau heineken = new BiaNhapKhau("007", "Heineken", LoaiSanPham.biaNgoai, ngaySanXuat, 0.33f, 20.0f, 30.0f, "chai", ngayHetHan, true, 5.0f);
        BiaNhapKhau tiger = new BiaNhapKhau("008", "Tiger", LoaiSanPham.biaNgoai, ngaySanXuat, 0.33f, 18.0f, 28.0f, "chai", ngayHetHan, true, 4.0f);
        BiaNhapKhau budweiser = new BiaNhapKhau("009", "Budweiser", LoaiSanPham.biaNgoai, ngaySanXuat, 0.33f, 22.0f, 32.0f, "chai", ngayHetHan, true, 6.0f);
        BiaNhapKhau becks = new BiaNhapKhau("010", "Beck's", LoaiSanPham.biaNgoai, ngaySanXuat, 0.33f, 21.0f, 31.0f, "chai", ngayHetHan, true, 5.5f);

        // Tạo các đối tượng Bia nội
        Bia biaSaiGon = new Bia("011", "Bia Sai Gon", LoaiSanPham.biaNoi, ngaySanXuat, 0.5f, 10.0f, 15.0f, "chai", ngayHetHan, true);
        Bia biaHaNoi = new Bia("012", "Bia Ha Noi", LoaiSanPham.biaNoi, ngaySanXuat, 0.5f, 11.0f, 16.0f, "chai", ngayHetHan, true);

        // Thêm các sản phẩm vào danh sách
        quanLySanPham.themSanPham(chivas);
        quanLySanPham.themSanPham(johnnieWalker);
        quanLySanPham.themSanPham(hennessy);
        quanLySanPham.themSanPham(macallan);
        quanLySanPham.themSanPham(ruouNoi);
        quanLySanPham.themSanPham(ruouCan);
        quanLySanPham.themSanPham(heineken);
        quanLySanPham.themSanPham(tiger);
        quanLySanPham.themSanPham(budweiser);
        quanLySanPham.themSanPham(becks);
        quanLySanPham.themSanPham(biaSaiGon);
        quanLySanPham.themSanPham(biaHaNoi);

        // Hiển thị danh sách sản phẩm
        quanLySanPham.hienThiDanhSachSanPham();
    }
}
