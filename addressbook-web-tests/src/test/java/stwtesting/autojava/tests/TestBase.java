package stwtesting.autojava.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import stwtesting.autojava.appmanager.ApplicationManager;

public class TestBase {
    protected static final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);


    @BeforeSuite(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }


    @AfterSuite(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
    }


}
