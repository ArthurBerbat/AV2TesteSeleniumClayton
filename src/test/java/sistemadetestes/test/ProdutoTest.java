package sistemadetestes.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import sistemadetestes.pageObject.ProdutoPO;

public class ProdutoTest extends BaseTest {

    private ProdutoPO produtoPO;

    @Before
    public void setUp() {
        produtoPO = new ProdutoPO(driver);
    }

    @Test
    public void deveExibirMensagemTodosCamposObrigatoriosAoSalvarSemPreencher() {
        produtoPO.clicarSalvar();
        String mensagem = produtoPO.obterMensagem();
        assertEquals("Todos os campos são obrigatórios para o cadastro!", mensagem);
    }

    @Test
    public void deveSalvarProdutoComSucesso() {
        produtoPO.preencherCampos("001", "Produto Teste", "10.00", "5", "01/01/2025");
        produtoPO.clicarSalvar();
        String mensagem = produtoPO.obterMensagem();
        assertTrue(mensagem.isEmpty()); // Supondo que nenhuma mensagem seja exibida em caso de sucesso
    }

    @Test
    public void deveExibirCalendarioAoClicarNoIconeDeCalendario() {
        produtoPO.clicarIconeCalendario();
        boolean calendarioExibido = driver.findElement(By.className("ui-datepicker-calendar")).isDisplayed();
        assertTrue(calendarioExibido);
    }
}
