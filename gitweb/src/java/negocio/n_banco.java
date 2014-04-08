
package negocio;
import entidad.*;
public class n_banco {
        // atributos
           int saldo;       
           int transacciones;
           String usuario;
           int codigo;
           String codigo_us;
           String error;
           String val;

           
        // llamar a una clase
           banco bn=new banco(); 
           usuario us=new usuario();

           
           //constructor
           public n_banco(){
           saldo =0;
           transacciones=0;
           codigo=0;
           usuario="";
           error="";
           val="";
           }
           public void setBanco(banco ocus){
             bn=ocus;
           }
           public banco getBanco(){
             return bn;
           }
           public void setUsuario(usuario usu){
               us=usu;

           }
           public usuario getUsuario(){
               return us;
           }
          

           public void obtenerUsuario(){
            usuario=us.getNombre().replace(" ", "") +us.getApe_pat();

            try {
                 codigo=Integer.parseInt(us.getDni());
                 codigo_us="08"+codigo+"2";
                 
                 us.setUsuario(usuario);
                 us.setCodigo(codigo_us);
                 val="0";
                 
                }
            catch(Exception e){
                 error="el Dni ingresado no son los caracteres corectos";
                 val="1";
                 }
            }  

           
           
               //metodo1
            public void deposita(){
            saldo=saldo+bn.getDeposito();
            transacciones++;
        }
              //metodo2
            public void girar(){
            saldo=saldo-bn.getGiro();
            transacciones++;

        }
        //metodo3
            public void obtenerSaldo(){
            bn.setSaldo(saldo);
        }
        //metodo4
           public void obtenerTransacciones(){
            bn.setTrans(transacciones);
        }
            public String error(){
               return error;

           }
           public String val(){
               return val;
            }
}
