package pages;

import org.openqa.selenium.By;
import services.WebDriverServiceImpl;

public class LoginPage extends WebDriverServiceImpl{


	public LoginPage typeUsername(String username) {
		type(getDriver().findElement(By.name("username")),username,"Username");
		return this;
	}

	public LoginPage clickNext() throws InterruptedException {
		click(getDriver().findElement(By.xpath("//input[@value='Next']")),"NEXT");
		Thread.sleep(2000);
		return this;
		
	}
		
	public LoginPage typePassword(String password) {
		type(getDriver().findElement(By.id("password")),password,"Password");
		return this;
	}

	public LoginPage clickSignIn() throws InterruptedException {
		click(getDriver().findElement(By.xpath("//input[@value='Sign In']")),"SignIn");
		Thread.sleep(2000);
		return this;
	}
}
