package web

import net.serenitybdd.junit.runners.SerenityRunner
import net.thucydides.core.annotations.Issue
import net.thucydides.core.annotations.Steps
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import web.pages.SearchPage
import web.steps.SearchSteps

@RunWith(SerenityRunner)
class SearchTest extends BaseClass {

    @Steps
    SearchSteps searchSteps
    SearchPage searchPage

    @Before
    void before() {
       searchSteps.before()
    }

    @After
    void after() {
        searchSteps.after()
    }

    @Test
    @Issue('search test')
    void 'search test'() {
        searchSteps.click()
        searchSteps.searchData 'SeleniumHQ'
        searchSteps.clickFirstResult 'SeleniumHQ'
        searchSteps.searchInputShouldBeVisible()
        // on this step bug with infinite loop in Selenium
        searchPage.click()
    }
}
