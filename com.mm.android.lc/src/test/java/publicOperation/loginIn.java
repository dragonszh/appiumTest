package publicOperation;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class loginIn {
	private loginIn(){
		
	}
	public static void loginDefault(AndroidDriver driver){
    	WebElement logUserName = driver.findElementById("com.mm.android.lc:id/login_username");
    	logUserName.click();
    	logUserName.sendKeys("15858156570");
    	WebElement logPassWord = driver.findElementById("com.mm.android.lc:id/login_password");
    	logPassWord.click();
    	logPassWord.sendKeys("62273159");
    	WebElement logBtn = driver.findElementById("com.mm.android.lc:id/login_login");
    	logBtn.click();
	}
	
	public static void loginModifyPassWord(AndroidDriver driver){
    	WebElement logUserName = driver.findElementById("com.mm.android.lc:id/login_username");
    	logUserName.click();
    	logUserName.sendKeys("15858156570");
    	WebElement logPassWord = driver.findElementById("com.mm.android.lc:id/login_password");
    	logPassWord.click();
    	logPassWord.sendKeys("123456");
    	WebElement logBtn = driver.findElementById("com.mm.android.lc:id/login_login");
    	logBtn.click();
	}
	
}
