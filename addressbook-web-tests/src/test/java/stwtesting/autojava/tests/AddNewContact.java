package stwtesting.autojava.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import stwtesting.autojava.model.NewContactData;

import java.util.Comparator;
import java.util.List;

public class AddNewContact extends TestBase{


  @Test
  public void testAddNewContact() {
    app.goTo().returnToHomePage();

    List<NewContactData> before = app.getContactHelper().list();
    NewContactData contact = new NewContactData("Ivanko", "Ivankov", "jgii 7", "fjfi@m", "[none]");
    app.getContactHelper().create(contact);
    //int after = app.getContactHelper().getContactCount();
    app.goTo().returnToHomePage();
    List<NewContactData> after = app.getContactHelper().list();

    Assert.assertEquals(after.size(), before.size() +1);

            before.add(contact);
    Comparator<? super NewContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
  }

}
