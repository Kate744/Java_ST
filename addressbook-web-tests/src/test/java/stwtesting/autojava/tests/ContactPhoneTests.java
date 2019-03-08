package stwtesting.autojava.tests;

import org.testng.annotations.Test;
import stwtesting.autojava.model.NewContactData;


public class ContactPhoneTests extends TestBase {
    @Test
    public void TetsContactPhones() {
        app.goTo().returnToHomePage();
        NewContactData contact = app.contact().list().get(0);
        NewContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);

    }



}
