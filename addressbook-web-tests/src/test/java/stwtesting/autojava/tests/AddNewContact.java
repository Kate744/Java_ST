package stwtesting.autojava.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import stwtesting.autojava.model.NewContactData;

import java.util.List;

public class AddNewContact extends TestBase{


  @Test
  public void testAddNewContact() {
    //int before = app.getContactHelper().getContactCount();
    app.getNavigationHelper().returnToHomePage();

    List<NewContactData> before = app.getContactHelper().getContactList();

    app.getContactHelper().createNewContact(new NewContactData("Ivanko", "Ivankov", "jgii 7", "fjfi@m", "[none]"));
    //int after = app.getContactHelper().getContactCount();
    app.getNavigationHelper().returnToHomePage();
    List<NewContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() +1);
            /*gotoNewContactPage();
    app.getContactHelper().fillNewContactForm(new NewContactData("Ivanko", "Ivankov", "jgii", "fjfi@m", "Test5"), true);
    app.getContactHelper().submitNewContactCreation();*/

  }

}
