package packageAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class usoAnotaciones2 {

    public static void main(String[] args) {

        // XML DE CONFIGURACIÓN
        // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:src/aplicationContext.xml");

        // LEER EL CLASS DE CONFIGURACIÓN (AHORA EN EL .JAVA)
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(empleadosConfig.class);

        // PEDIR BEAN

        Empleados empleado = context.getBean("directorFinanciero", Empleados.class);
        System.out.println(empleado.getTareas());
        System.out.println(empleado.getInformes());

        // BEAN PARA EL USO DE PropertySource

        DirectorFinanciero empleado2 = context.getBean("directorFinanciero", DirectorFinanciero.class);

        System.out.println("EMAIL DEL DIRECTOR: " + empleado2.getEmail());

        System.out.println("NOMBRE DE LA EMPRESA" + empleado2.getNombreEmpresa());



//        // PEDIR BEAN AL CONTENEDOR
//        Empleados empleado1 = context.getBean("Comercial", Empleados.class);
//        Empleados empleado2 = context.getBean("Comercial", Empleados.class);
//
//        // ver donde apuntan a la memoria
//        System.out.println(empleado2);
//        System.out.println(empleado1);
//
//        // USO DEL BEAN
//        System.out.println(empleado1.getTareas());
//        System.out.println(empleado1.getInformes());
//
    // CERRAR CONTEXTO
        context.close();

    }
}
