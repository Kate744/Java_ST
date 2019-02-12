package stwtesting.autojava.tests;

import org.testng.annotations.*;
import stwtesting.autojava.model.GroupData;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {

    app.gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("Test1", "Test2", "Test3"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returntoGroupPage();
  }


}
