/*
 * @author mago 
 */
package punto1.domain;

public class CuentaBancaria {
	private static long ultima_cuenta_creada = 100000;
	private long numero_cuenta;
	private long dni;
	private double saldo_actual;
	private double interes_anual;
	
	// Constructor por Defecto
	public CuentaBancaria() {
		this.numero_cuenta = ++ultima_cuenta_creada;
		this.dni = 0;
		this.saldo_actual = 0;
		this.interes_anual = 0;
	}
	
	// Constructor con dni, saldo_actual e interes_anual
	public CuentaBancaria(long dni, double saldo_actual, double interes_anual) {
		this.numero_cuenta = ++ultima_cuenta_creada;
		this.dni = dni;
		this.saldo_actual = saldo_actual;
		this.interes_anual = interes_anual;
	}
	
	// Actualiza el saldo actual de acuerdo al interes diario
	public void actualizarSaldo() {
		this.saldo_actual += this.saldo_actual * ((this.interes_anual / 100) / 365);
	}
	
	// Ingresa una cantidad de dinero
	public void ingresar(double cantidad) {
		this.saldo_actual += cantidad;
	}
	
	// Retira una cantidad de dinero
	public void retirar(double cantidad) {
		if (this.saldo_actual > 0 && cantidad <= this.saldo_actual) {
			this.saldo_actual -= cantidad;
		} else {
			System.out.println("***** SALDO INSUFICIENTE *****");
		}
	}
	
	// Muestra información de la cuenta
	public String toString() {
		return "-----------" + "\n" +
				"NUMERO DE CUENTA: " + this.numero_cuenta + "\n" +
				"DNI: " + this.dni + "\n" +
				"SALDO ACTUAL: " + String.format("%.2f", this.saldo_actual) + "\n" +
				"INTERES ANUAL: " + this.interes_anual + "%\n" +
				"-----------";
	}
}
