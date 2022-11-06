package desafios.datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalculadoraGravidez {
    private Date dataUltimoPeriodoMenstrual;

    public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual) {
        this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
    }

    private Calendar converterDateParaCalendar(Date data) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(data);
        return calendar;
    }

    public Date calcularDataEstimadaConcepcao() {
        Calendar c = this.converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
        c.add(Calendar.WEEK_OF_YEAR, 2);
        return c.getTime();
    }

    public Date calcularDataEstimadaParto() {
        // implementar cálculo de data estimada para parto
        // 40 semanas após a data do último período menstrual
        Calendar c = this.converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
        c.add(Calendar.WEEK_OF_YEAR, 40);
        return c.getTime();
    }

    public Date converterEmData(String dateString) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        return dateFormat.parse(dateString);
    }
}
