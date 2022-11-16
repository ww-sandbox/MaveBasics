import org.testng.annotations.Test;

public class MyTests {
    @Test
    public void first(){
        String selectedBrowser = System.getProperty("browser");
        System.out.println(selectedBrowser);
    }
}
