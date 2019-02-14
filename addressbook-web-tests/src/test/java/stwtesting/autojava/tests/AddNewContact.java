package stwtesting.autojava.tests;

import org.testng.annotations.*;
import stwtesting.autojava.model.NewContactData;

public class AddNewContact extends TestBase{


  @Test
  public void testAddNewContact() throws Exception {

    app.gotoNewContactPage();
    app.fillNewContactForm(new NewContactData("Ivanko", "Ivankov", "User1234", "ivanko@yandex.ru"));
    app.submitNewContactCreation();

  }

}
