package AnnotationsTest;

public class Informante {

    private CreadorDeInformes informe;

    public Informante(CreadorDeInformes informe) {
        this.informe = informe;
    }
    // aca tomo datos de CreadorInforme y puedo acceder a las implementaciones

    public String getTareas() {
        return "Realizar tareas financieras" + informe.getTareas();
    }

    public String getInformes() {
        return "Informe: " + informe.getInforme();
    }
}
