package BaiTap3.Common;

import static BaiTap3.Common.Constants.*;

public class BaseTest {

    public void createDriver(String browser) {
        setBrowser("https://cms.anhtester.com" + browser);
        System.out.println(Constants.browser);
        System.out.println("Report: " + report);
        System.out.println("Headless: " + headless);
    }

    public void closeDriver() {
        System.out.println("Closed browser: " + browser);
    }
}
