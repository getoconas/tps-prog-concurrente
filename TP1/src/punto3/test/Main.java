/*
 * @author mago 
 */
package punto3.test;

import punto3.domain.CuentaSueldo;

public class Main {

	public static void main(String[] args) {
		// Incializacion de objetos
		CuentaSueldo cuenta1 = new CuentaSueldo(25669742, 356991.55, 2.5, "BANCO MACRO", "BENEFICIO 1");
		CuentaSueldo cuenta2 = new CuentaSueldo(35778130, 1976531.13, 2.5, "BANCO GALICIA", "BENEFICIO 2");
		
		// Mostrar informacion inicial
		System.out.println(cuenta1.toString());
		System.out.println(cuenta2.toString());
		
		System.out.println("*****");
		cuenta2.transferenciaAltoMonto(1000000.00);
	}

}
