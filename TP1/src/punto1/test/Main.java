package punto1.test;

import punto1.domain.CuentaBancaria;

public class Main {
	
	public static void main(String[] args) {
		// Incializacion de objetos
		CuentaBancaria cuenta1 = new CuentaBancaria(35123555, 15330.22, 2.5);
		CuentaBancaria cuenta2 = new CuentaBancaria(38559971, 58661.77, 2.5);
		CuentaBancaria cuenta3 = new CuentaBancaria(42699730, 5963.08, 2.5);
		
		// Mostrar informacion inicial
		System.out.println(cuenta1.toString());
		System.out.println(cuenta2.toString());
		System.out.println(cuenta3.toString());
		
		System.out.println("*****");
		// Actualizar saldo
		cuenta2.actualizarSaldo();
		System.out.println(cuenta2.toString());
		
		System.out.println("*****");
		// Agregar dinero
		cuenta1.ingresar(50000.00);
		System.out.println(cuenta1.toString());
		
		System.out.println("*****");
		// Retirar dinero
		cuenta3.retirar(10000.00);
		cuenta3.retirar(2000.00);
		System.out.println(cuenta3.toString());
	}

}
	