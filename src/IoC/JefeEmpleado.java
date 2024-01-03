package IoC;

public class JefeEmpleado implements Empleados{

    // campo creacion informe (interfaz)

    private creacionInformes informeNuevo;

    public JefeEmpleado(creacionInformes informeNuevo) {
        this.informeNuevo = informeNuevo;
    }

    public String getTareas () {
       return "Tengo tareas de Jefe.";
   }

    @Override
    public String getInforme() {
        return "informe creado por el Jefe " + informeNuevo.getInformes();
    }

}
