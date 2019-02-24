package stwtesting.autojava.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import stwtesting.autojava.model.GroupData;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {

        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        if (! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData("test2", null, null));
        }

        app.getGroupHelper().selectGroup(before-1);
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("Test5", "Test8", "Test7"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returntoGroupPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before);

    }
}
