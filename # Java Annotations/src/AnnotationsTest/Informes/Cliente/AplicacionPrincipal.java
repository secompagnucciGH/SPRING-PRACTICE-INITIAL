package AnnotationsTest.Informes.Cliente;
// AplicacionPrincipal.java

// Clase principal que contiene el método main para ejecutar la aplicación
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AplicacionPrincipal {

    public static void main(String[] args) {
        // Configurar el contexto de Spring
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfiguracionSpring.class);

        // Obtener el bean de UsoServicio con la implementación 1 desde el contenedor de Spring
        UsoServicio usoServicio1 = context.getBean("usoServicio1", UsoServicio.class);

        // Utilizar el cliente para mostrar el mensaje y la implementación #1
        usoServicio1.MostrarMensaje2();

        // Obtener el bean de UsoServicio con la implementación 2 desde el contenedor de Spring
        UsoServicio usoServicio2 = context.getBean("usoServicio2", UsoServicio.class);

        // Utilizar el cliente para mostrar el mensaje y la implementación #2
        usoServicio2.MostrarMensaje2();

        // Cerrar el contexto de Spring
        context.close();
    }
}