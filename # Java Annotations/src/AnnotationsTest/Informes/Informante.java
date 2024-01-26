package AnnotationsTest.Informes;

public class Informante {

    private CreadorDeInformes informe;

    public Informante(CreadorDeInformes informe) {
        this.informe = informe;
    }
    // aca tomo datos de CreadorInforme y puedo acceder a las implementaciones de la interfaz


    // uso de las implementaciones de la interfaz

    public String getInformes() {
        return "Informe: " + informe.getInforme();
    }

    public String getTareas() {
        return "Realizar tareas financieras" + informe.getTareas();
    }

    public String validarDatos() {
        return "DATOS VALIDADOS";

    }
}
