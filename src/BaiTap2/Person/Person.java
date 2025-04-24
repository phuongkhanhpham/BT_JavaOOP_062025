package BaiTap2.Person;

public class Person {

    public String name, gender;
    public int age;

    protected String address, phone;

    public Person(String name, String gender, int age, String address, String phone) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

//    public String getName() {
//        return name;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    protected String getAddress() {
//        return address;
//    }
//
//    protected String getPhone() {
//        return phone;
//    }
}
