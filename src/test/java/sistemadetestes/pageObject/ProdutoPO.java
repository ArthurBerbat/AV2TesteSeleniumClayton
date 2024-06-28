package sistemadetestes.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProdutoPO extends BasePO {

    @FindBy(id = "codigo")
    public WebElement inputCodigo;

    @FindBy(id = "nome")
    public WebElement inputNome;

    @FindBy(id = "valor")
    public WebElement inputValor;

    @FindBy(id = "quantidade")
    public WebElement inputQuantidade;

    @FindBy(id = "dataValidade")
    public WebElement inputDataValidade;

    @FindBy(id = "btn-salvar")
    public WebElement buttonSalvar;

    @FindBy(css = "div.alert>span")
    public WebElement spanMensagem;

    @FindBy(css = "input#dataValidade + .calendar-icon")
    public WebElement calendarIcon;

    /**
     * Construtor padrão para criação de uma nova instância da página de produtos
     * @param driver Driver da página de produtos
     * */
    public ProdutoPO(WebDriver driver) {
        super(driver);
    }

    /**
     * Método para obter a mensagem exibida
     * @return Texto da mensagem exibida
     * */
    public String obterMensagem() {
        return this.spanMensagem.getText();
    }

    /**
     * Método para preencher os campos do produto
     * @param codigo Código do produto
     * @param nome Nome do produto
     * @param valor Valor do produto
     * @param quantidade Quantidade do produto
     * @param dataValidade Data de validade do produto
     * */
    public void preencherCampos(String codigo, String nome, String valor, String quantidade, String dataValidade) {
        inputCodigo.clear();
        inputCodigo.sendKeys(codigo);
        inputNome.clear();
        inputNome.sendKeys(nome);
        inputValor.clear();
        inputValor.sendKeys(valor);
        inputQuantidade.clear();
        inputQuantidade.sendKeys(quantidade);
        inputDataValidade.clear();
        inputDataValidade.sendKeys(dataValidade);
    }

    /**
     * Método para clicar no botão salvar
     * */
    public void clicarSalvar() {
        buttonSalvar.click();
    }

    /**
     * Método para clicar no ícone de calendário
     * */
    public void clicarIconeCalendario() {
        calendarIcon.click();
    }
}
