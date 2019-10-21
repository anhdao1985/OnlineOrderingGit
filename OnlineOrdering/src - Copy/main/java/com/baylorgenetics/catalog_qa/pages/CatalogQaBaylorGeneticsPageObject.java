package com.baylorgenetics.catalog_qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class CatalogQaBaylorGeneticsPageObject  {
	
	protected WebDriver driver;
	
	public CatalogQaBaylorGeneticsPageObject(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	

	
}