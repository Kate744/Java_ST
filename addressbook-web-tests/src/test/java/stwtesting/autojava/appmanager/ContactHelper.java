package stwtesting.autojava.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import stwtesting.autojava.model.NewContactData;

public class ContactHelper extends HelperBase{


    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void submitNewContactCreation() {
      click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void fillNewContactForm(NewContactData newContactData) {
        type(By.name("firstname"), newContactData.getFirstname());
        type(By.name("lastname"), newContactData.getSecondname());
        type(By.name("nickname"), newContactData.getUsername());
        type(By.name("email"), newContactData.getEmail());
    }

    /*private void type(By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }*/

    public void gotoNewContactPage() {
      click(By.linkText("add new"));
    }

    public void submitDeletion() {
      click(By.xpath("//input[@value='Delete']"));
    }

    public void selectUser() {
      click(By.name("selected[]"));
    }
}
