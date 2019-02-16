package stwtesting.autojava.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import stwtesting.autojava.appmanager.ApplicationManager;

public class TestBase {
    protected final ApplicationManager app = new ApplicationManager(BrowserType.EDGE);


    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
    }


}
