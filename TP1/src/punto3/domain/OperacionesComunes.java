/*
 * @author mago 
 */
package punto3.domain;

public interface OperacionesComunes {
	String nombre_banco = "BANCO 1";
	String direccion_banco = "DIRECCION 1";
	String horario = "08:00 a 13:00";
	
	public void pagarServicio();
	public void cambiarAlias();
}
