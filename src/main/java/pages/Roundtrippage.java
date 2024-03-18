package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecification;

public class Roundtrippage extends ProjectSpecification {

	public Roundtrippage(WebDriver driver) {
		this.driver = driver;
	}
	
	//To give value round trip from
	public Roundtrippage roundFrom() {

		findElement("Xpath", "//div[text()='From']").click();
		findElement("Xpath", "//div[text()='Delhi']").click();
		return this;
	}

	//To give round trip to value
	public Roundtrippage roundTo() {
		
		findElement("Xpath", "//div[text()='Mumbai']").click();
		return this;
	}
	//To pick the date in depature field
	public Roundtrippage roundDepature() {
		
		String expectedMonth = "March 2024";
		String date ="25";
		findElement("Xpath", "(//div[@class='css-1dbjc4n'])[56]").click();
		 //verify the actual month is equals to expected month
		while(true){   
			
			String actualMonth	= findElement("Xpath", "(//div[contains(text(),'March')])[1]").getText();
				if(expectedMonth.equals(actualMonth)) {
				break;
		
				}
					else {
						//if its not click the arrow unit expected reach
					findElement("Xpath", "(//*[local-name()='svg'])[13]").click();                       
							}
		
					}
		
		//click the selected date 
		findElement("Xpath", "(//div[contains(text(),'"+date+"')])[1]").click();
		return this;
	}
	
	//To pick the return date
	public Roundtrippage roundReturn() {
		
		String expectedMonth ="April 2024";
		String date = "3";
		findElement("Xpath", "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[4]").click();
		
		  //verify the actual month is equals to expected month
			while(true){                                     
				String actualMonth	= findElement("Xpath", "(//div[contains(text(),'April')])[1]").getText();
					if(expectedMonth.equals(actualMonth)) {
					break;
			
						}
						else {
							//if its not click the arrow unit expected reach
							findElement("Xpath", "(//*[local-name()='svg'])[13]").click();                       
								}
			
						}

		findElement("Xpath", "(//div[contains(text(),'"+date+"')])[7]").click();
		return this;

	}

	//To click the passenger
	public Roundtrippage roundPassengers() {
		
		findElement("Xpath", "//div[text()='1 Adult']").click();
		return this;
	}

	//To click the currency
	public Roundtrippage currency() {

		findElement("Xpath", "//div[text()='INR']");
		return this;
	}

	//To click search filght button
	public Roundtrippage searchflight_Button() throws InterruptedException {
				
		WebElement search = findElement("Xpath", "//div[@data-testid='home-page-flight-cta']");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		search.click();
		wait.until(ExpectedConditions.elementToBeClickable(search));
		return this;

}
	}
