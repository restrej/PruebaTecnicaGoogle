package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.BuscarPalabraGoogleSteps;

public class BuscarPalabraGoogleDefinitions {

    @Steps
    BuscarPalabraGoogleSteps buscarPalabraGoogleSteps;

    @Given("^que un usuario web está en la página de inicio de google$")
    public void queUnUsuarioWebEstáEnLaPáginaDeInicioDeGoogle() throws Exception {
       buscarPalabraGoogleSteps.irAGoogleInicioPage();

    }

    @When("^él busca la palabra de pruebaz$")
    public void élBuscaLaPalabraDePruebaz() throws Exception {
        buscarPalabraGoogleSteps.buscarPalabraItem();
    }

    @Then("^validar que se cargue la palabra correcta pruebas$")
    public void validarQueSeCargueLaPalabraCorrectaPruebas() throws Exception {
        buscarPalabraGoogleSteps.validarPalabra();
    }

    @Then("^validar la cantidad de resultados sea mayor que seis$")
    public void validarQueLaCantidadDeResultadosSeaMayorQueSeis()throws Exception{
        buscarPalabraGoogleSteps.validarResultadosBusqueda();
    }
}