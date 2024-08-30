package punto6;

import java.util.Arrays;
import java.util.Scanner;

public class Validaciones {
  private static Scanner ingreso = new Scanner(System.in);
	private static String[] cuadrilateros = {"cuadrado", "rectangulo", "paralelogramo", "trapecio", "rombo"};
	
	public static double validarDecimal(String tipo) {
		double doubleValido = 0.0;
		System.out.println("Ingrese " + tipo + ": ");
		while (true) {
			String numero = Validaciones.ingreso.next();
			try {
				doubleValido = Double.parseDouble(numero);
				break;
			} catch (Exception e) {
				System.out.println("Ingrese uno valido: ");
			}
		}
		return doubleValido;
	}
	
	public static String validarCuadrilatero() {
		String nombreIngresado = "";
		do {
			System.out.print("Ingrese el nombre del cuadrilatero: ");
			nombreIngresado = ingreso.next();
		} while (!Arrays.asList(cuadrilateros).contains(nombreIngresado));
		return nombreIngresado;
	}
}
