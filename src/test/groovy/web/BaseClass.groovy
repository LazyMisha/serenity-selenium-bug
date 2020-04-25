package web

import net.thucydides.core.annotations.Managed
import net.thucydides.core.annotations.Steps
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.openqa.selenium.WebDriver
import web.steps.SearchSteps

class BaseClass {

    @Steps
    SearchSteps searchSteps


    @Managed(driver = 'chrome', options = '--ignore-certificate-errors')
    WebDriver driver

    @Before
    void init() {
        searchSteps.open 'https://www.google.com/'
    }

    @BeforeClass
    static void setup() {
        println 'before class'
    }

    @AfterClass
    static void cleanUp() {
        println 'after class'
    }
}
