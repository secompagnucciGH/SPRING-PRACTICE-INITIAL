package packageAnnotations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Comercial")
public class Comercial implements Empleados {

    @Override
    public String getTareas() {

        return "TAREAS: COMERCIAL";
    }

    public String getInformes() {
        return nuevoInforme.getInformeFinanciero();
        // aca nuevoInforme, hace el getInforme y lo devuelve automatico.
    }

    private InformesFinancieros nuevoInforme;
    // dato de tipo informeFinanciero NUEVO INFORME, aca guarda la informacion que buscó en segundo plano.

    @Autowired
    // con el autowired Spring busca que clase implementa InformesFinancieros, en este caso, seria IF1.
    public Comercial(InformesFinancieros nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }

}
