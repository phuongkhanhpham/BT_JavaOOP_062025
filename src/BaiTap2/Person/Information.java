package BaiTap2.Person;

public class Information {
    public static void main(String[] args) {
        Person person = new Person("Khanh", "Female", 29, "HCM", "123456");
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Gender: " + person.gender);
        System.out.println("Phone: " + person.phone);
        System.out.println("Address: " + person.address);
    }
}
