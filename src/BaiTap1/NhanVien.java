package BaiTap1;

public class NhanVien {

    String name = "Khanh";
    int age = 29;
    String address = "HCM";
    String role = "QA";

    public void printInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Chức vụ: " + role);
    }

    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien();
        nhanVien.printInfo();
    }
}
