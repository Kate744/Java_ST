package stwtesting.autojava.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import stwtesting.autojava.model.NewContactData;

public class ContactHelper {
    private ChromeDriver wd;

    public ContactHelper(WebDriver wd) {
        //this.wd = wd;
        this.wd = (ChromeDriver) wd;
    }

    public void submitNewContactCreation() {
      wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }

    public void fillNewContactForm(NewContactData newContactData) {
        type2(By.name("firstname"), newContactData.getFirstname());
        type2(By.name("lastname"), newContactData.getSecondname());
        type2(By.name("nickname"), newContactData.getUsername());
        type2(By.name("email"), newContactData.getEmail());
    }

    private void type2(By locator2, String text) {
        wd.findElement(locator2).click();
        wd.findElement(locator2).clear();
        wd.findElement(locator2).sendKeys(text);
    }

    public void gotoNewContactPage() {
      wd.findElement(By.linkText("add new")).click();
    }

    public void submitDeletion() {
      wd.findElement(By.xpath("//input[@value='Delete']")).click();
    }

    public void selectUser() {
      wd.findElement(By.name("selected[]")).click();
    }
}
