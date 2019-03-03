package stwtesting.autojava.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import stwtesting.autojava.model.NewContactData;

import java.util.List;

public class ContactDeletion extends TestBase{
  @BeforeMethod
  public void ensurePreconditions () {
    if (! app.getContactHelper().isThereAContact()) {

      app.getContactHelper().createNewContact(new NewContactData("Ivanko", "Ivankov", "jgii5", "fjfi@m", "[none]"));
    };
    app.getNavigationHelper().returnToHomePage();
  }

  @Test
  public void testContactDeletion() {

    List<NewContactData> before = app.getContactHelper().getContactList();

    app.getContactHelper().selectUser(before.size()-1);
    app.getContactHelper().submitDeletion();
    app.getNavigationHelper().returnToHomePage();
    List<NewContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() -1);

    before.remove(before.size()-1);

    Assert.assertEquals(before, after);
  }


}
