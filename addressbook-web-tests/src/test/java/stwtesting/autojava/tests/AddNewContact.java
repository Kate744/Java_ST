package stwtesting.autojava.tests;

import org.testng.annotations.Test;
import stwtesting.autojava.model.Contacts;
import stwtesting.autojava.model.NewContactData;

import java.util.Comparator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddNewContact extends TestBase{


  @Test
  public void testAddNewContact() {
    app.goTo().returnToHomePage();

    Contacts before = app.contact().list();
    NewContactData contact = new NewContactData().withFirstname("Ivanko").withSecondname("Ivankov").withAddress("jgii 7").withEmail("fjfi@m").withGroup("[none]");
    app.contact().create(contact);
    app.goTo().returnToHomePage();
    Contacts after = app.contact().list();
    assertThat(after.size(), equalTo(before.size() +1));

            //before.add(contact);
    Comparator<? super NewContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    before.sort(byId);
    after.sort(byId);
    assertThat(app.contact().count(), equalTo(before.size() +1));
    assertThat(after, equalTo(before.withAdded(contact)));
  }

}
