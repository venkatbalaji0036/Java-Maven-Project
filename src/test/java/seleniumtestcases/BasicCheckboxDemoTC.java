package seleniumtestcases;

import java.util.List;

import org.openqa.selenium.WebElement;

import globaldeclarations.GlobalSeleniumMethods;
import globaldeclarations.GlobalVariables;
import pageobject.BasicCheckboxDemoObjects;

public class BasicCheckboxDemoTC extends GlobalSeleniumMethods{
	BasicCheckboxDemoObjects bc = new BasicCheckboxDemoObjects();
	GlobalVariables gv = new GlobalVariables();
	
	public void GroupCheckBox() {
		openBrowser();
		navigateToUrl(gv.urlofDemoSeleniumBasicCheckbox);
		
		List<WebElement> ele = getWebElements(bc.BasicCheckbox_CheckBoxes); 
		for(int i=0;i<ele.size();i++) {
			ele.get(i).click();
			if(i==ele.size()-1&&readTextonbtn(bc.BasicCheckbox_checkAllBtn).equals("Uncheck All")) {
				System.out.println("Uncheck All is working fine");
			}else if(i<ele.size()&&readTextonbtn(bc.BasicCheckbox_checkAllBtn).equals("Check All")){
				System.out.println("Check All is working fine");
			}else {
				System.out.println("Button functionality is not woriking fine");
			}
		}
		closeBrowser();
	}
	
	public static void main(String[] args) {
		BasicCheckboxDemoTC obj = new BasicCheckboxDemoTC();
		obj.GroupCheckBox();
	}
}
