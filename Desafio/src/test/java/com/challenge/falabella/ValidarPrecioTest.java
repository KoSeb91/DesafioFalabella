package com.challenge.falabella;

import java.awt.AWTException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidarPrecioTest {
	
	WebDriver driver;
	Falabella falabella;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.falabella.com/");
		falabella = new Falabella(driver);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test
	public void testValidarPrecio() throws InterruptedException, AWTException {
		falabella.validarPrecio();
		
		
		
	}
}
