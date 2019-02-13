package stwtesting.autojava.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import stwtesting.autojava.model.NewContactData;

public class AddNewContact extends TestBase{


  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    login("admin", "secret");
  }

  @Test
  public void testAddNewContact() throws Exception {

    gotoNewContactPage();
    fillNewContactForm(new NewContactData("Ivanko", "Ivankov", "User1234", "ivanko@yandex.ru"));
    submitNewContactCreation();

  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    returnToHomePage();
    logout();
    wd.quit();

  }


}
