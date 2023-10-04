import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class App {
    public static void main(String[] args) throws Exception {
        ListaFormulario listaFormulario = new ListaFormulario();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        // LAÇO DE REPETIÇÃO DA CLASSE CadastroFormulario irá percorrer todos os valores
        // da Array, e seu respectivos valores de acordo com o padrão GET da classe
        for (CadastroFormulario c : listaFormulario.listaformulario) {

            Thread.sleep(1000);
            WebElement firstName = driver.findElement(By.id("firstName"));
            firstName.sendKeys(c.get_name());

            Thread.sleep(1000);
            WebElement lastName = driver.findElement(By.id("lastName"));
            lastName.sendKeys(c.get_lastname());

            Thread.sleep(1000);
            WebElement userEmail = driver.findElement(By.id("userEmail"));
            userEmail.sendKeys(c.get_email());

            Thread.sleep(1000);
            WebElement radioMale = driver.findElement(By.xpath("//label[normalize-space()='" + c.get_gender() + "']"));

            if (!radioMale.isSelected()) {
                radioMale.click();
            }
            Thread.sleep(1000);
            WebElement userNumber = driver.findElement(By.id("userNumber"));
            userNumber.sendKeys(c.get_phone());

            Thread.sleep(1000);
            WebElement datenascimento = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].value = '';", datenascimento);
            datenascimento.sendKeys(c.get_nascimento());

            Thread.sleep(1000);
            Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(4));
            WebElement btn_click = wait
                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='submit']")));
            btn_click.click();

            Thread.sleep(1000);

            WebElement btn_click_exit = wait
                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='closeLargeModal']")));
            btn_click_exit.click();

        }
    }

}
