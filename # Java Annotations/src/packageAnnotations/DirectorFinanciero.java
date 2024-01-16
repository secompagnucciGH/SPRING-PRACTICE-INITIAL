package packageAnnotations;

public class DirectorFinanciero implements Empleados{

    private CreaciónInformesFinancieros InformeFinanciero;
    // variable CreacionInformesfINANCIEROs... donde se guarda la inyección

    public DirectorFinanciero(CreaciónInformesFinancieros informeFinanciero) {
        InformeFinanciero = informeFinanciero;
        // inyección de dependencia, trae desde CreacionInforme el informeFinanciero y lo guarda en la var creada.
    }

    @Override
    public String getTareas() {
        return "TAREAS DE DIRECTOR FINANCIERO";
    }

    @Override
    public String getInformes() {
        return InformeFinanciero.getInformeFinanciero();
    }


}
