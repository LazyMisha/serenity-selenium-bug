package web.pages

import org.openqa.selenium.Keys
import web.BasePage

class SearchPage extends BasePage {

    void searchData(String data) {
        $("//input[@name='q']").type data
        getDriver().switchTo().activeElement().sendKeys Keys.ENTER
    }

    void clickFirstResult(String text) {
        $$("//div[@class='rc']//h3[contains(text(),'$text')]").first().click()
    }

    void searchInputShouldBeVisible() {
        $("//input[@name='q']").shouldNotBePresent()
        $("//input[@name='q']").shouldBePresent()
    }

    void click() {
        // navigate to the PointerInput -> Origin -> asArg - while loop
        actions.click($("//body"))
                .build().perform()
    }
}
