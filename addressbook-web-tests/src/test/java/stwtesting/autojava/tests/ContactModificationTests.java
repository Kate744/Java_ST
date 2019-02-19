package stwtesting.autojava.tests;

import org.testng.annotations.Test;
import stwtesting.autojava.model.NewContactData;

public class ContactModificationTests extends TestBase {
        @Test
    public void  testContactModification() {
            if (! app.getContactHelper().isThereAContact()) {

                app.getContactHelper().createNewContact(new NewContactData("Ivanko", "Ivankov", "jgii", "fjfi@m", "[none]"));
            }

            app.getNavigationHelper().returnToHomePage();
        app.getContactHelper().selectUser();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillNewContactForm(new NewContactData("Sebastian", "Savin", "user8","mailmail@mail.ru", null), false);
        app.getContactHelper().submitContactModification();

    }
}
