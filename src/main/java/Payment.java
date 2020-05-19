import org.openqa.selenium.By;

public class Payment extends BaseTest{

    private By btnPgto = By.className("bankwire");

    public void tipoPagto(String valTotal){

        getDriver().findElement(btnPgto).click();
    }
}