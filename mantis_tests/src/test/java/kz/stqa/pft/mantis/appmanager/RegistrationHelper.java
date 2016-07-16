package kz.stqa.pft.mantis.appmanager;

import org.openqa.selenium.WebDriver;

/**
 * Created by xeniya on 7/16/16.
 */
public class RegistrationHelper {
    private final ApplicationManager app;
    private WebDriver wd;

    public RegistrationHelper(ApplicationManager app) {
        this.app = app;
        wd = app.getDriver();
    }

    public void start(String username, String email) {
        wd.get(app.getProperty("web.baseUrl") + "/signup_page.php");
    }
}
