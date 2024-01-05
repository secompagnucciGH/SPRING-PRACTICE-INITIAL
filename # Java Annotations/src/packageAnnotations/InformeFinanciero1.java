package packageAnnotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinanciero1 implements InformesFinancieros{

    @Override
    public String getInformeFinanciero() {
        return "INFORME FINANCIERO: 1";
    }
}
