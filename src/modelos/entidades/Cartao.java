/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.entidades;

import java.util.Date;

/**
 *
 * @author luisg
 */
import java.text.SimpleDateFormat;
public class Cartao {
    private String nomeDoCartao = "";
    private String numeroDoCartao = "";
    private String nomeDoTitular = "";
    private String CCV = "";
    private double limiteDoCartao = 0.00;
    private Date dataDeVencimento;
    private Date dataDeFechamento ;
    private static final String formatoDeDataFechamento = "dd/MM";
    private static final String formatoDeVencimentoDoCartao = "MM/yy";
    private SimpleDateFormat formatadorDeVencimento = new SimpleDateFormat(formatoDeVencimentoDoCartao);
    private SimpleDateFormat formatadorDeFechamento = new SimpleDateFormat(formatoDeDataFechamento);
     

    public Cartao() {
    }
   

    public String getNomeDoCartao() {
        return nomeDoCartao;
    }

    public void setNomeDoCartao(String nomeDoCartao) {
        this.nomeDoCartao = nomeDoCartao;
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeNoCartao) {
        this.nomeDoTitular = nomeNoCartao;
    }

    public String getCCV() {
        return CCV;
    }

    public void setCCV(String CCV) {
        this.CCV = CCV;
    }

    public double getLimiteDoCartao() {
        return limiteDoCartao;
    }

    public void setLimiteDoCartao(double limiteDoCartao) {
        this.limiteDoCartao = limiteDoCartao;
    }

    public Date getDataDeFechamento() {
        return dataDeFechamento;
    }

    public void setDataDeFechamento( String dataDeFechamento) {
        try {
            this.dataDeFechamento = formatadorDeFechamento.parse(dataDeFechamento);
            
        } catch (Exception e) {
        }
    }

    public Date getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento( String dataDeVencimento) {
        try {
             this.dataDeVencimento = formatadorDeVencimento.parse(dataDeVencimento);
        } catch (Exception e) {
        }
    }
    
    @Override
    public String toString() {
        return  "Dados do Cartão : \n" + " NomeDoCartao = " + nomeDoCartao + "\n " +
                "Número Do Cartao = " + numeroDoCartao + "\n " + 
                "Nome do Titular = " + nomeDoTitular + "\n " + 
                "CCV = " + CCV + "\n "+
                "Limite Do Cartao = " + limiteDoCartao + "\n" +
                "Data de Vencimento do Cartão = " + formatadorDeVencimento.format(dataDeVencimento) +  "\n" +
                "Data de Fechamento = " + formatadorDeFechamento.format(dataDeFechamento);
    }
   

  
     
    
    
    
}
