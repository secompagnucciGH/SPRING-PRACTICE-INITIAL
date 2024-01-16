package packageAnnotations;

public class informeFinancieroCompras implements CreaciónInformesFinancieros {
    @Override
    public String getInformeFinanciero() {
        return "Informe Financiero COMPRAS";
        // usa la interfaz para usar el metodo y hace el return de lo que se especifique acá.
    }
}
