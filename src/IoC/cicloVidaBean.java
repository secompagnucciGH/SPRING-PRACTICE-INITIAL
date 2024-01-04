package IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class cicloVidaBean {

    public static void main(String[] args) {

        // XML de configuracion

        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("file:src/aplicationContext3.xml");

        // obtencion del bean

        Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
        System.out.println(Juan.getInforme());

        // cerrar contexto

        contexto.close();
    }

}
