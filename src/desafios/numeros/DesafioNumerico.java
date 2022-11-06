package desafios.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class DesafioNumerico {

    public void exibirValor(Double valor) throws ParseException {
        BigDecimal bigDecimal = new BigDecimal(valor);
        bigDecimal = bigDecimal.multiply(new BigDecimal(0.1));
        DecimalFormat decimalFormat = new DecimalFormat("R$ #,##0.00");
        System.out.println("10%: " + decimalFormat.format(bigDecimal));
    }
}
