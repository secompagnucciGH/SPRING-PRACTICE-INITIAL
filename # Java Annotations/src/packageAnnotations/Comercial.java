package packageAnnotations;


import org.springframework.stereotype.Component;

@Component("Comercial")
public class Comercial implements Empleados {

    @Override
    public String getTareas() {

        return "TAREAS: COMERCIAL";
    }

    public String getInformes() {
        return "INFORME: COMERCIAL";
    }
}
