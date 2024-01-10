package packageAnnotations;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("Comercial")

public class Comercial implements Empleados, InitializingBean, DisposableBean {

    // POSTdestroy Y PREinit
    // Ejecucion de codigo despues de la creación del bean

    @Override
    public void afterPropertiesSet(){
        System.out.println("** EJECUTADO ANTES DE LA CREACIÓN DEL BEAN");
        // Coloca aquí el código que deseas ejecutar después de la creación del bean.
    }

    // POSTdestroy Y PREinit
    // Ejecucion de codigo despues de la destrucción del bean

    public void destroy() {
        System.out.println("** EJECUTADO TRAS LA DESTRUCCIÓN DEL BEAN");
        // Coloca aquí el código que deseas ejecutar antes de la destrucción del bean.
    }

    @Autowired
    @Qualifier("informeFinanciero2") // bean ID que debe utilizar.
    private InformesFinancieros nuevoInforme;
    // dato de tipo informeFinanciero NUEVO INFORME, aca guarda la informacion que buscó en segundo plano.

    @Override
    public String getTareas() {

        return "TAREAS: COMERCIAL";
    }

    public String getInformes() {
        return nuevoInforme.getInformeFinanciero();
        // aca nuevoInforme, hace el getInforme y lo devuelve automatico.
    }

//   INYECCION DE DEPENDENCIA CON SETTER

//    @Autowired
//    public void setNuevoInforme(InformesFinancieros nuevoInforme) {
//        this.nuevoInforme = nuevoInforme;
//    }

// INYECCION DE DEPENDENCIA CON CONSTRUCTOR
// Contructor con el autowired Spring busca que clase implementa InformesFinancieros, en este caso, seria IF1.

//    @Autowired
//    public Comercial(InformesFinancieros nuevoInforme) {
//        this.nuevoInforme = nuevoInforme;
//    }

}
