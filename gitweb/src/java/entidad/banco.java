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
public class banco {
    
    String id_banco;
    int deposito;
    int giro;
    int saldo;
    int trans;
    
    public banco() {
		// TODO: Add your code here
	}
    
    public void setId_banco(String id_banco) {
		this.id_banco = id_banco; 
	}
    
    public String getId_banco() {
		return id_banco; 
	}
    
    public void setDeposito(int deposito) {
		this.deposito = deposito; 
	}
    
    public int getDeposito() {
		return deposito; 
	}
    
    public void setGiro(int giro) {
		this.giro = giro; 
	}
    
    public int getGiro() {
		return giro; 
	}
    
    public void setSaldo(int saldo) {
		this.saldo = saldo; 
	}
    
    public int getSaldo() {
		return saldo; 
	}
    
    public void setTrans(int trans) {
		this.trans = trans; 
	}
    
    public int getTrans() {
		return trans; 
	}
}
