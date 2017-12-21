package com.mycompany.app;

import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConcatenadorSteps {

	private WebDriver nav;

	@BeforeScenario
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Kien\\chromedriver.exe");
		nav = new ChromeDriver();
		nav.get("C:\\Users\\ADM\\my-app\\src\\main\\java\\com\\mycompany\\app\\pagina.html");
	}

	@Given("o usuario ira preencher os campos de nome e sobrenome")
	public void instanciaConcatenar() {
		nav.findElement(By.id("nome")).sendKeys("Claudio");
		nav.findElement(By.id("sobrenome")).sendKeys("Neiva");
	}

	@When("selecionar botao exibir nome completo")
	public void concatenarTudo() {
		nav.findElement(By.id("botao")).click();
	}

	@Then("imprimir nome e sobrenome concatenados que sera $nomeEsperado $sobrenomeEsperado")
	public void nomeCompleto(String nomeEsperado, String sobrenomeEsperado) {
		String nomeSobrenomeEsperado = nomeEsperado + " " + sobrenomeEsperado;
		String nomeSobrenomeAtual = nav.findElement(By.id("nomesobrenome")).getText();
		Assert.assertEquals(nomeSobrenomeEsperado, nomeSobrenomeAtual);
	}

}
