package stwtesting.autojava.tests;

import org.testng.annotations.*;
import stwtesting.autojava.model.GroupData;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {

    app.gotoGroupPage();
    app.getGroupHandlerelper().initGroupCreation();
    app.getGroupHandlerelper().fillGroupForm(new GroupData("Test1", "Test2", "Test3"));
    app.getGroupHandlerelper().submitGroupCreation();
    app.getGroupHandlerelper().returntoGroupPage();
  }


}
