package pages;

import org.openqa.selenium.WebDriver;

import base.ProjectSpecification;

public class Loginpage extends ProjectSpecification {
	
	//create a constructor for chaining
	public Loginpage(WebDriver driver) {
		this.driver =driver;
	}
	
	//To click the email button
	public Loginpage email() {
		
		findElement("Xpath", "(//*[local-name()='svg'])[26]").click();
		return this;
	}
	
	//To send the value to emailid
	public Loginpage emailid(String mail) {
		
		findElement("Xpath", "//input[@type='email']").sendKeys(mail);
		return this;
	}
	
	//To send the value to password
	public Loginpage password(String password) {
		
		findElement("Xpath", "//input[@type='password']").sendKeys(password);
		return this;
	}
	
	//To click the login button
	public Loginpage loginbutton() {
		findElement("Xpath", "//div[@data-testid='login-cta']").click();
		return this;
	}

}
