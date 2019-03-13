package stwtesting.autojava.tests;

import org.testng.annotations.Test;
import stwtesting.autojava.model.NewContactData;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class EmailAddressPhoneTests extends TestBase {
    @Test
    public void TetsContactPhones() {
        app.goTo().returnToHomePage();
        NewContactData contact = app.contact().list().get(0);
        NewContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);

        assertThat(contact.getHomePhone(), equalTo(contactInfoFromEditForm.getHomePhone()));
        assertThat(contact.getMobilePhone(), equalTo(contactInfoFromEditForm.getMobilePhone()));
        assertThat(contact.getWorkPhone(), equalTo(contactInfoFromEditForm.getWorkPhone()));

        assertThat(contact.getAddress(), equalTo(contactInfoFromEditForm.getAddress()));

        assertThat(contact.getEmail(), equalTo(contactInfoFromEditForm.getEmail()));
        assertThat(contact.getEmail2(), equalTo(contactInfoFromEditForm.getEmail2()));
        assertThat(contact.getEmail3(), equalTo(contactInfoFromEditForm.getEmail3()));
    }



}
