package Steps2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class definitions {

	WebDriver driver;

	@Given("User Opens the Browser and ENter the Url")
	public void user_opens_the_browser_and_e_nter_the_url() {

		driver = new ChromeDriver();

		driver.get("https://v1.training-support.net/selenium/simple-form?");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@When("User Enters firstname,lastname and Email")
	public void user_enters_firstname_lastname_and_email() {

		driver.findElement(By.cssSelector("#firstName")).sendKeys("Prince");

		driver.findElement(By.cssSelector("#lastName")).sendKeys("Raj");

		driver.findElement(By.cssSelector("#email")).sendKeys("prraj3300@gmail.com");

	}

	@When("Enters the Contact Number and Message")
	public void enters_the_contact_number_and_message() {

		driver.findElement(By.cssSelector("#number")).sendKeys("0303292932");

		driver.findElement(By.cssSelector("[rows='2']")).sendKeys("Hello");

	}

	@When("Click on submit")
	public void click_on_submit() {

		driver.findElement(By.cssSelector("[type='submit']")).click();

	}

	@Then("Thank You for reaching out to us should have been displayed")
	public void thank_you_for_reaching_out_to_us_should_have_been_displayed() throws InterruptedException {

		driver.switchTo().alert().accept();

		Thread.sleep(2000);

		driver.close();

	}

}
