/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;
import entidad.*;

public class n_bodega {
    
    usuario us=new usuario();
    
    String usuario;
    String codigo;
    String pswd;
    
    public n_bodega(){
    usuario="";
    codigo="";
    pswd="";
    }
    
    public void setUsuario(usuario u){
        us=u;
    }
    public usuario getUsuario(){
        return us;
    }
    
    public void generar_usuario(){
        usuario=us.getApe_pat()+""+us.getNombre();
        codigo="AD"+us.getCodigo()+"SD";
        pswd="*****";
        
        us.setUsuario(usuario);
        us.setCodigo(codigo);
        us.setPsswd(pswd);
    }
    
}
