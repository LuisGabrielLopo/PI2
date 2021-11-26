/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persitencia;
import modelos.interfaces.ICartaoDao;
import modelos.entidades.Cartao;
import java.util.ArrayList;
//Bibliotecas para manipulação de arquivo texto no disco
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
/**
 *
 * @author luisg
 */
public class CartaoDao implements ICartaoDao{
    
    private String nomeDoArquivoDeDadosNoDisco = "";
    public CartaoDao(String nomeDoArquivoDeDadosNoDisco){
        this.nomeDoArquivoDeDadosNoDisco = nomeDoArquivoDeDadosNoDisco;
    }

    @Override
    public void incluir(Cartao objeto) throws Exception {
        try {
            FileWriter fw = new FileWriter(nomeDoArquivoDeDadosNoDisco, true);
            //Criar o Buffer
            BufferedWriter bw = new BufferedWriter(fw);
            //Escrevendo no arquivo
            bw.write(objeto.toString() + "\n");
            //fechando o arquivo
            bw.close();
            
        } catch (Exception erro){
            throw erro;
        }
    }

    @Override
    public void alterar(Cartao objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagarPorNome(String nomeDoCartao) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cartao consultarPorNome(String nomeDoCartao) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cartao> listagem() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
