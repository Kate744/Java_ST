package stwtesting.autojava.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import stwtesting.autojava.model.NewContactData;

import java.util.List;

public class ContactModificationTests extends TestBase {
        @Test
    public void  testContactModification() {

            if (! app.getContactHelper().isThereAContact()) {

                app.getContactHelper().createNewContact(new NewContactData("Ivanko", "Ivankov", "jgii", "fjfi@m", "[none]"));
            }
            List<NewContactData> before = app.getContactHelper().getContactList();
            app.getNavigationHelper().returnToHomePage();
        app.getContactHelper().selectUser(before.size()-1);
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillNewContactForm(new NewContactData("Sebastian", "Savin", "user8","mailmail@mail.ru", null), false);
        app.getContactHelper().submitContactModification();
            List<NewContactData> after = app.getContactHelper().getContactList();
            Assert.assertEquals(after.size(), before.size());

    }
}
