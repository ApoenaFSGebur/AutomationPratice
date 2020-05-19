import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Authentication extends BaseTest{

    private By novoEmail = By.id("email_create");
    private By btnCriarConta = By.id("SubmitCreate");
    private By genero = By.id("id_gender2");
    private By primeiroNome = By.id("customer_firstname");
    private By ultimoNome = By.id("customer_lastname");
    private By senha = By.id("passwd");
    private By dataNascDia = By.id("days");
    private By dataNascMes =  By.id("months");
    private By dataNascAno = By.id("years");
    private By logradouro = By.id("address1");
    private By complemento = By.id("address2");
    private By cidade = By.id("city");
    private By estado = By.id("id_state");
    private By cep = By.id("postcode");
    private By pais = By.id("id_country");
    private By celular = By.id("phone_mobile");
    private By enderecoSecundario = By.id("alias");
    private By btnRegistrarUsuario = By.id("submitAccount");

    public void cadastrarNovoUsuario (String email){
        getDriver().findElement(novoEmail).sendKeys(email);
        getDriver().findElement(btnCriarConta).click();
    }

    public void dadosCadastraisUsuario(){
        getWait().until(ExpectedConditions.elementToBeClickable(genero)).click();
        getDriver().findElement(primeiroNome).sendKeys("Apoena");
        getDriver().findElement(ultimoNome).sendKeys("Gebur");
        getDriver().findElement(senha).sendKeys("12345");
        getDriver().findElement(dataNascDia).sendKeys("24");
        getDriver().findElement(dataNascMes).sendKeys("Julho");
        getDriver().findElement(dataNascAno).sendKeys("1994");
    }

    public void dadosEnderecoUsuario(){
        getDriver().findElement(logradouro).sendKeys("Athur Bernardes");
        getDriver().findElement(complemento).sendKeys("Casa");
        getDriver().findElement(cidade).sendKeys("Agua Verde");
        getDriver().findElement(estado).sendKeys("California");
        getDriver().findElement(cep).sendKeys("00000");
        getDriver().findElement(pais).sendKeys("United States");
        getDriver().findElement(celular).sendKeys("98989898");
        getDriver().findElement(enderecoSecundario).clear();
        getDriver().findElement(enderecoSecundario).sendKeys("Teste");
        getDriver().findElement(btnRegistrarUsuario).click();
    }
}
