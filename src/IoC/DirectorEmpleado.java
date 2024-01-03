package IoC;

public class DirectorEmpleado implements Empleados {

// campo creacion informe (interfaz)

    private creacionInformes informeNuevo;

// constructor que inyecta la dependencia
    public DirectorEmpleado(creacionInformes informeNuevo) {
        this.informeNuevo = informeNuevo;
    }

    public String getTareas() {
        return "Tengo tareas de director.";
    }

    @Override
    public String getInforme() {
        return "informe creado por el Director " + informeNuevo.getInformes();
    }
}
