package punto4.test;

import punto4.domain.Cuadrilatero;

public class Main {

	public static void main(String[] args) {
		// Inicializacion de objetos
		Cuadrilatero c1 = new Cuadrilatero(3.5, 5.4, 1.2, 2.2);
		Cuadrilatero c2 = new Cuadrilatero(2, 2, 2, 2);
		Cuadrilatero c3 = new Cuadrilatero(4.2, 3.1, 4.2, 3.1);

		// Mostrar carga inicial
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());

		// Mostrar perimetro
		System.out.println("***** EL PERIMETRO DEL CUADRILATERO ES: " + String.format("%.2f", c1.perimetro()) + " *****");
		System.out.println("***** EL PERIMETRO DEL CUADRILATERO ES: " + String.format("%.2f", c2.perimetro()) + " *****");
		System.out.println("***** EL PERIMETRO DEL CUADRILATERO ES: " + String.format("%.2f", c3.perimetro()) + " *****");

		// Mostrar area
		c1.area();
		c2.area();
		c3.area();
	}

}
