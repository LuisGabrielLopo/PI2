/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.interfaces;
import modelos.entidades.Cartao;
import java.util.ArrayList;
/**
 *
 * @author luisg
 */
public interface ICartaoDao {
        void incluir (Cartao objeto) throws Exception;
        void alterar (Cartao objeto) throws Exception;
        void apagarPorNome (String nomeDoCartao) throws Exception;
        Cartao consultarPorNome (String nomeDoCartao) throws Exception;
        ArrayList<Cartao>listagem () throws Exception;
    
}
