import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.ArrayList;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class ChangeWindow implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        ArrayList<String> newTab = new ArrayList<String>
                (getDriver().getWindowHandles());
        getDriver().switchTo().window(newTab.get(1));
    }

    public static CambioDeVentana aOtra() {
        return new CambioDeVentana();
    }
}
