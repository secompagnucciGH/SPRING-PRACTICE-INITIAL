package IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

    public static void main (String[] args) {

//        Empleados Empleado1 = new DirectorEmpleado();
//
//        System.out.println(Empleado1.getTareas());

        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("file:src/aplicationContext.xml");

        // EMPLEADO PARA EL CONSTRUCTOR CON DEPENDENCIA jefe y director.
        // llama al bean miEmpleado, usa la clase Empleados
        Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);

        // muestra las tareas de el director
        System.out.println(Juan.getTareas());

        // muestra informes
        System.out.println(Juan.getInforme());
        System.out.println("-----------------------------------XXXXX------------------------------------------");


        // EMPLEADO PARA EL SETTER, SECRETARIO
        // se modifica el bean, ahora no es miEmpleado, ahora es miEmpleadoSecretario
        SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

        // muestra las tareas de el director
        System.out.println(Maria.getTareas());

        // muestra informes

        System.out.println("INFORME: ------" + Maria.getInforme());

        System.out.println("NOMBRE EMPRESA: ------" + Maria.getNombreEmpresa());

        System.out.println("EMAIL: ------" + Maria.getEmail());

        System.out.println("-----------------------------------XXXXX------------------------------------------");


        contexto.close();
    }
}
