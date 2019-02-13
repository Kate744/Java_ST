package stwtesting.autojava.tests;

import org.testng.annotations.*;
import org.openqa.selenium.*;

public class ContactDeletion extends TestBase{


  @Test
  public void testContactDeletion() throws Exception {
    
    wd.findElement(By.name("selected[]")).click();
    wd.findElement(By.xpath("//input[@value='Delete']")).click();
  }


}
