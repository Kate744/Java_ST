package stwtesting.autojava.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.*;

public class ContactDeletion extends TestBase{



  @Test
  public void testContactDeletion() throws Exception {
    
    wd.findElement(By.id("2")).click();
    wd.findElement(By.xpath("//input[@value='Delete']")).click();
  }



}
