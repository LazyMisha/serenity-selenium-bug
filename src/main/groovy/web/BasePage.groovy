package web

import net.serenitybdd.core.pages.PageObject
import org.openqa.selenium.WebDriver
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.support.ui.ExpectedCondition

import java.util.concurrent.Callable
import java.util.concurrent.TimeUnit

class BasePage extends PageObject {

    protected def customWaitFor(int timeOut, Callable<?> code){
        withTimeoutOf(timeOut, TimeUnit.SECONDS).waitForCondition().until(new ExpectedCondition<Boolean>() {
            Boolean apply(WebDriver driver) {
                return code.call()
            }
        })
    }

    Actions getActions() {
        super.withAction()
    }
}
