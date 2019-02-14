package stwtesting.autojava.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelper extends HelperBase{


    public NavigationHelper(ChromeDriver wd) {
        super(wd);
    }

    public void returnToHomePage() {
      click(By.linkText("home"));
    }

    public void gotoGroupPage() {
      click(By.linkText("groups"));
    }

    public void logout() {
        click(By.linkText("Logout"));
    }
}
