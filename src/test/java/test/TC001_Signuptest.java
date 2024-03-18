package test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.Homepage;

public class TC001_Signuptest  extends  ProjectSpecification{
	
	//To pass the data to excel sheet
	@BeforeTest
	public void excelfile() {
		excelfile = "Signupdata";
	}

	//using @test test the method
	@Test(dataProvider ="exceldata")
	public  void signin(String title,String firstname,String lastname,String country,String dob,String mobile,String email,
			String password,String confirmpass ) throws InterruptedException {
		
		Homepage signin = new Homepage(driver);
		signin.signup()
		.title(title)
		.firstName(firstname)
		.lastName(lastname)
		.country(country)
		.dobdate(dob)
		.mobilenumber(mobile)
		.email(email)
		.password(password)
		.confirmpassword(confirmpass)
		.checkbox().submit();
	
	//For validation check the condition	
	WebElement txtele =	findElement("Xpath", "//div[contains(text(),'Member account exists with given ')]");
	String actualtxt = txtele.getText();
	
	if(actualtxt.contains("Member account exists with given mobile number")){
		
		System.out.println("The account is created");
	}
	else {
		System.out.println("The account is not created");
	}
	
		
	}

}
