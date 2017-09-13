package br.com.seleniumWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Selenium {

	public static void main(String[] args) {
	
		
		WebDriver paginaWeb = new FirefoxDriver();
		
		paginaWeb.get("https://www.mercadolivre.com.br/");
		
		

	}
	
	

}
