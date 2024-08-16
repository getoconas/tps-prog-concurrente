package punto2.domain;
import java.util.Random;

public class CuentaSueldo extends CuentaBancaria {
	private static int ultimo_legajo_creado = 100;
	private int legajo;
	private String institucion;
	private String beneficios;
	private long cbu;
	private double tope;
	
	// Constructor por defecto
	public CuentaSueldo() {
		super();
		this.legajo = ++ultimo_legajo_creado;
		this.institucion = "";
		this.beneficios = "";
		this.cbu = 0;
		this.tope = 15000;
	}
	
	// Constructor con demas atributos
	public CuentaSueldo(long dni, double saldo_actual, double interes_anual, String institucion, String beneficios) {
		super(dni, saldo_actual, interes_anual);
		this.legajo = ++ultimo_legajo_creado;
		this.institucion = institucion;
		this.beneficios = beneficios;
		this.cbu = this.generarCBU();
		this.tope = 15000;
	}
	
	// Generador de CBU
	private long generarCBU() {
		Random random = new Random();
		return (long) (random.nextDouble()*Math.pow(10,18));
	}
	
	// Retirar dinero con tope
	@Override
	public void retirar(double cantidad) {
		if (this.saldo_actual > 0 && cantidad <= this.saldo_actual && cantidad <= this.tope) {
			this.saldo_actual -= cantidad;
		} else {
			System.out.println("***** SALDO INSUFICIENTE O TOPE DE OPERACION *****");
		}
	}
	
	// Transfiere una cantidad determinada a un cbu
	public void transferir(double cantidad, long cbu) {
		if (this.saldo_actual > 0 && cantidad <= this.saldo_actual) {
			this.saldo_actual -= cantidad;
			System.out.println("***** TRANSFERENCIA REALIZADA POR " + String.format("%.2f", cantidad) + " AL CBU " + cbu + " *****");
			System.out.println("***** SALDO ACTUAL: " + String.format("%.2f",this.saldo_actual) + " *****");
		} else {
			System.out.println("***** SALDO INSUFICIENTE PARA REALIZAR ESTA OPERACION *****");
		}
	}
	
	public void transferir(double cantidad, String alias) {
		if (this.saldo_actual > 0 && cantidad <= this.saldo_actual) {
			this.saldo_actual -= cantidad;
			System.out.println("***** TRANSFERENCIA REALIZADA POR " + String.format("%.2f", cantidad) + " AL ALIAS " + alias + " *****");
			System.out.println("***** SALDO ACTUAL: " + String.format("%.2f",this.saldo_actual) + " *****");
		} else {
			System.out.println("***** SALDO INSUFICIENTE PARA REALIZAR ESTA OPERACION *****");
		}
	}
	
	public String toString() {
		return super.toString() + "\n" +
				"LEGAJO: " + this.legajo + "\n" +
				"INSTITUCION: " + this.institucion + "\n" +
				"BENEFICIOS: " + this.beneficios+ "\n" +
				"CBU: " + this.cbu + "\n" +
				"TOPE DE OPERACION: " + String.format("%.2f",this.tope) + "\n" +
				"-----------";
    }
}
