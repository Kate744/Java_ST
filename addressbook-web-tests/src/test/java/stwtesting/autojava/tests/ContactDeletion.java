package stwtesting.autojava.tests;

import org.testng.annotations.*;
import org.openqa.selenium.*;

public class ContactDeletion extends TestBase{


  @Test
  public void testContactDeletion() throws Exception {

    selectUser();
    submitDeletion();
  }


}
