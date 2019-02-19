package stwtesting.autojava.tests;

import org.testng.annotations.*;
import stwtesting.autojava.model.NewContactData;

public class ContactDeletion extends TestBase{


  @Test
  public void testContactDeletion() {

    if (! app.getContactHelper().isThereAContact()) {

      app.getContactHelper().createNewContact(new NewContactData("Ivanko", "Ivankov", "jgii", "fjfi@m", "Test5"));
    }

    app.getNavigationHelper().returnToHomePage();
    app.getContactHelper().selectUser();
    app.getContactHelper().submitDeletion();
  }


}
