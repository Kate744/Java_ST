package stwtesting.autojava.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import stwtesting.autojava.model.NewContactData;

import java.util.HashSet;
import java.util.List;

public class ContactModificationTests extends TestBase {
        @Test
    public void  testContactModification() {

            if (! app.getContactHelper().isThereAContact()) {

                app.getContactHelper().createNewContact(new NewContactData("Ivanko", "Ivankov", "jgii5", "fjfi@m", null));
            };
            app.getNavigationHelper().returnToHomePage();
            List<NewContactData> before = app.getContactHelper().getContactList();
            app.getNavigationHelper().returnToHomePage();
        app.getContactHelper().selectUser(before.size()-1);
        app.getContactHelper().initContactModification();
        NewContactData contact = new NewContactData (before.get(before.size() - 1).getId(), "Sebastianka", "Solen", "gagarina 81","mailmail7@mail.ru", null);
        app.getContactHelper().fillNewContactForm(contact, false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().returnToHomePage();

            List<NewContactData> after = app.getContactHelper().getContactList();
            Assert.assertEquals(after.size(), before.size());

            before.remove(before.size()-1);
            before.add(contact);

            Assert.assertEquals(new HashSet<>(before), new HashSet<>(after));

    }
}
