package IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class usoSingletonPrototype {
    public static void main(String[] args) {

    // Crear un contexto de aplicación utilizando el archivo XML de configuración
    ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("file:src/aplicationContext2.xml");


    // peticion de beans al contenedor Spring Singleton

    SecretarioEmpleado Secretario1 = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
    SecretarioEmpleado Secretario2 = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
    SecretarioEmpleado Secretario3 = contexto.getBean("miSecretarioEmpleadoP", SecretarioEmpleado.class);
    SecretarioEmpleado Secretario4 = contexto.getBean("miSecretarioEmpleadoP", SecretarioEmpleado.class);

    // muestra la dirección de la memoria (donde apunta)
    System.out.println("1 "+Secretario1);
    System.out.println("2 "+Secretario2);
        System.out.println("3 "+Secretario3);
        System.out.println("4 "+Secretario4);

        if (Secretario1==Secretario2) System.out.println("apuntan al mismo objeto");
        else System.out.println("no apuntan al mismo objeto.");

        if (Secretario3==Secretario4) System.out.println("apuntan al mismo objeto");
        else System.out.println("no apuntan al mismo objeto.");

    }
}