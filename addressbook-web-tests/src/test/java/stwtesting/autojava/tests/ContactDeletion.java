package stwtesting.autojava.tests;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.*;
import stwtesting.autojava.model.Contacts;
import stwtesting.autojava.model.NewContactData;

import java.util.List;

public class ContactDeletion extends TestBase{
  @BeforeMethod
  public void ensurePreconditions () {
    if (app.contact().list().size() == 0) {

      app.contact().create(new NewContactData().withFirstname("Ivanko").withSecondname("Ivankov").withAddress("jgii5").withEmail("fjfi@m").withGroup("[none]"));
    };
    app.goTo().returnToHomePage();
  }

  @Test
  public void testContactDeletion() {

    Contacts before = app.contact().list();
    int index  = before.size()-1;
    app.contact().delete(index);
    app.goTo().returnToHomePage();
    Contacts after = app.contact().list();
    Assert.assertEquals(after.size(), before.size() -1);

    //before.remove(index);
MatcherAssert.assertThat(after, CoreMatchers.equalTo(before.without(before.get(index))));
    //Assert.assertEquals(before, after);
  }




}
