package stwtesting.autojava.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import stwtesting.autojava.model.NewContactData;

import java.util.Comparator;
import java.util.List;

public class ContactModificationTests extends TestBase {
    @BeforeMethod
    public void ensurePreconditions () {
        if ( app.getContactHelper().list().size() == 0) {

            app.getContactHelper().create(new NewContactData("Ivanko", "Ivankov", "jgii5", "fjfi@m", "[none]"));
        };
        app.goTo().returnToHomePage();
    }
        @Test
    public void  testContactModification() {


            List<NewContactData> before = app.getContactHelper().list();
            int MyIndex = before.size()-1;
            NewContactData contact = new NewContactData (before.get(MyIndex).getId(), "Sebastianka", "Solen", "gagarina 81","mailmail7@mail.ru", "[none]");

            app.getContactHelper().modify(MyIndex, contact);
            app.goTo().returnToHomePage();
            List<NewContactData> after = app.getContactHelper().list();
            Assert.assertEquals(after.size(), before.size());

            before.remove(MyIndex);
            before.add(contact);

            Comparator<? super NewContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
            before.sort(byId);
            after.sort(byId);

            Assert.assertEquals(before, after);

    }


}
