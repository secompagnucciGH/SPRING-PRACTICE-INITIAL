package packageAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class usoAnotaciones {

        public static void main(String[] args) {

            // XML DE CONFIGURACIÓN
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:src/aplicationContext.xml");
            // PEDIR BEAN AL CONTENEDOR
            Empleados empleado1 = context.getBean("Comercial", Empleados.class);
            // USO DEL BEAN
            System.out.println(empleado1.getTareas());
            System.out.println(empleado1.getInformes());
            // CERRAR CONTEXTO
            context.close();

        }
}
