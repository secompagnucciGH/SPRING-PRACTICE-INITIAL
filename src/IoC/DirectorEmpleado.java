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

    // METODO INIT /( Ejecutar tareas antes de que el bean esté disponible

    public void metodoInit() {
        System.out.println(" ** Tareas antes de que el bean esté listo.");
    }

    // METODO DESTROY /( Ejecutar tareas luego de que el bean se haya utilizado

    public void metodoDestroy() {
        System.out.println(" ** Tareas luego de utilizar el bean.");
    }

}

