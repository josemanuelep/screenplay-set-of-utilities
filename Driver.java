public class Driver {

    private  WebDriver webDriverInstance = SerenityWebdriverManager.inThisTestThread().getCurrentDriver();

    public WebDriver getWebDriverInstance() {
        return webDriverInstance;
    }
}
