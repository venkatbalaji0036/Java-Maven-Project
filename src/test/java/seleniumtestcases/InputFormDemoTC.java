package seleniumtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import globaldeclarations.GlobalSeleniumMethods;
import globaldeclarations.GlobalVariables;
import pageobject.InputFormDemoObjects;

public class InputFormDemoTC extends GlobalSeleniumMethods{
	InputFormDemoObjects ido = new InputFormDemoObjects();
	GlobalVariables gv = new GlobalVariables();
	//GlobalSeleniumMethods gsm = new GlobalSeleniumMethods();
	
/*	public void InputFormWithValidations() {
		gsm.driver.findElement(By.name("first_name")).sendKeys("A");
		String FNameErrorMsg = gsm.driver.findElement(By.className("help-block")).getText();
		System.out.println(FNameErrorMsg);
		
		if(FNameErrorMsg.equals("Please enter more than 2 characters")) {
			System.out.println("Error message is displayed correctly");
		}else {
			System.out.println("Error message is not displayed correctly");
		}
		
		gsm.driver.findElement(By.name("first_name")).sendKeys("Abcd");
		gsm.driver.findElement(By.name("email")).sendKeys("emailvalue@gmail.com");
		
		WebElement ele = gsm.driver.findElement(By.name("state"));
		Select val = new Select(ele);
		val.selectByVisibleText("Hawaii");
		
		gsm.driver.findElement(By.xpath("//input[@value='yes']")).click();
		gsm.driver.findElement().click();
	}

*/	
	//syntax of Xpath 
	
	//<tagname>[@<attribute name>='<attribute Value>']
	
	
	
	
	
	
	
	
	public void inputFormValidateion() {
		openBrowser();
		navigateToUrl(gv.urlofDemoSeleniuminputForm);
		enterText(ido.InputForm_fName, "Ganesh");
		enterText(ido.InputForm_lName, "Suresh");
		enterText(ido.InputForm_email, "Ganesh.Ramesh@gmail.com");
		enterText(ido.InputForm_phoneNumber, "9876543210");
		enterText(ido.InputForm_address, "Hyderabad");
		enterText(ido.InputForm_city, "Hyderabad");
		selectFromDropDown(ido.InputForm_state, "Hawaii");
		click(ido.InputForm_yesRadioBtn);
		click(ido.InputForm_sendBtn);
		closeBrowser();
	}
	
	public static void main(String[] args) {
		InputFormDemoTC obj = new InputFormDemoTC();
		obj.inputFormValidateion();
	}
	
	public void EnterDataToInputForm() {
		enterText(ido.InputForm_fName, "Ganesh");
		enterText(ido.InputForm_lName, "Suresh");
		enterText(ido.InputForm_email, "Ganesh.Suresh@gmail.com");
		enterText(ido.InputForm_phoneNumber, "9876543210");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}








