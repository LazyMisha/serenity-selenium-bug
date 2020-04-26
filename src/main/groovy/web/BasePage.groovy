package web

import net.serenitybdd.core.pages.PageObject
import org.openqa.selenium.interactions.Actions

class BasePage extends PageObject {

    Actions getActions() {
        super.withAction()
    }
}
