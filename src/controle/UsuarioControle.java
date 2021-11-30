/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;
import java.util.ArrayList;
import modelos.entidades.Usuarios;
import modelos.interfaces.iUsuarioDao;
import persitencia.UsuarioDao;
/**
 *
 * @author luisg
 */
public class UsuarioControle implements iUsuarioDao{
    UsuarioDao objUsuarioDao = new UsuarioDao("./ArquivosDeDados/Usuarios.txt");

    @Override
    public void incluir(Usuarios objeto) throws Exception {
         try {
            Usuarios aux = objUsuarioDao.consultarPorCPF(objeto.getCpf());
            if(aux == null){
                objUsuarioDao.incluir(objeto);
            }else{
                throw new Exception("Este CPF já está cadastrado");
            }
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public ArrayList<Usuarios> listagem() throws Exception {
       return objUsuarioDao.listagem();
    }

    @Override
    public Usuarios consultarPorCPF(int CPF) throws Exception {
      return objUsuarioDao.consultarPorCPF(CPF);
    }

    @Override
    public void alterar(Usuarios objeto) throws Exception {
        try {
             Usuarios aux = objUsuarioDao.consultarPorCPF(objeto.getCpf());
            if (aux == null) {
                objUsuarioDao.incluir(objeto); 
            }
        } catch (Exception erro) {
            throw erro; 
        }
        objUsuarioDao.alterar(objeto);
    }
}
