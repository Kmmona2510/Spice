package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecification;

public class Signuppage extends ProjectSpecification {

	public Signuppage(WebDriver driver) {
		this.driver = driver;
	}

	// To select the title
	public Signuppage title(String value) {

		try {
			WebElement selectele = findElement("Xpath", "//select[@class='form-control form-select ']");
			Select select = new Select(selectele);
			select.selectByVisibleText(value);
		} catch (Exception e) {
			System.out.println("The value not taken");
		}

		return this;

	}

	// To send Firstname value
	public Signuppage firstName(String firstname) {

		WebElement ele = findElement("Xpath", "//input[@id='first_name']");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys(firstname);
		return this;

	}

	// To send the Value to lastname
	public Signuppage lastName(String lastname) {

		findElement("Xpath", "//input[@id='last_name']").sendKeys(lastname);
		return this;

	}

	// To select the country value
	public Signuppage country(String value) throws InterruptedException {
		Thread.sleep(2000);
		WebElement country = findElement("Xpath", "//select[@class='form-control form-select']");
		Select select = new Select(country);
		select.selectByValue(value);
		return this;

	}

	// To select the date
	public Signuppage dobdate(String datepick) {
		try {
			WebElement date = findElement("id", "dobDate");
			date.sendKeys(datepick);
			Thread.sleep(2000);
			date.click();
			date.click();

		} catch (Exception e) {

		}

		return this;
	}

	// To send the mobile number
	public Signuppage mobilenumber(String mobileno) {

		findElement("Xpath", "//input[@placeholder='+91 01234 56789']").sendKeys(mobileno);
		return this;
	}

	// To send the email
	public Signuppage email(String email) {

		findElement("id", "email_id").sendKeys(email);
		return this;
	}

	// To send the password value
	public Signuppage password(String password) {

		findElement("id", "new-password").sendKeys(password);
		return this;
	}

	// To send the confirmpassword value
	public Signuppage confirmpassword(String conpassword) {

		findElement("id", "c-password").sendKeys();
		return this;
	}

	// To click the checkbox
	public Signuppage checkbox() {
		findElement("id", "defaultCheck1").click();
		return this;
	}

	// TO click the signin button
	public Signuppage submit() {

		findElement("Xpath", "//button[text()='Submit']").click();
		return this;
	}
}
