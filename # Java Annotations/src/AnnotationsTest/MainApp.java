package AnnotationsTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        // Configurar el contexto de Spring
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfiguracionSpring.class);

        // Obtener bean de Informante
        Informante informante = context.getBean(Informante.class);

        // Ejecutar métodos
        System.out.println("Tareas: " + informante.getTareas());
        System.out.println("Informe: " + informante.getInformes());

        // Cerrar el contexto
        context.close();
    }
}
