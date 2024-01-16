package packageAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // para decirle que va a ser el archivo de configuración
@ComponentScan("packageAnnotations") // de donde va a
public class empleadosConfig {

    // DEFINICION DEL BEAN INFORMEFINANCIEROCOMPRAS

    @Bean
    public CreaciónInformesFinancieros informeFinancieroCompras() {
        return new informeFinancieroCompras();
    }

    // DEFINIR EL BEAN PARA DIRECTOR FINANCIERO E INYECTAR DEPENDENCIAS

    @Bean
    public Empleados directorFinanciero() {
        return new DirectorFinanciero(informeFinancieroCompras());
    }

}
