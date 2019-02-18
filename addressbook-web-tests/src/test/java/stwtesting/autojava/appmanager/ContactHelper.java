package stwtesting.autojava.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
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

        if (isElementPresent(By.name("new_group"))) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(newContactData.getGroup());
        }

    }

    public void gotoNewContactPage() {
      click(By.linkText("add new"));
    }

    public void submitDeletion() {
      click(By.xpath("//input[@value='Delete']"));
        wd.switchTo().alert().accept();
    }

    public void selectUser() {
      click(By.name("selected[]"));
    }

    public void initContactModification() {
        click(By.cssSelector("img[alt=\"Edit\"]"));
    }

    public void submitContactModification() {
        click(By.name("update"));
    }
}
