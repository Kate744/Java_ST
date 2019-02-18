package stwtesting.autojava.tests;

import org.testng.annotations.Test;
import stwtesting.autojava.model.NewContactData;

public class ContactModificationTests extends TestBase {
        @Test
    public void  testContactModification() {
        app.getContactHelper().selectUser();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillNewContactForm(new NewContactData("Sebastian", "Savin", "user8","mailmail@mail.ru", null), false);
        app.getContactHelper().submitContactModification();

    }
}