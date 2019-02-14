package stwtesting.autojava.tests;

public class ContactModificationTests extends TestBase {

    public void  testContactModification() {
        app.getContactHelper().selectUser();
        app.getGroupHelper().initGroupModification();

    }
}
