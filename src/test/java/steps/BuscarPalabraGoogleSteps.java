package steps;

import net.thucydides.core.annotations.Step;
import pages.GoogleInicioPage;

public class BuscarPalabraGoogleSteps {

    GoogleInicioPage googleInicioPage;

    @Step
    public void irAGoogleInicioPage() {
        googleInicioPage.open();
    }

    @Step
    public void buscarPalabraItem() {
        googleInicioPage.insertarPalabra();
    }
    @Step
    public void validarPalabra(){
        googleInicioPage.validarPalabraCorrecta();
    }
    @Step
    public void validarResultadosBusqueda(){
        googleInicioPage.validarCantidadResultadosList();
    }
}