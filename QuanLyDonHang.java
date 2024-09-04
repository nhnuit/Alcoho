import java.util.ArrayList;
import java.util.List;

public class QuanLySanPham {
    private List<SanPham> danhSachSanPham;

    public QuanLySanPham() {
        this.danhSachSanPham = new ArrayList<>();
    }

    public void themSanPham(SanPham sanPham) {
        danhSachSanPham.add(sanPham);
    }

    public List<SanPham> getDanhSachSanPham() {
        return danhSachSanPham;
    }

    public SanPham timSanPhamTheoMa(String ma) {
        for (SanPham sp : danhSachSanPham) {
            if (sp.getMa().equals(ma)) {
                return sp;
            }
        }
        return null;
    }

    public void hienThiDanhSachSanPham() {
        for (SanPham sp : danhSachSanPham) {
            System.out.println(sp.getTen() + " - " + sp.getLoai() + " - Giá bán: " + sp.getGiaBan());
        }
    }
}
