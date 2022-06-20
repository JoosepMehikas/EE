import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CalculatorTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webDriver.chrome.driver", Basics.CHROME_DRIVER_LOCATION);
        driver.manage().deleteAllCookies();
    }

    @Test(testName = "Calculate optimal solar option and verify main values.")
    public static void solarCalculator(){
        driver.get(Basics.BASE_URL);
        Calculator calculator = new Calculator(driver);
        calculator.verifyPageTitle();
        calculator.closeCookies();
        calculator.moreAboutTheSolutionOption();
        calculator.verifyLowConsumptionPackage();
        calculator.selectPackage("Medium consumption");
        calculator.selectStorage("Without storage");
        calculator.goToQuotePage();
        calculator.verifyQuoteInfo();
        calculator.selectPaymentOption();
        calculator.goToContactDetailsPage();
    }
    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}