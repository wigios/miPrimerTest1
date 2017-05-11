import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MiPrimerTest {
    @Test
    public void verificar(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://josepablosarco.wordpress.com");
        String contiene = driver.getTitle();

        //Assert.assertTrue(contiene.equalsIgnoreCase("Testing en Español | Articulos y Herramientas de Testing, pero en Español"));
        Assert.assertTrue(driver.getTitle().contains("Testing"), "El titulo debe contener la palabra testing");

        driver.close();

        driver.quit();
    }

}
