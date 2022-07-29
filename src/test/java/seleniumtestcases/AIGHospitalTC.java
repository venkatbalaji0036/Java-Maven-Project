package seleniumtestcases;

import globaldeclarations.GlobalSeleniumMethods;
import globaldeclarations.GlobalVariables;
import pageobject.AIGHospitalObjects;

public class AIGHospitalTC extends GlobalSeleniumMethods{
	GlobalVariables gv = new GlobalVariables();
	AIGHospitalObjects aigo = new AIGHospitalObjects();
	
	public static void main(String[] args) {
		AIGHospitalTC obj = new AIGHospitalTC();
		obj.MouserHoverAction();
	}
	
	public void MouserHoverAction() {
		openBrowser();
		navigateToUrl(gv.urlToAigHospitals);
		moveCursorTo(aigo.AIG_EducationHub);
		wait(2000);
		click(aigo.AIG_Doctors);
		String text = readTextFromApplication(aigo.AIG_DoctorInDoctorPage);
		if(text.equals("Doctors")) {
			System.out.println("Mouse Hover successful");
		}else {
			System.out.println("Mouse Hover unsuccessful");
		}
	}
}
