/*
 * @author mago 
 */
package punto2.test;

import punto2.domain.CuentaSueldo;

public class Main {

	public static void main(String[] args) {
		// Incializacion de objetos
		CuentaSueldo cuenta1 = new CuentaSueldo(25669742, 356991.55, 2.5, "BANCO MACRO", "BENEFICIO 1");
		CuentaSueldo cuenta2 = new CuentaSueldo(38423011, 150399.04, 2.5, "BANCO NACION", "BENEFICIO 2");
		CuentaSueldo cuenta3 = new CuentaSueldo(29770300, 98775.23, 2.5, "BANCO HSBC", "BENEFICIO 3");
		CuentaSueldo cuenta4 = new CuentaSueldo(33479804, 254790.46, 2.5, "BANCO GALICIA", "BENEFICIO 4");
		
		// Mostrar informacion inicial
		System.out.println(cuenta1.toString());
		System.out.println(cuenta2.toString());
		System.out.println(cuenta3.toString());
		System.out.println(cuenta4.toString());
		System.out.println("*****");
		
		// Retirar dinero
		cuenta3.retirar(25000.00);
		System.out.println("*****");
		// Enviar transferencia por cbu
		cuenta1.transferir(150000.00, 80559843417474329L);
		System.out.println("*****");
		// Enviar transferencia por alias
		cuenta2.transferir(35000.00, "EL.MAGO");
	}

}
