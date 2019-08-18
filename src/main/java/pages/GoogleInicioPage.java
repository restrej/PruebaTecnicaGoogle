package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.Keys;

import java.util.List;

@DefaultUrl("https://www.google.com.co")
public class GoogleInicioPage extends PageObject {

    @FindBy(xpath = ".//input[@name='q']")
    private WebElementFacade txtBuscar;

    @FindBy(xpath = ".//*[@id='fprsl']")
    private WebElementFacade txtPalabraCorrecta;

    @FindBy(xpath = ".//*[@class='srg']//*[@class='r']//h3")
    List<WebElementFacade> resultadosList;


    public void insertarPalabra() {
        txtBuscar.sendKeys("pruebaz");
        txtBuscar.sendKeys(Keys.ENTER);
    }

    public void validarPalabraCorrecta() {
        MatcherAssert.assertThat(txtPalabraCorrecta.getText(), Is.is(Matchers.equalTo("pruebas")));
        waitFor(txtPalabraCorrecta);
        txtPalabraCorrecta.click();
    }

    public void validarCantidadResultadosList() {
        List<WebElementFacade> lsresultados = resultadosList;
        int cantidadResult = lsresultados.size();
        if (cantidadResult > 6) {
            System.out.println("la cantidad de resultados de busqueda es mayor a 6." + cantidadResult);
        }
    }
}