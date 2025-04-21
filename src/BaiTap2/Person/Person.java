package BaiTap2.Person;

public class Person {

    String name, gender;
    int age;
    String address, phone;

    public Person(String name, String gender, int age, String address, String phone) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    //    Person(String name1, int age1, String gender1, String address1, String phone1) {
//        name = name1;
//        age = age1;
//        gender = gender1;
//        address = address1;
//        phone= phone1;
//    }

//    public void getName() {
//        System.out.println("Tên: " + name);
//    }
//
//    public void getage() {
//        System.out.println("Tuổi: " + age);
//    }
//
//    public void getGender() {
//        System.out.println("Giới tính: " + gender);
//    }
//
//    void getAddress() {
//        System.out.println("Địa chỉ: " + address);
//    }
//
//    void getPhone() {
//        System.out.println("Số điện thoại: " + phone);
//    }

    void showInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Số điện thoại: " + phone);
    }

//    public static void main(String[] args) {
//        Person person = new Person();
//        person.getAddress();
//    }
}
