package stwtesting.autojava.tests;

import org.testng.annotations.*;
import stwtesting.autojava.model.GroupData;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("test5", null, null));
  }


}
