package stwtesting.autojava.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import stwtesting.autojava.model.NewContactData;

public class AddNewContact extends TestBase{


  @Test
  public void testAddNewContact() throws Exception {

    gotoNewContactPage();
    fillNewContactForm(new NewContactData("Ivanko", "Ivankov", "User1234", "ivanko@yandex.ru"));
    submitNewContactCreation();

  }


}
