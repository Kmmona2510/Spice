package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecification;

public class Onewaytrippage extends ProjectSpecification {
	
	//Create a constructor for chaining
	public  Onewaytrippage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	//To click the from value
	public Onewaytrippage from() throws InterruptedException {
		
		Thread.sleep(3000);
		findElement("Xpath", "//div[text()='From']").click();
		findElement("Xpath", "//div[text()='Delhi']").click();
		return this;
	}
	
	//To click the to value
	public Onewaytrippage to() {
		
		findElement("Xpath", "//div[text()='Mumbai']").click();
		return this;
	}
	
	//To click the departure date
	public Onewaytrippage depature_Date() {
		
		findElement("Xpath", "(//div[text()='3'])[3]").click();
		return this;
	}
	
	//To click the Passenger 
	public Onewaytrippage passengers() {
		
		findElement("Xpath", "//div[text()='1 Adult']").click();
		return this;
	
	}
	
	//To Click the currency
	public Onewaytrippage currency() {
		
		findElement("Xpath", "//div[text()='INR']");
		return this;
	}
	
	//To click the search button
	public Onewaytrippage searchflight_Button() throws InterruptedException {
		
		WebElement search = findElement("Xpath", "//div[@data-testid='home-page-flight-cta']");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		search.click();
		wait.until(ExpectedConditions.elementToBeClickable(search));
		return this;
		
	}

	//After click the search button it moves select flight page
	public Selectflightspage select_Flights() {
		
		return new Selectflightspage(driver);
		
		
	}
}
