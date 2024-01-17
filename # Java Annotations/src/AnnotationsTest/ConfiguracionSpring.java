package AnnotationsTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("AnnotationsTest")
public class ConfiguracionSpring {

    @Bean
    public CreadorDeInformes informeFinanciero() {
        return new InformeFinanciero();
    }

    @Bean
    public Informante informante(CreadorDeInformes informe) {
        return new Informante(informe);
    }
}
