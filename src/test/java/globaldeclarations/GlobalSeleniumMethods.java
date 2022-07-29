package globaldeclarations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class GlobalSeleniumMethods {
	
	//initialize the driver
	public WebDriver driver;
	
	GlobalVariables gv = new GlobalVariables();
	
	public void openBrowser() {
		if(gv.Browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		}else if(gv.Browser.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if(gv.Browser.equals("Safari")) {
			driver = new SafariDriver();
		}else {
			System.out.println("Browser value is invalid");
		}
	}
	
	public void navigateToUrl(String url) {
		try {
			driver.navigate().to(url);
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception a) {
			a.printStackTrace();
		}
	}	
	
	public void enterText(By val, String InputTextValue) {
		driver.findElement(val).sendKeys(InputTextValue);
	}
	
	public void click(By val) {
		driver.findElement(val).click();
	}
	
	public void selectFromDropDown(By val, String ValueToSelect) {
		WebElement ele = driver.findElement(val);
		Select sel = new Select(ele);
		sel.selectByVisibleText(ValueToSelect);
	}
	
	public List<WebElement> getWebElements(By val) {
		List<WebElement> eleList = driver.findElements(val);
		return eleList;
	}
	
	public String readTextonbtn(By val) {
		String textOnBtn = driver.findElement(val).getAttribute("value");
		return textOnBtn;
	}
	
	public void dragDrop(By fromele, By toele) {
		WebElement from = driver.findElement(fromele);
		WebElement to = driver.findElement(toele);
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to);
		act.perform();
	}
	
	public void moveCursorTo(By val) {
		WebElement ele = driver.findElement(val);
		Actions act = new Actions(driver);
		act.moveToElement(ele);
		act.perform();
	}
	
	public String readTextFromApplication(By val) {
		String readText = driver.findElement(val).getText();
		return readText;
	}
	
	public void wait(int timeInMilliSeconds) {
		try {
			Thread.sleep(timeInMilliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	

}
















