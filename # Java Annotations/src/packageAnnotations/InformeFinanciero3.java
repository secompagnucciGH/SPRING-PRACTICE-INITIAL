package packageAnnotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinanciero3 implements CreaciónInformesFinancieros {
    @Override
    public String getInformeFinanciero() {
        return "INFORME FINANCIERO: 3";
    }
}
