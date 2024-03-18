package test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.Homepage;

public class TC002_Logintest extends ProjectSpecification {
	
	//To pass the value to excelfile
	@BeforeTest
	public void excelfile() {
		excelfile = "Logindata";
	}

	//To test using @test annotation
	@Test(dataProvider = "exceldata")
	public void login(String mail, String password, String match) throws InterruptedException {

		Homepage login = new Homepage(driver);

		login.login()
		.email()
		.emailid(mail)
		.password(password)
		.loginbutton();
		
		//for validation 
		Thread.sleep(2000);
		if (match.equals("correct")) {
			WebElement logelement = findElement("Xpath", "//div[contains(text(),'Hi Mohana')]");
			String logintext = logelement.getText();
			Assert.assertEquals(logintext, "Hi Mohana");
			System.out.println("The user is logged in:" +logintext);

		} else if (match.equals("emailwrong")) {

			String emailtext = findElement("Xpath", "//div[contains(text(),'Please enter a valid email address')]").getText();
			Assert.assertEquals(emailtext, "Please enter a valid email address");

			System.out.println("Enter valid Email");
		}

		else {
			System.out.println("Enter valid email and Valid password");
		}

	}
}