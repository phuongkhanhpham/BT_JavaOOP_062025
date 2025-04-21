package BaiTap1;

public class NhanVien {

    String name, address, role;
    int age;

    public NhanVien(String name, String address, String role, int age) {
        this.name = name;
        this.address = address;
        this.role = role;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Chức vụ: " + role);
        System.out.println("Tuổi: " + age);
    }
}
