package web.steps

import net.thucydides.core.annotations.Step
import web.pages.SearchPage

class SearchSteps {

    private SearchPage searchPage

    @Step()
    void searchData(String data) {
        searchPage.searchData data
    }

    @Step()
    void clickFirstResult(String text) {
        searchPage.clickFirstResult text
    }

    @Step()
    void searchInputShouldBeVisible() {
        searchPage.searchInputShouldBeVisible()
    }

    @Step()
    void click() {
        searchPage.click()
    }

    @Step()
    void open(String url) {
        searchPage.getDriver().get url
    }

    @Step()
    void after() {
        println 'after'
    }

    @Step()
    void before() {
        println 'before'
    }
}
