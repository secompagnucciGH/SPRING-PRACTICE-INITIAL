package packageAnnotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration // para decirle que va a ser el archivo de configuración
@ComponentScan("packageAnnotations") // de donde va a
public class empleadosConfig {
}
