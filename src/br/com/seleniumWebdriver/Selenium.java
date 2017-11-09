package br.com.seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Selenium {

	public static void main(String[] args) {
	
		
		
		
		
		WebDriver paginaWeb = new FirefoxDriver();
		
		paginaWeb.get("https://www.mercadolivre.com.br/");
		
		// Pesquisar objeto html no formulário por nome 
		WebElement objetoForm = paginaWeb.findElement(By.name("as_word"));
		
		SeleniumUtils.setElementoPorNome("as_word", "Cubo Magico", paginaWeb);
		
		objetoForm.submit();

	}
	
	

}
