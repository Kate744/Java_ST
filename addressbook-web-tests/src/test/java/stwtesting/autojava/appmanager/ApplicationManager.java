package stwtesting.autojava.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    private final GroupHandlerelper groupHandlerelper = new GroupHandlerelper();

    private boolean isAlertPresent() {
        try {
            groupHandlerelper.wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() {
        groupHandlerelper.wd = new ChromeDriver();
        groupHandlerelper.wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        groupHandlerelper.wd.get("http://localhost/addressbook/");
        login("admin", "secret");
    }

    private void login(String username, String password) {
      groupHandlerelper.wd.findElement(By.name("user")).click();
      groupHandlerelper.wd.findElement(By.name("user")).clear();
      groupHandlerelper.wd.findElement(By.name("user")).sendKeys(username);
      groupHandlerelper.wd.findElement(By.name("pass")).click();
      groupHandlerelper.wd.findElement(By.name("pass")).clear();
      groupHandlerelper.wd.findElement(By.name("pass")).sendKeys(password);
      groupHandlerelper.wd.findElement(By.xpath("//input[@value='Login']")).click();
    }

    public void gotoGroupPage() {
      groupHandlerelper.wd.findElement(By.linkText("groups")).click();
    }

    public void stop() {
        groupHandlerelper.wd.quit();
    }


    public GroupHandlerelper getGroupHandlerelper() {
        return groupHandlerelper;
    }
}
