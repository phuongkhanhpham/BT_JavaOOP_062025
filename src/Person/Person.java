package Person;

public class Person {

    String name, gender;
    int age;
    String address, phone;

    protected Person() {
        this.name = "Khanh";
        this.age = 29;
        this.gender = "female";
        this.address = "HCM";
        this.phone = "123456";
    }

    Person(String name1, int age1, String gender1, String address1, String phone1) {
        name = name1;
        age = age1;
        gender = gender1;
        address = address1;
        phone= phone1;
    }

    public void getName() {
        System.out.println("Tên: " + name);
    }

    public void getage() {
        System.out.println("Tuổi: " + age);
    }

    public void getGender() {
        System.out.println("Giới tính: " + gender);
    }

    void getAddress() {
        System.out.println("Địa chỉ: " + address);
    }

    void getPhone() {
        System.out.println("Số điện thoại: " + phone);
    }

    void getInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Số điện thoại: " + phone);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.getAddress();
    }
}
