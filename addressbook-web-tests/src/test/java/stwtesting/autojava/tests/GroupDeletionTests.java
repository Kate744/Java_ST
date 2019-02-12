package stwtesting.autojava.tests;

import org.testng.annotations.*;

public class GroupDeletionTests extends TestBase{

  @Test
  public void testGroupDeletion() throws Exception {

    app.gotoGroupPage();
    app.getGroupHandlerelper().selectGroup();
    app.getGroupHandlerelper().deleteSelectedGroup();
    app.getGroupHandlerelper().returntoGroupPage();
  }


}
