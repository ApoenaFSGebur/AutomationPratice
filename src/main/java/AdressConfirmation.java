import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertEquals;

public class AdressConfirmation extends BaseTest {

    private By validarEndereco = By.cssSelector("#uniform-id_address_delivery.selector span");
    private By btnConfirmarEndereco = By.name("processAddress");

    public void confirmarEnderecoEntrega(){
        String validaEndereco = getWait().until(ExpectedConditions.presenceOfElementLocated(validarEndereco)).getText().toLowerCase();
        assertEquals("teste",validaEndereco);

        getDriver().findElement(btnConfirmarEndereco).click();
    }
}