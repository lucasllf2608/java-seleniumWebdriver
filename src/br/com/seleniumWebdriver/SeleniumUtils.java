package br.com.seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SeleniumUtils {
	
	
	public static void setElementoPorNome(String nome, String chaveElemento, WebDriver paginaWeb){
		WebElement objetoForm = paginaWeb.findElement(By.name(nome));
		objetoForm.sendKeys(chaveElemento);
		System.out.println("Valor "+chaveElemento +" inserido com sucesso no elemento com o nome: "+ nome );
	}
	


	public static void setElementoPorId(String id, String chaveElemento, WebDriver paginaWeb){
		WebElement objetoForm = paginaWeb.findElement(By.id(id));
		objetoForm.sendKeys(chaveElemento);
		System.out.println("Valor "+chaveElemento +" inserido com sucesso no elemento com o id: "+ id );
	}
	
	
	public static void setElementoPorXpath(String xpath, String chaveElemento, WebDriver paginaWeb){
		WebElement objetoForm = paginaWeb.findElement(By.xpath(xpath));
		objetoForm.sendKeys(chaveElemento);
		System.out.println("Valor "+chaveElemento +" inserido com sucesso no elemento com o xpath: "+ xpath);
		
	}
	
	
	public static void eventoDeClickPorNome(String nome, WebDriver pagina){ 
		pagina.findElement(By.name(nome)).click(); 
	}
	
	public static void eventoDeClickPorId(String id, WebDriver pagina){
		pagina.findElement(By.id(id)).click();
	}
	
	public static void eventoDeClickPorXpath(String xpath, WebDriver pagina){
		pagina.findElement(By.xpath(xpath)).click();
	}
	
	
	
	
}
