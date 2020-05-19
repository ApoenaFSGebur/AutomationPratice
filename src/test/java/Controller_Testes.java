import org.junit.Test;

public class Controller_Testes extends BaseTest {

    private Index index = new Index();
    private Confirmation confirmation = new Confirmation();
    private Authentication authentication = new Authentication();
    private AdressConfirmation confirmAdress = new AdressConfirmation();
    private Terms terms = new Terms();
    private Payment payment = new Payment();
    private OrderSummary confirmOrder = new OrderSummary();

    @Test
    public void testRealizarCompra() throws InterruptedException {
        String produto = "blouse";
        index.acessarAplicação();
        index.buscaProduto(produto);
        index.selecionarProduto();
        Thread.sleep(3000);
        confirmation.checkout("blouse");
        authentication.cadastrarNovoUsuario("testeapoenateste@gfttessste.com");
        authentication.dadosCadastraisUsuario();
        authentication.dadosEnderecoUsuario();
        confirmAdress.confirmarEnderecoEntrega();
        terms.aceiteTermos();
        payment.tipoPagto("blouse");
        confirmOrder.confirmarCompra();
    }
}