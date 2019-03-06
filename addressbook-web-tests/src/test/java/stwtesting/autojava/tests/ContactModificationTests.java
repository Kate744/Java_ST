package stwtesting.autojava.tests;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import stwtesting.autojava.model.Contacts;
import stwtesting.autojava.model.NewContactData;

import java.util.Comparator;
import java.util.List;

public class ContactModificationTests extends TestBase {
    @BeforeMethod
    public void ensurePreconditions () {
        if ( app.contact().list().size() == 0) {

            app.contact().create(new NewContactData().withFirstname("Ivanko").withSecondname("Ivankov").withAddress("jgii5").withEmail("fjfi@m").withGroup("[none]"));
        };
        app.goTo().returnToHomePage();
    }
        @Test
    public void  testContactModification() {


            Contacts before = app.contact().list();
            int MyIndex = before.size()-1;
            NewContactData contact = new NewContactData().withId(before.get(MyIndex).getId()).withFirstname("Sebastianka").withSecondname("Solen").withAddress("gagarina 81").withEmail("mailmail7@mail.ru").withGroup("[none]");

            app.contact().modify(MyIndex, contact);
            app.goTo().returnToHomePage();
            Contacts after = app.contact().list();
            Assert.assertEquals(after.size(), before.size());

            before.remove(MyIndex);
            before.add(contact);

            Comparator<? super NewContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
            before.sort(byId);
            after.sort(byId);

            //Assert.assertEquals(before, after);
            MatcherAssert.assertThat(after, CoreMatchers.equalTo(before.without(before.get(MyIndex)).withAdded(contact)));

    }


}
