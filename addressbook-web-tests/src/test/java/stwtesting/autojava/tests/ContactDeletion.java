package stwtesting.autojava.tests;

import org.testng.annotations.*;

public class ContactDeletion extends TestBase{


  @Test
  public void testContactDeletion() throws Exception {

    app.selectUser();
    app.submitDeletion();
  }


}
