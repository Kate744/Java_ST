package stwtesting.autojava.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import stwtesting.autojava.appmanager.ApplicationManager;
import stwtesting.autojava.model.NewContactData;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();
    protected WebDriver wd;

   /* @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }*/

    protected void login(String userlogin, String password) {
      wd.findElement(By.name("user")).click();
      wd.findElement(By.name("user")).clear();
      wd.findElement(By.name("user")).sendKeys(userlogin);
      wd.findElement(By.name("pass")).click();
      wd.findElement(By.name("pass")).clear();
      wd.findElement(By.name("pass")).sendKeys(password);
      wd.findElement(By.id("LoginForm")).submit();
    }

    protected void submitNewContactCreation() {
      wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }

    protected void fillNewContactForm(NewContactData newContactData) {
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

    protected void gotoNewContactPage() {
      wd.findElement(By.linkText("add new")).click();
    }

    /*@AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();

    }*/

    protected void logout() {
      wd.findElement(By.linkText("Logout")).click();
    }

    protected void returnToHomePage() {
      wd.findElement(By.linkText("home")).click();
    }

    private boolean isAlertPresent() {
      try {
        wd.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
      wd = new ChromeDriver();
      wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      wd.get("http://localhost/addressbook/");
      login("admin", "secret");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
      //returnToHomePage();
      //logout();
      wd.quit();

    }

    protected void submitDeletion() {
      wd.findElement(By.xpath("//input[@value='Delete']")).click();
    }

    protected void selectUser() {
      wd.findElement(By.name("selected[]")).click();
    }
}
