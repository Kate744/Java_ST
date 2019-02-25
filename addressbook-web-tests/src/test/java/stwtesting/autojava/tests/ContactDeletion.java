package stwtesting.autojava.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import stwtesting.autojava.model.NewContactData;

import java.util.List;

public class ContactDeletion extends TestBase{


  @Test
  public void testContactDeletion() {

    if (! app.getContactHelper().isThereAContact()) {

      app.getContactHelper().createNewContact(new NewContactData("Ivanko", "Ivankov", "jgii", "fjfi@m", "[none]"));
    }
    List<NewContactData> before = app.getContactHelper().getContactList();
    app.getNavigationHelper().returnToHomePage();
    app.getContactHelper().selectUser(before.size()-1);
    app.getContactHelper().submitDeletion();
    List<NewContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() -1);
  }


}
