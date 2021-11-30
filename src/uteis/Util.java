
package uteis;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    private static final String formatoDeDataFechamento = "dd/MM";
    private static final String formatoDeVencimentoDoCartao = "MM/yy";
    private static SimpleDateFormat formatadorDeVencimento = new SimpleDateFormat(formatoDeVencimentoDoCartao);
    private static SimpleDateFormat formatadorDeFechamento = new SimpleDateFormat(formatoDeDataFechamento);
    
    
    public static Date formatoDeDataVencimento (String data) throws ParseException{  
        return formatadorDeVencimento.parse(data);
    }
    public static Date formatoDeDataFechamentoEPagamento (String data) throws ParseException{
        return formatadorDeFechamento.parse(data);
    }
    public static String conversorDeDateParaStringDataDeVencimento (Date datas) {
        return formatadorDeVencimento.format(datas);
    }
    public static String conversorDeDateParaStringDataDeFechamentoEVencimento (Date datas) {
        return formatadorDeFechamento.format(datas);
    }
   
  
}
