package stwtesting.autojava.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import stwtesting.autojava.model.Contacts;
import stwtesting.autojava.model.NewContactData;


import java.util.List;

public class ContactHelper extends HelperBase{


    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void submitNewContactCreation() {
      click(By.name("submit"));
    }

    public void fillNewContactForm(NewContactData newContactData, boolean creation) {
        type(By.name("firstname"), newContactData.getFirstname());
        type(By.name("lastname"), newContactData.getSecondname());
        type(By.name("address"), newContactData.getAddress());
        type(By.name("email"), newContactData.getEmail());

        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(newContactData.getGroup());
        }
        else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
            //new Select(wd.findElement(By.name("new_group"))).selectByVisibleText("[none]");
        }

    }



    public void gotoNewContactPage() {
      click(By.linkText("add new"));
    }

    public void submitDeletion() {
      click(By.xpath("//input[@value='Delete']"));
        wd.switchTo().alert().accept();
    }

    public void selectUser(int index) {
        wd.findElements(By.name("selected[]")).get(index).click();

    }

    public void initContactModification(int index) {
        int r = index + 1;
        String y = "tr:nth-child(" + (r) + ")";
        wd.findElements(By.cssSelector(y));
        String e = "(//img[@alt='Edit'])[" + r + "]";
        //System.out.println(e);
        click(By.xpath(e));
    }

    public void submitContactModification() {
        click(By.name("update"));
    }

    public void create(NewContactData contact) {

        gotoNewContactPage();
        fillNewContactForm(contact, true);
        submitNewContactCreation();
        contactCache = null;
    }

    public void modify(int myIndex, NewContactData contact) {
        selectUser(myIndex);
        initContactModification(myIndex);
        fillNewContactForm(contact, false);
        submitContactModification();
        contactCache = null;
    }

    public void delete(int index) {
        selectUser(index);
        submitDeletion();
        contactCache = null;
    }

    public boolean isThereAContact() {

        return isElementPresent(By.name("selected[]"));

    }

    /*public int сount() {

        return wd.findElements(By.name("selected[]")).size();
    }*/

    private Contacts contactCache = null;

    public Contacts list() {
        if (contactCache != null) {
            return new Contacts(contactCache);
        }

        contactCache = new Contacts();
        List<WebElement> elements = wd.findElements(By.name("entry"));
        for (WebElement element: elements) {

            List<WebElement>cells = element.findElements(By.tagName("td"));
            String name = cells.get(2).getText();
            String surname = cells.get(1).getText();
            String add = cells.get(3).getText();
            String email = cells.get(4).getText();
            int id_get = Integer.parseInt(element.findElement(new By.ByTagName("input")).getAttribute("value"));

            NewContactData contact = new NewContactData().withId(id_get).withFirstname(name).withSecondname(surname).withAddress(add).withEmail(email).withGroup("[none]");

            contactCache.add(contact);
        }
        return new Contacts(contactCache);


    }

    public int count() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public NewContactData infoFromEditForm(NewContactData contact) {
        initContactModificationById(contact.getId());
        String firstname = wd.findElement(By.name("firstname")).getAttribute("value");
        String lastname = wd.findElement(By.name("lastname")).getAttribute("value");
        String home = wd.findElement(By.name("home")).getAttribute("value");
        String mobile = wd.findElement(By.name("mobile")).getAttribute("value");
        String work = wd.findElement(By.name("work")).getAttribute("value");
        wd.navigate().back();
        return new NewContactData().withId(contact.getId()).withFirstname(firstname).withSecondname(lastname).withHomePhone(home).withMobilePhone(mobile).withWorkPhone(work);

    }

    private void initContactModificationById(int id) {
        WebElement checkbox = wd.findElement(By.cssSelector(String.format("input[value='%']", id)));
        WebElement row = checkbox.findElement(By.xpath("./../.."));
        List<WebElement> cells = row.findElements(By.tagName("td"));
        cells.get(7).findElement(By.tagName("a")).click();
    }
}
/*
wd.findElement(By.xpath(String.format("//input[@value='%']/../../td[8]/a", id))).click();
wd.findElement(By.cssSelector(String.format("a[href='edit.php?id=%s']", id))).click();
 */