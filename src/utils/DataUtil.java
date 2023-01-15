package src.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
// Essa class só contem metodos.
public class DataUtil {

    // Devolve data e hora
    public static String converterDateParaDataEHora(Date data) {
        // sever para formatar.
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY  HH:mm");
        // Vai receber a data e vai transfor na forma que quero.
        return formatador.format(data);
    }

    // Só data
    public static String converterDateParaData(Date data) {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY");
        return formatador.format(data);
    }

    // Só hora
    public static String converterDateParaHora(Date data) {
        SimpleDateFormat formatador = new SimpleDateFormat("HH:mm:ss");
        return formatador.format(data);
    }
}
