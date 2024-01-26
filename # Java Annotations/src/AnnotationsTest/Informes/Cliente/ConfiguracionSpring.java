package AnnotationsTest.Informes.Cliente;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
// Clase de configuración de Spring que define los beans y sus dependencias

public class ConfiguracionSpring {

    // Definir el primer bean de ServicioMensaje con la implementación 1
    @Bean
    @Primary
    public ServicioMensaje mensajeServicio1() {
        return new ServicioMensajeImplementacion1();
    }

    // Definir el segundo bean de ServicioMensaje con la implementación 2
    @Bean
    public ServicioMensaje mensajeServicio2() {
        return new ServicioMensajeImplementacion2();
    }

    // Definir el bean de UsoServicio con la implementación 1 y calificarlo como "usoServicio1"
    @Bean
    @Qualifier("usoServicio1")
    public UsoServicio usoServicio1(@Qualifier("mensajeServicio1") ServicioMensaje servicioMensaje) {
        return new UsoServicio(servicioMensaje);
    }

    // Definir el bean de UsoServicio con la implementación 2 y calificarlo como "usoServicio2"
    @Bean
    @Qualifier("usoServicio2")
    public UsoServicio usoServicio2(@Qualifier("mensajeServicio2") ServicioMensaje servicioMensaje) {
        return new UsoServicio(servicioMensaje);
    }
}