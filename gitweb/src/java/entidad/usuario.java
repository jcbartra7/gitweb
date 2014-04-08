/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidad;

/**
 *
 * @author Jc Bartra
 */
public class usuario {
    
    String id_usuario;
    String nombre;
    String ape_pat;
    String ape_mat;
    String dni;
    String usuario;
    String codigo;
    String psswd;
    
    public usuario()
    {
    id_usuario="x";
    nombre="x";
    ape_pat="x";
    ape_mat="x";
    dni="x";
    psswd="x";
    }
    
    public void setId_usuario(String id_usuario)
    {
        this.id_usuario=id_usuario;
    }
    public String getId_usuario()
    {
        return id_usuario;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public String getNombre()
    {
        return nombre;
    }
    
    public void setApe_pat(String ape_pat)
    {
        this.ape_pat=ape_pat;
    }
    public String getApe_pat()
    {
        return ape_pat;
    }
    
    public void setApe_mat(String ape_mat)
    {
        this.ape_mat=ape_mat;
    }
    public String getApe_mat()
    {
        return ape_mat;
    }
    
    public void setDni(String dni)
    {
        this.dni=dni;
    }
    public String getDni()
    {
        return dni;
    }
    
    public void setUsuario(String usuario)
    {
        this.usuario=usuario;
    }
    public String getUsuario()
    {
        return usuario;
    }
    
    public void setCodigo(String codigo)
    {
        this.codigo=codigo;
    }
    public String getCodigo()
    {
        return codigo;
    }
    
    public void setPsswd(String psswd)
    {
        this.psswd=psswd;
    }
    public String getPsswd()
    {
        return psswd;
    }
    
       
}
