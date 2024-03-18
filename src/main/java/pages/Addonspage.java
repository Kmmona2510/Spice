package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecification;

public class Addonspage  extends ProjectSpecification {
	
	public Addonspage  (WebDriver sdriver) {
		this.driver=driver;
	}
	
	//To click continue button to add on page
	public Addonspage continuebutton() {
		
	//To handle the popup	
//	WebElement popelement =	findElement("id", "at_addon_close_icon");
//	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
//	popelement.click();
//	wait.until(ExpectedConditions.elementToBeClickable(popelement));
	//Click the continue button
	findElement("Xpath", "(//div[@data-testid='add-ons-continue-footer-button'])[3]").click();
	return this;
	
}
	}