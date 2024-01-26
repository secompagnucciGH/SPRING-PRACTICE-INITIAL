package AnnotationsTest.Informes;

public class InformeFinanciero implements CreadorDeInformes {

    // clase que implementa la interfaz y describe metodos generales

    @Override
    public String getInforme() {
        return "Informe financiero de compras";
    }

    @Override
    public String getTareas() {
        return "TAREAS DE COMPRAS";
    }

    @Override
    public String validarDatos() {
        return "DATOS VALIDADOS";
    }

}