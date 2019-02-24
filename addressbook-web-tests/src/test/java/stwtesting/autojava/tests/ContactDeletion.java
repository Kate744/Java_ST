package stwtesting.autojava.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import stwtesting.autojava.model.NewContactData;

public class ContactDeletion extends TestBase{


  @Test
  public void testContactDeletion() {
    int before = app.getContactHelper().getContactCount();
    if (! app.getContactHelper().isThereAContact()) {

      app.getContactHelper().createNewContact(new NewContactData("Ivanko", "Ivankov", "jgii", "fjfi@m", "[none]"));
    }

    app.getNavigationHelper().returnToHomePage();
    app.getContactHelper().selectUser(before-1);
    app.getContactHelper().submitDeletion();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before -1);
  }


}
