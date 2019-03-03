package stwtesting.autojava.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import stwtesting.autojava.model.NewContactData;

import java.util.List;

public class ContactDeletion extends TestBase{
  @BeforeMethod
  public void ensurePreconditions () {
    if (app.getContactHelper().list().size() == 0) {

      app.getContactHelper().create(new NewContactData("Ivanko", "Ivankov", "jgii5", "fjfi@m", "[none]"));
    };
    app.goTo().returnToHomePage();
  }

  @Test
  public void testContactDeletion() {

    List<NewContactData> before = app.getContactHelper().list();
int index  = before.size()-1;
    app.getContactHelper().delete(index);
    app.goTo().returnToHomePage();
    List<NewContactData> after = app.getContactHelper().list();
    Assert.assertEquals(after.size(), before.size() -1);

    before.remove(index);

    Assert.assertEquals(before, after);
  }




}
