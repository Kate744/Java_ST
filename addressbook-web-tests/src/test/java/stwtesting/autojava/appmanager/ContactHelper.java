package stwtesting.autojava.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import stwtesting.autojava.model.NewContactData;

public class ContactHelper {
    ChromeDriver wd;

    public ContactHelper(WebDriver wd) {
        //this.wd = wd;
        this.wd = (ChromeDriver) wd;
    }

    public void submitNewContactCreation() {
      wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }

    public void fillNewContactForm(NewContactData newContactData) {
      wd.findElement(By.name("firstname")).click();
      wd.findElement(By.name("firstname")).clear();
      wd.findElement(By.name("firstname")).sendKeys(newContactData.getFirstname());
      wd.findElement(By.name("lastname")).click();
      wd.findElement(By.name("lastname")).clear();
      wd.findElement(By.name("lastname")).sendKeys(newContactData.getSecondname());
      wd.findElement(By.name("nickname")).click();
      wd.findElement(By.name("nickname")).clear();
      wd.findElement(By.name("nickname")).sendKeys(newContactData.getUsername());
      wd.findElement(By.name("email")).click();
      wd.findElement(By.name("email")).clear();
      wd.findElement(By.name("email")).sendKeys(newContactData.getEmail());
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
