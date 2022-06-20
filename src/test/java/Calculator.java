import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Calculator extends PageObject{

    //Here are the paths to elements, used in the test, set.
    @FindBy(xpath = "//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")
    private WebElement close_Cookies;

    @FindBy(xpath = "//*[@id=\"pv-packages\"]/section/div/div/e-card-group/div/div[7]/p/e-button/button")
    private WebElement select_low_package;

    @FindBy(xpath = "//*[@id=\"pv-packages\"]/section/div/div/e-card-group/div/div[14]/p/e-button/button")
    private WebElement select_medium_package;

    @FindBy(xpath = "//*[@id=\"pv-packages\"]/section/div/div/e-card-group/div/div[21]/p/e-button/button")
    private WebElement select_high_package;

    @FindBy(xpath = "//*[@id=\"pv-packages\"]/section/div/div/e-card-group/div/div[28]/p/e-button/button")
    private WebElement select_highest_package;

    @FindBy(xpath = "//*[@id=\"pv-battery\"]/section/div/div/div/div[1]/div[3]/div[2]/div[1]/e-card/a/div/div/e-radio/label")
    private WebElement select_no_storage;

    @FindBy(xpath = "//*[@id=\"pv-battery\"]/section/div/div/div/div[1]/div[3]/div[2]/div[1]/e-card/a/div/div/e-radio/label/input")
    private WebElement radio_no_storage;

    @FindBy(xpath = "//*[@id=\"pv-battery\"]/section/div/div/div/div[1]/div[3]/div[2]/div[2]/e-card/a/div/div/e-radio/label")
    private WebElement select_5kwh_storage;

    @FindBy(xpath = "//*[@id=\"pv-battery\"]/section/div/div/div/div[1]/div[3]/div[2]/div[2]/e-card/a/div/div/e-radio/label/input")
    private WebElement radio_5kwh_storage;

    @FindBy(xpath = "//*[@id=\"pv-battery\"]/section/div/div/div/div[1]/div[3]/div[2]/div[3]/e-card/a/div/div/e-radio/label")
    private WebElement select_10kwh_storage;

    @FindBy(xpath = "//*[@id=\"pv-battery\"]/section/div/div/div/div[1]/div[3]/div[2]/div[3]/e-card/a/div/div/e-radio/label/input")
    private WebElement radio_10kwh_storage;

    @FindBy(xpath = "//*[@id=\"pv-battery\"]/section/div/div/div/div[1]/div[3]/div[2]/div[4]/e-card/a/div/div/e-radio/label")
    private WebElement select_15kwh_storage;

    @FindBy(xpath = "//*[@id=\"pv-battery\"]/section/div/div/div/div[1]/div[3]/div[2]/div[4]/e-card/a/div/div/e-radio/label/input")
    private WebElement radio_15kwh_storage;

    @FindBy(xpath = "//*[@id=\"pv-battery\"]/section/div/div/div/div[2]/e-button[2]")
    private WebElement open_quote_page_button;

    @FindBy(xpath = "//*[@id=\"pv-chosen\"]/section/div/div/div/div[1]/div[7]/div[1]/e-card/a/div/div/e-radio/label/span")
    private WebElement select_hire_purchase;

    @FindBy(xpath = "//*[@id=\"pv-chosen\"]/section/div/div/div/div[1]/div[7]/div[1]/e-card/a/div/div/e-radio/label/input")
    private WebElement radio_hire_purchase;

    @FindBy(xpath = "//*[@id=\"pv-chosen\"]/section/div/div/div/div[1]/div[7]/div[2]/e-card/a/div/div/e-radio/label")
    private WebElement select_purchase;

    @FindBy(xpath = "//*[@id=\"pv-chosen\"]/section/div/div/div/div[1]/div[7]/div[2]/e-card/a/div/div/e-radio/label/input")
    private WebElement radio_purchase;

    @FindBy(xpath = "//*[@id=\"pv-chosen\"]/section/div/div/div/div[2]/div[2]/e-button[1]/button")
    private WebElement open_contact_options_page_button;

    @FindBy(xpath = "//*[@id=\"pv-packages\"]/section/div/div/e-card-group/div/div[1]/h4")
    private WebElement low_consumption_name;

    @FindBy(xpath = "//*[@id=\"pv-packages\"]/section/div/div/e-card-group/div/div[1]/p[2]/b")
    private WebElement low_consumption_value;

    @FindBy(xpath = "//*[@id=\"pv-packages\"]/section/div/div/e-card-group/div/div[2]/h4")
    private WebElement get_Low_consumption_min_area;

    @FindBy(xpath = "//*[@id=\"pv-packages\"]/section/div/div/e-card-group/div/div[3]/h4")
    private WebElement get_Low_consumption_power;

    @FindBy(xpath = "//*[@id=\"pv-packages\"]/section/div/div/e-card-group/div/div[4]/span[1]")
    private WebElement get_Low_consumption_cost;

    @FindBy(xpath = "//*[@id=\"pv-packages\"]/section/div/div/e-card-group/div/div[4]/h4")
    private WebElement get_Low_consumption_hire_cost;

    @FindBy(xpath = "//*[@id=\"pv-packages\"]/section/div/div/e-card-group/div/div[7]/div[2]")
    private WebElement get_Low_consumption_more_info;

    @FindBy(xpath = "//*[@id=\"pv-packages\"]/section/div/div/e-card-group/div/div[5]/h4")
    private WebElement get_Low_consumption_output;

    @FindBy(xpath = "//*[@id=\"pv-packages\"]/section/div/div/e-card-group/div/div[6]/h4")
    private WebElement get_Low_consumption_panels;

    @FindBy(xpath = "//*[@id=\"pv-battery\"]/section/div/div/div/e-notification/div/h4")
    private WebElement get_energy_storage_tab_heading;

    @FindBy(xpath = "//*[@id=\"pv-chosen\"]/section/div/div/div/e-notification/div/h4")
    private WebElement get_summary_tab_heading;

    @FindBy(xpath = "//*[@id=\"average-consumption\"]/div/div/div/div[2]/h4[1]")
    private WebElement get_quote_package_name;

    @FindBy(xpath = "//*[@id=\"average-consumption\"]/div/div/div/div[2]/p")
    private WebElement get_quote_power_solution;

    @FindBy(xpath = "//*[@id=\"average-consumption\"]/div/div/div/div[2]/h4[2]")
    private WebElement get_quote_package_cost;

    @FindBy(xpath = "//*[@id=\"full_price\"]")
    private WebElement get_quote_total_cost;

    @FindBy(xpath = "//*[@id=\"pv-chosen\"]/section/div/div/div/div[1]/div[6]/div/table/tbody/tr/td[2]/p")
    private WebElement get_quote_contract_fee;

    @FindBy(xpath = "//*[@id=\"huawei-battery15\"]/e-card/div/div/div/div[2]/p")
    private WebElement get_quote_storage_unit_size;

    @FindBy(xpath = "//*[@id=\"huawei-battery15\"]/e-card/div/div/div/div[2]/h4[2]")
    private WebElement get_quote_storage_unit_cost;

    public Calculator(WebDriver driver) {
        super(driver);
    }

    public void closeCookies(){
        this.close_Cookies.click();
    }

    //Select package using switch case and verify tab heading.
    public void selectPackage(String packageName){
        switch(packageName) {
            case "Low consumption":
                this.select_low_package.click();
                break;
            case "Medium consumption":
                this.select_medium_package.click();
                break;
            case "High consumption":
                this.select_high_package.click();
                break;
            case "Highest consumption":
                this.select_highest_package.click();
                break;
        }
        this.verifyTabHeading(this.get_energy_storage_tab_heading.getText(), DefaultValues.TabHeadings.ENERGY_STORAGE.getValue());
    }

    public void verifyTabHeading(String element, String heading){
        String actualTabHeading = element;
        String expectedTabHeading = heading;
        Assert.assertEquals(actualTabHeading, expectedTabHeading);
    }

    public void selectStorage(String storage){
        switch(storage) {
            case "Without storage":
                this.validateRadioButton( "Should be selected", this.radio_5kwh_storage);
                this.validateRadioButton( "Should not be selected", this.radio_no_storage);
                this.select_no_storage.click();
                this.validateRadioButton( "Should be selected", this.radio_no_storage);
                break;
            case "5kwh storage":
                this.validateRadioButton( "Should be selected", this.radio_5kwh_storage);
                this.validateRadioButton( "Should not be selected", this.radio_5kwh_storage);
                this.select_5kwh_storage.click();
                this.validateRadioButton( "Should be selected", this.radio_5kwh_storage);
                break;
            case "10kwh storage":
                this.validateRadioButton( "Should be selected", this.radio_5kwh_storage);
                this.validateRadioButton( "Should not be selected", this.radio_10kwh_storage);
                this.select_10kwh_storage.click();
                this.validateRadioButton( "Should be selected", this.radio_10kwh_storage);
                break;
            case "15kwh storage":
                this.validateRadioButton( "Should be selected", this.radio_5kwh_storage);
                this.validateRadioButton( "Should not be selected", this.radio_15kwh_storage);
                this.select_15kwh_storage.click();
                this.validateRadioButton( "Should be selected", this.radio_15kwh_storage);
                break;
        }
    }
    public void validateRadioButton(String status, WebElement elementName){
        switch(status) {
            case "Should not be selected":
                if(elementName.isSelected()){
                    throw new IllegalStateException("Radio button is selected.");
                } else {
                    System.out.println("Radio button is not selected.");
                }
                break;
            case "Should be selected":
                if(elementName.isSelected()){
                    System.out.println("Radio button is selected.");
                } else {
                    throw new IllegalStateException("Radio button is not selected.");
                }
                break;
        }
    }

    public void goToQuotePage(){
        this.open_quote_page_button.click();
        this.verifyTabHeading(this.get_summary_tab_heading.getText(), DefaultValues.TabHeadings.QUOTE_DETAILS.getValue());
    }

    public void selectPaymentOption(){
        this.validateRadioButton( "Should be selected", this.radio_purchase);
        this.validateRadioButton( "Should not be selected", this.radio_hire_purchase);
        this.select_hire_purchase.click();
        this.validateRadioButton( "Should be selected", this.radio_hire_purchase);
    }

    public void goToContactDetailsPage(){
        this.open_contact_options_page_button.click();
    }

    public void verifyPageTitle(){
        String expectedTitle = DefaultValues.PageTitles.MAINPAGE.getValue();
        String title =  driver.getTitle();
        Assert.assertEquals(title, expectedTitle);
    }

    //Get various elements text values from the low consumption column and verify them with expected values.
    public void verifyLowConsumptionPackage(){

        String actualPackageName = this.low_consumption_name.getText();
        String actualConsumptionValue = this.low_consumption_value.getText();
        String actualArea = this.get_Low_consumption_min_area.getText();
        String actualPower = this.get_Low_consumption_power.getText();
        String actualCost = this.get_Low_consumption_cost.getText();
        String actualHireCost = this.get_Low_consumption_hire_cost.getText();
        String actualOutput = this.get_Low_consumption_output.getText();
        String actualPanels = this.get_Low_consumption_panels.getText();

        String expectedPackageName = DefaultValues.LowConsumptionExpectedValues.PACKAGE.getValue();
        String expectedConsumptionValue = DefaultValues.LowConsumptionExpectedValues.CONSUMPTION.getValue();
        String expectedArea = DefaultValues.LowConsumptionExpectedValues.AREA.getValue();
        String expectedPower = DefaultValues.LowConsumptionExpectedValues.POWER.getValue();
        String expectedCost = DefaultValues.LowConsumptionExpectedValues.COST.getValue();
        String expectedHireCost = DefaultValues.LowConsumptionExpectedValues.HIRE_COST.getValue();
        String expectedOutput = DefaultValues.LowConsumptionExpectedValues.OUTPUT.getValue();
        String expectedPanels = DefaultValues.LowConsumptionExpectedValues.PANELS.getValue();

        String[] expected = {expectedPackageName, expectedConsumptionValue, expectedArea, expectedPower, expectedCost, expectedHireCost, expectedOutput, expectedPanels,};

        String[] actual = {actualPackageName, actualConsumptionValue, actualArea, actualPower, actualCost, actualHireCost, actualOutput, actualPanels};

        int index = 0;

        for (String ExpectedValue : expected){
            Assert.assertEquals(ExpectedValue, actual[index]);
            index++;
        }
    }

    //Verify that more options is closed, user can open it and then more options is shown.
    public void moreAboutTheSolutionOption(){
        if(this.get_Low_consumption_output.isDisplayed()){
            throw new IllegalStateException("Element found");
        }
        this.get_Low_consumption_more_info.click();
        if(this.get_Low_consumption_output.isDisplayed()){
            System.out.println("More options was opened");
        } else {
            throw new IllegalStateException("Element not found");
        }
    }

    public void verifyQuoteInfo(){
        String actualContractFee = this.get_quote_contract_fee.getText();
        String actualPackageCost = this.get_quote_package_cost.getText();
        String actualPowerSolution = this.get_quote_power_solution.getText();
        String actualPackageName = this.get_quote_package_name.getText();
        String actualTotalCost = this.get_quote_total_cost.getText();


        String expectedPackageName = DefaultValues.MediumConsumptionExpectedValues.PACKAGE.getValue();
        String expectedPower = "päiksepaneelide lahendus " + DefaultValues.MediumConsumptionExpectedValues.POWER.getValue();
        String expectedCost = DefaultValues.MediumConsumptionExpectedValues.COST.getValue();
        String expectedTotalCost = actualTotalCost;
        String expectedContractFee = "0 €";

        String[] expectedValues = {expectedCost, expectedPower, expectedPackageName, expectedTotalCost, expectedContractFee};
        String[] actualValues = {actualPackageCost, actualPowerSolution, actualPackageName, actualTotalCost, actualContractFee};

        int index = 0;

        for (String ExpectedValue : expectedValues){
            Assert.assertEquals(ExpectedValue, actualValues[index]);
            index++;
        }
    }
}