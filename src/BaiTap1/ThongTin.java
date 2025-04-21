package BaiTap1;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien("Khanh", "HCM", "QA", 29);
        NhanVien nhanVien2 = new NhanVien("Phung", "HCM", "Sale support", 28);

        nhanVien1.showInfo();
        System.out.println("----------------");
        nhanVien2.showInfo();
        System.out.println("----------------");
    }
}
