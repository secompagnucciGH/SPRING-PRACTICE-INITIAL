package packageAnnotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinanciero2 implements CreaciónInformesFinancieros {

    @Override
    public String getInformeFinanciero() {
        return "INFORME FINANCIERO: 2";
    }
}
