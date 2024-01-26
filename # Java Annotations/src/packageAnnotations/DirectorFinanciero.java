package packageAnnotations;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados{

    private CreaciónInformesFinancieros InformeFinanciero;
    @Value("${email}")
    private String email;
    @Value("${nombreEmpresa}")
    private String nombreEmpresa;

    // variable CreacionInformesfINANCIEROs... donde se guarda la inyección

    public DirectorFinanciero(CreaciónInformesFinancieros informeFinanciero) {
        InformeFinanciero = informeFinanciero;
        // inyección de dependencia, trae desde CreacionInforme el informeFinanciero y lo guarda en la var creada.
    }

    public String getEmail() {
        return email;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
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
