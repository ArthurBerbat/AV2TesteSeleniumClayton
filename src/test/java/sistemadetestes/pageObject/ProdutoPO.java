package sistemadetestes.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProdutoPO extends BasePO {

    @FindBy(id = "codigo")
    public WebElement inputCodigo;

    @FindBy(id = "nome")
    public WebElement inputNome;

    @FindBy(id = "preco")
    public WebElement inputPreco;

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
     * @param preco Preço do produto
     * @param dataValidade Data de validade do produto
     * */
    public void preencherCampos(String codigo, String nome, String preco, String dataValidade) {
        inputCodigo.clear();
        inputCodigo.sendKeys(codigo);
        inputNome.clear();
        inputNome.sendKeys(nome);
        inputPreco.clear();
        inputPreco.sendKeys(preco);
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
