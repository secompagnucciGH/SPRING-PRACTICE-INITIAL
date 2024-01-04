package IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

    public static void main(String[] args) {

        // Crear un contexto de aplicación utilizando el archivo XML de configuración
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("file:src/aplicationContext.xml");

        // Crear un objeto 'Juan' que representa a un empleado que es un JefeEmpleado
        // Obtiene el bean 'miEmpleado' del contexto y usa la clase Empleados
        Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);

        // Mostrar las tareas del empleado (en este caso, el director)
        System.out.println(Juan.getTareas());

        // Mostrar informes generados por el empleado
        System.out.println(Juan.getInforme());
        System.out.println("-----------------------------------XXXXX------------------------------------------");

        // Crear un objeto 'Maria' que representa a un empleado que es un SecretarioEmpleado
        // Modificar el bean de Spring para usar el SecretarioEmpleado y obtenerlo del contexto
        SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

        // Mostrar las tareas del empleado (en este caso, el secretario)
        System.out.println(Maria.getTareas());

        // Mostrar informes generados por el empleado
        System.out.println("INFORME: ------" + Maria.getInforme());

        // Mostrar el nombre de la empresa del empleado secretario
        System.out.println("NOMBRE EMPRESA: ------" + Maria.getNombreEmpresa());

        // Mostrar el email del empleado secretario
        System.out.println("EMAIL: ------" + Maria.getEmail());

        System.out.println("-----------------------------------XXXXX------------------------------------------");

        // Cerrar el contexto de la aplicación para liberar recursos
        contexto.close();
    }
}
