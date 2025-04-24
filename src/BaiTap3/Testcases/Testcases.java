package BaiTap3.Testcases;

import BaiTap3.Common.BaseTest;

public class Testcases extends BaseTest {

    public void testLogin() {
        createDriver("Edge");
        System.out.println("Navigate to https://cms.anhtester.com/login");
        System.out.println("Enter email: admin@example.com");
        System.out.println("Enter password: 123456");
        System.out.println("Click login button");
        System.out.println("Verify menu Dashboard is displayed");
        closeDriver("Edge");

    }

    public void testAddCategory() {
        createDriver("Firefox");
        System.out.println("Navigate to https://cms.anhtester.com/login");
        System.out.println("Enter email: admin@example.com");
        System.out.println("Enter password: 123456");
        System.out.println("Click login button");
        System.out.println("Verify menu Dashboard is displayed");
        System.out.println("Click menu Products");
        System.out.println("Click menu Category");
        System.out.println("Verify redirect to the Category page");
        System.out.println("Click Add New Category button");
        System.out.println("Enter form data and add new category");
        System.out.println("Click Save button");
        System.out.println("Verify new category added successfully");
        System.out.println("Verify the new category information is correct");
        closeDriver("Firefox");
    }

    public static void main(String[] args) {
        Testcases testcases = new Testcases();
        testcases.testLogin();
        System.out.println("----------");
        testcases.testAddCategory();
    }

//    String email, password;
//
//    public void clickElement(String element) {
//        System.out.println("Click on element: " + element);
//    }
//
//    public void inputText(String text) {
//        System.out.println("Input text: " + text);
//    }
//
//    Testcases() {
//        email = "admin@example.com";
//        password = "123456";
//    }
//
//    Testcases(String email, String password) {
//        this.email = email;
//        this.password = password;
//    }
//
//    public static void main(String[] args) {
//        Testcases testcases = new Testcases();
//
//        System.out.println("Testcase1: Login");
//        System.out.println("");
//        System.out.println("Step1: Access url");
//        testcases.createDriver("/login");
//        System.out.println("Step2: Input email and password");
//        System.out.println("Email: " + testcases.email);
//        System.out.println("Password: " + testcases.password);
//        System.out.println("Step3: Click Login Button");
//        testcases.clickElement("Login button");
//        testcases.closeDriver();
//
//        System.out.println("-----------------");
//        System.out.println("Testcase2: Add Category");
//        System.out.println("");
//        System.out.println("Testcase1: Login");
//        System.out.println("Step1: Access Add Category page url");
//        testcases.createDriver("/addCategory");
//        System.out.println("-->Navigate to Login page");
//        System.out.println("Step2: Input email and password");
//        System.out.println("Email: " + testcases.email);
//        System.out.println("Password: " + testcases.password);
//        System.out.println("Step3: Click Login Button");
//        testcases.clickElement("Login button");
//        System.out.println("-->Login successfully and navigate to Add Category page");
//        System.out.println("Step4: Input text to new category text field");
//        testcases.inputText("Sales");
//        System.out.println("Step3: Click Create Button");
//        testcases.clickElement("Create button");
//        testcases.closeDriver();
//    }
}
