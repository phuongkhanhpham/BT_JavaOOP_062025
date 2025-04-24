package BaiTap2.Company;

import BaiTap2.Person.Person;

public class Company{
    public static void main(String[] args) {
        Person person = new Person("Khanh", "Female", 29, "HCM", "123456");
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Gender: " + person.gender);
    }
}
