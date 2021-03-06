/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persitencia;
import modelos.entidades.Usuarios;
import modelos.interfaces.iUsuarioDao;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
/**
 *
 * @author luisg
 */
public class UsuarioDao implements iUsuarioDao{
    private String nomeDoArquivoNoDisco = "";
    public UsuarioDao(String nomeDoArquivoNoDisco){
        this.nomeDoArquivoNoDisco = nomeDoArquivoNoDisco;
    }

    @Override
    public void incluir(Usuarios objeto) throws Exception {
          try {
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
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
    public ArrayList<Usuarios> listagem() throws Exception {
        try {
            ArrayList<Usuarios> arrayDosUsuarios = new ArrayList<Usuarios>();
            
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            
            
            String linha = "";
            
            while((linha = br.readLine()) != null) {
              Usuarios aux = new Usuarios();
              String vetorString[] = linha.split(";");
              aux.setCpf(Integer.parseInt(vetorString[0]));
              aux.setNome(vetorString[1]);
              aux.setSenha(vetorString[2]);
         
              
             
              arrayDosUsuarios.add(aux);
                
            }
            
            br.close();
            return arrayDosUsuarios;
        } catch (Exception erro) {
            throw erro;
            
        }
    }

    @Override
    public Usuarios consultarPorCPF(int CPF) throws Exception {
        Usuarios aux = new Usuarios();
        FileReader fr = new FileReader(nomeDoArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
        try {
              String linha = "";
            while ((linha = br.readLine()) != null) {
            String vetorString[] = linha.split(";");
            
            aux.setCpf(Integer.parseInt(vetorString[0]));
            aux.setNome(vetorString[1]);
            aux.setSenha(vetorString[2]);
            
            if(aux.getCpf()== CPF){
                return aux ;
            }
        }
          aux = null;
          return aux;
        } catch (Exception erro) {
            throw erro;
        } finally{
            br.close();
        }
     }

    @Override
    public void alterar(Usuarios objeto) throws Exception {
       ArrayList<Usuarios> arrayDosUsuarios = listagem();
       FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
       BufferedWriter bw = new BufferedWriter(fw);
        try {
             //Excluir
            for (int pos = 0; pos < arrayDosUsuarios.size(); pos++ ){
                if(objeto.getCpf()!= arrayDosUsuarios.get(pos).getCpf()){
                    bw.write(arrayDosUsuarios.get(pos).toString() + "\n");
                }
            }
            bw.write(objeto.toString() + "\n");
            
            //fecha o arquivo
            bw.close();
            
        } catch (Exception erro) {
            throw erro;
        }
       
    }
    
    
    
}
