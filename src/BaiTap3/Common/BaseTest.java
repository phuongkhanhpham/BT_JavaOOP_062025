package BaiTap3.Common;

public class BaseTest {

    public void createDriver() {
        System.out.println("Project Name: " + Constants.PROJECT_NAME);
        System.out.println("Browser: " + Constants.getBrowser());
        System.out.println("Report: " + Constants.isReport());
        System.out.println("Headless: " + Constants.isHeadless());
    }

    public void createDriver(String browser) {
        System.out.println("Browser: " + browser);
        System.out.println("Report: " + Constants.isReport());
        System.out.println("Headless: " + Constants.isHeadless());
    }

    public void closeDriver(String browser) {
        System.out.println("Closed browser: " + browser);
    }
    public void closeDriver() {
        System.out.println("Closed browser: " + Constants.getBrowser());
    }
}
