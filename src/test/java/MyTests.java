import org.testng.annotations.Test;

public class MyTests {
    @Test
    public void first(){
        String selectedBrowser = System.getProperty("browser");
        String browserVersion = System.getProperty("browser.version");
        System.out.println(selectedBrowser + browserVersion);
    }
}
