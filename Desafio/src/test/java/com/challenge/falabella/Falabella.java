package com.challenge.falabella;

import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import dev.failsafe.internal.util.Assert;

public class Falabella {
	
	By modalLocator = By.className("dy-lb-close");
	By menuLocator = By.id("testId-HamburgerBtn-toggle");
	By categoriaLocator = By.xpath("//div[2]/div/div/div[2]/div/div/div");
	By categoriaDosLocator = By.linkText("Anteojos de sol");
	By barraBusqueda = By.id("testId-SearchBar-Input");
	By realizarBusqueda = By.xpath("//*[@id=\"testId-search-wrapper\"]/div/button/img");
	By categoria = By.xpath("//*[@id=\"testId-search-wrapper\"]/div[3]/section[3]/ul/li[1]/a");
	By categoria2= By.xpath("//*[@id=\"slider-faceta\"]/div[2]/a/img");
	By cargador = By.id("testId-pod-image-https://falabella.scene7.com/is/image/Falabella/14952798_1");
	By agregarCarrito = By.id("add-to-cart-button");
	By btnIrAlCarro = By.xpath("//*[@id=\"linkButton\"]");
	By precioCargador = By.xpath("//*[@id=\"__next\"]/div/div/div/div[1]/div/div[3]/div/div[1]/div/div/div[2]/div/div[2]/div[1]/div/div/div/span");
	By precioCarro = By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div/div[2]/div/ul/li/div/div[2]/div[2]/div[2]/span");
	private WebDriver driver;

	public Falabella(WebDriver driver) {
	 this.driver = driver;
	}


	public void buscarProducto() throws InterruptedException, AWTException {
		Thread.sleep(5000);
		driver.findElement(modalLocator).click();
		Thread.sleep(3000);
		driver.findElement(barraBusqueda).click();
		driver.findElement(barraBusqueda).sendKeys("Samsung Galaxy");
		Thread.sleep(2000);
		driver.findElement(categoria).click();
		Thread.sleep(2000);
		
        
		}
	
	public void validarPrecio() throws InterruptedException, AWTException {
		Thread.sleep(5000);
		driver.findElement(modalLocator).click();
		Thread.sleep(3000);
		driver.findElement(barraBusqueda).click();
		driver.findElement(barraBusqueda).sendKeys("Cargador samsung");
		driver.findElement(realizarBusqueda).click();;		
		Thread.sleep(2000);
		driver.findElement(cargador).click();
		Thread.sleep(2000);
		driver.findElement(agregarCarrito).click();
		Thread.sleep(3000);
		driver.findElement(btnIrAlCarro).click();
		String precioCarr = driver.findElement(precioCarro).getText();
		Thread.sleep(3000);
		assertEquals("$19.990", precioCarr);
        
		}


	
}

