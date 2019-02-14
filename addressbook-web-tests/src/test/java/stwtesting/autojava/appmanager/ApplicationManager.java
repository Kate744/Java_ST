package stwtesting.autojava.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
     ChromeDriver wd;

    private ContactHelper contactHelper;
    private GroupHelper groupHelper;

    public void logout() {
      contactHelper.wd.findElement(By.linkText("Logout")).click();
    }

    public void returnToHomePage() {
      contactHelper.wd.findElement(By.linkText("home")).click();
    }

    public boolean isAlertPresent() {
        try {
            contactHelper.wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() {

        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(wd);
        contactHelper = new ContactHelper(wd);
        login("admin", "secret");
    }

    private void login(String username, String password) {
      contactHelper.wd.findElement(By.name("user")).click();
      contactHelper.wd.findElement(By.name("user")).clear();
      contactHelper.wd.findElement(By.name("user")).sendKeys(username);
      contactHelper.wd.findElement(By.name("pass")).click();
      contactHelper.wd.findElement(By.name("pass")).clear();
      contactHelper.wd.findElement(By.name("pass")).sendKeys(password);
      contactHelper.wd.findElement(By.xpath("//input[@value='Login']")).click();
    }

    public void gotoGroupPage() {
      contactHelper.wd.findElement(By.linkText("groups")).click();
    }

    public void stop() {
        contactHelper.wd.quit();
    }


    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
