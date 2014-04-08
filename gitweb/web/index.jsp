<%@ page import="negocio.*,entidad.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    int deposito1=100;
    int deposito2=500;
    int giro=200;

 String nombre="jhan Arly";
String Ap_paterno="sanchez";
String Ap_materno="tarrillo";
String dni="73472336";
String usuario="";
String codigo="";
String val="";
String error="";

banco ban=new banco();
usuario us=new usuario();
n_banco banc =  new n_banco();


us.setNombre(nombre);
us.setApe_pat(Ap_paterno);
us.setApe_mat(Ap_materno);
us.setDni(dni);

banc.setUsuario(us);
banc.obtenerUsuario();

error=banc.error();
val=banc.val();

if(val.equals("0")){
    
    ban.setDeposito(deposito1);
    banc.setBanco(ban);
    banc.deposita();
    ban.setDeposito(deposito2);
    banc.setBanco(ban);
    banc.deposita();
    ban.setGiro(giro);
    banc.setBanco(ban);
    banc.girar();
    
    banc.obtenerSaldo();
    banc.obtenerTransacciones();
}
    int saldo=ban.getSaldo();
    int transacciones=ban.getTrans();

    usuario=us.getUsuario();
codigo=us.getCodigo();



%>




<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
                
        
        <h1>se realizo  <%=transacciones%> transacciones, y el saldo es:<%=saldo%> </h1>
        
        <br>
        El usuario que realizo esta transaccion fue:<%=usuario%>
        <br>
        el codigo del usuario es:<%=codigo%>
        
    </body>
  </html>
