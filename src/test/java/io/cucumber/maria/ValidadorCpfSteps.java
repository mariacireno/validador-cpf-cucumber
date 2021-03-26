package io.cucumber.maria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class ValidadorCpfSteps {
	
	public ValidadorCpfSteps() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		browser = new ChromeDriver();
	}
	
	public WebDriver browser;
	
	@Quando("eu acesso o sistema de validacao de CPF")
	public void eu_acesso_o_sistema_de_validacao_de_CPF() {		
		browser.get("http://localhost:8081/");
	}

	@Quando("digito no campo nome {string}")
	public void digito_no_campo_nome(String string) {
	    WebElement input = browser.findElement( By.cssSelector("input[name='nome']") );
	    input.sendKeys(string);
	    
	}

	@Quando("digito no campo cpf {string}")
	public void digito_no_campo_cpf(String string) {
		 WebElement input = browser.findElement( By.cssSelector("input[name='cpf']") );
		 input.sendKeys(string);
	}
	
	@Quando("clico no botão validar")
	public void clico_no_botão_validar() {
		WebElement button = browser.findElement( By.cssSelector("button[name='validar']") );
	    button.click();
	}

	@Então("eu devo ver a mensagem {string}")
	public void eu_devo_ver_a_mensagem(String string) {
		WebElement message = browser.findElement( By.cssSelector(".alert") );
		assertEquals(string, message.getText());
		browser.quit();
	}

}
