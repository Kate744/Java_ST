package stwtesting.autojava.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import stwtesting.autojava.model.NewContactData;

public class AddNewContact extends TestBase{


  @Test
  public void testAddNewContact() {
    int before = app.getContactHelper().getContactCount();
    app.getContactHelper().createNewContact(new NewContactData("Ivanko", "Ivankov", "jgii", "fjfi@m", "[none]"));
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before +1);
            /*gotoNewContactPage();
    app.getContactHelper().fillNewContactForm(new NewContactData("Ivanko", "Ivankov", "jgii", "fjfi@m", "Test5"), true);
    app.getContactHelper().submitNewContactCreation();*/

  }

}
