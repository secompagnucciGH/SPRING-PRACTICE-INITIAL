package AnnotationsTest.Informes.Cliente;

// UsoServicio.java

// Clase que utiliza un servicio de mensaje para mostrar mensajes
public class UsoServicio {

    // Variable que almacena el servicio de mensaje recibido a través del constructor
    private ServicioMensaje mensajedelservicio;

    // Constructor que recibe un ServicioMensaje e inicializa la variable
    public UsoServicio(ServicioMensaje mensajedelservicio) {
        this.mensajedelservicio = mensajedelservicio;
    }

    // Método para mostrar el mensaje
    public void MostrarMensaje() {
        String mensaje = mensajedelservicio.obtenerMensaje();
        System.out.println(mensaje);
    }

    // Método para mostrar el mensaje utilizando el método MostrarMensaje2
    public void MostrarMensaje2() {
        String mensaje2 = mensajedelservicio.obtenerMensaje();
        System.out.println(mensaje2);
    }
}
