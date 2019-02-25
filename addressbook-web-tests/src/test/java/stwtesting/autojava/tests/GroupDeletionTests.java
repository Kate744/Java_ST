package stwtesting.autojava.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import stwtesting.autojava.model.GroupData;

import java.util.List;

public class GroupDeletionTests extends TestBase{

  @Test
  public void testGroupDeletion() {

    app.getNavigationHelper().gotoGroupPage();

    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test2", null, null));
    }

    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().selectGroup(before.size()-1);
    app.getGroupHelper().deleteSelectedGroup();
    app.getGroupHelper().returntoGroupPage();
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() - 1);
  }


}
