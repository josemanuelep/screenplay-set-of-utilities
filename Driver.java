public class Driver {

    private static WebDriver webDriverInstance = SerenityWebdriverManager.inThisTestThread().getCurrentDriver();

    public static WebDriver getWebDriverInstance() {
        return webDriverInstance;
    }
}
