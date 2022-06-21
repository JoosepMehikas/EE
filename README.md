This is a repository for testing solar panel quote calculator, on Eesti Energia page, using Java, TestNG and Selenium.

At the moment I created a test that compares main differentiating values for the packages. And this time I compare information for the low consumption package.
Then I select the medium package and proceed to the next page. There I verify the tab heading and choose to go on without any energy storage solution.
On the summary page I verify that the client is shown the same options that they had selected before. Then I continue to contacts page.

Usage: Chrome driver must be for the same version that your system browser is. If it is different, then you can download it from here: https://chromedriver.storage.googleapis.com/index.html
Replace it with the existing one.
Current version stored here is: 102.0.5005

To run the test: From CalculatorTest.java run @Test
