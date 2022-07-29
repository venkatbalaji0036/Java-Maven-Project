package seleniumtestcases;

import globaldeclarations.GlobalSeleniumMethods;
import globaldeclarations.GlobalVariables;
import pageobject.DhtmlDragDropObjects;

public class DhtmlDragDropTC extends GlobalSeleniumMethods{
	GlobalVariables gv = new GlobalVariables();
	DhtmlDragDropObjects dd = new DhtmlDragDropObjects();
	
	public void DhtmlDragDrop() {
		openBrowser();
		navigateToUrl(gv.urlofDHTMLDragDrop);
		dragDrop(dd.dragFrom, dd.dragTo);
		closeBrowser();
	}
	
	public static void main(String[] args) {
		DhtmlDragDropTC obj = new DhtmlDragDropTC();
		obj.DhtmlDragDrop();
	}
}
