package stepsDefinitions;

import core.DriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class Hooks extends DriverFactory {


    @Before
    public void startAppium() throws MalformedURLException {
        driver = DriverFactory.getDriver();

    }

    @Test
    public void sampleTest() {

        driver.get("https://dev-validacao-cadastral-frontend.clarobrasil.mobi/cadastroprepago/");
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		driver.findElement(By.id("input-cpf")).click();
		driver.findElement(By.id("input-cpf")).sendKeys("05346619984");
		driver.findElement(By.id("input-phonenumber")).sendKeys("11993400053");
		driver.findElement(By.id("btn-cpf-proximo")).click();
    
    }

    @After
    public void tearDown() {
//        driver.quit();
        System.out.printf("fim");
    }
}
