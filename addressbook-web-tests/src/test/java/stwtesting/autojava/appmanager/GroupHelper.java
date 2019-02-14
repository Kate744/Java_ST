package stwtesting.autojava.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import stwtesting.autojava.model.GroupData;

public class GroupHelper {
    private ChromeDriver wd;

    public GroupHelper(WebDriver wd) {
        this.wd = (ChromeDriver) wd;
    }

    public void returntoGroupPage() {
      wd.findElement(By.linkText("group page")).click();
    }

    public void submitGroupCreation() {
      wd.findElement(By.name("submit")).click();
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());

    }

    private void type(By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void initGroupCreation() {
      wd.findElement(By.name("new")).click();
    }


    public void deleteSelectedGroup() {
      wd.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
      wd.findElement(By.name("selected[]")).click();
    }
}
