package stwtesting.autojava.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import stwtesting.autojava.appmanager.ApplicationManager;

public class TestBase {
    protected final ApplicationManager app = new ApplicationManager();

    //protected final ApplicationManager app = new ApplicationManager();
    // protected
    //WebDriver wd;

   /* @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }*/

   /* protected void login(String userlogin, String password) {
      wd.findElement(By.name("user")).click();
      wd.findElement(By.name("user")).clear();
      wd.findElement(By.name("user")).sendKeys(userlogin);
      wd.findElement(By.name("pass")).click();
      wd.findElement(By.name("pass")).clear();
      wd.findElement(By.name("pass")).sendKeys(password);
      wd.findElement(By.id("LoginForm")).submit();
    }
*/
    /*@AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();

    }*/

    /*private boolean isAlertPresent() {
      try {
        wd.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }
*/
    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }

    /*private void init() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        login("admin", "secret");
    }*/

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
      //returnToHomePage();
      //logout();
        app.stop();

    }

   /* private void stop() {
        wd.quit();
    }
*/
}
