package IoC;

public class SecretarioEmpleado implements Empleados {
    /**
     * @return
     */
    @Override
    public String getTareas() {

        return "Tengo tareas de Secretario.";
    }

    @Override
    public String getInforme() {
        return "informe creado por el Secretario " + informeNuevo.getInformes();
    }

    // CREACION DE CAMPOS
    private creacionInformes informeNuevo;

    private String email;
    private String nombreEmpresa;


    // SETTERS & GETTERS
    public void setInformeNuevo(creacionInformes informeNuevo) {
        this.informeNuevo = informeNuevo;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
