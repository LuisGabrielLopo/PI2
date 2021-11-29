/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;
import java.util.ArrayList;
import modelos.entidades.Cartoes;
import modelos.interfaces.ICartaoDao;
import persitencia.CartaoDao;

/**
 *
 * @author luisg
 */
public class CartaoControle implements ICartaoDao {
    CartaoDao objCartaoDao = new CartaoDao("./ArquivosDeDados/Cartao.txt");

    @Override
    public void incluir(Cartoes objeto) throws Exception {
        try {
            Cartoes aux = objCartaoDao.consultarPorId(objeto.getId());
            if(aux == null){
                objCartaoDao.incluir(objeto);
            }else{
                throw new Exception("Este ID de cartão já existe");
            }
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void alterar(Cartoes objeto) throws Exception {
        try {
            Cartoes aux = objCartaoDao.consultarPorId(objeto.getId());
            if (aux == null) {
                objCartaoDao.incluir(objeto); 
            }
            
        } catch (Exception erro) {
            throw erro;
        }
        objCartaoDao.alterar(objeto);
    }

    @Override
    public void apagarPorId(int id) throws Exception {
      objCartaoDao.apagarPorId(id);
    }

    @Override
    public Cartoes consultarPorId(int id) throws Exception {
        return objCartaoDao.consultarPorId(id);
    }

    @Override
    public ArrayList<Cartoes> listagem() throws Exception {
       return objCartaoDao.listagem();
    }
    
}
