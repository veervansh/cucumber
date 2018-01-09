package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;
@Given("^Open  the chrome browser and start application$")
public void open_the_chrome_browser_and_start_application() throws Throwable {
	//WebDriver driver= new ChromeDriver();
	System.setProperty("webdriver.gecko.driver","E:\\Nisum\\geckodriver.exe");

driver = new FirefoxDriver();
driver.get("http:\\gmail.com");
	
   
}

@When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
public void i_enter_valid_and(String uname, String passwrd) throws Throwable {
driver.findElement(By.id("identifierId")).sendKeys(uname); 
Thread.sleep(5000);
driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[2]/div[1]/div/content/span")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[3]/div[1]/div[1]/div/div/div[1]/div/div[1]/input")).sendKeys(passwrd);
}

@Then("^I must get home page$")
public void i_must_get_home_page() throws Throwable {
    driver.quit();
}

}
