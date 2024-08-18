/*
 * @author mago 
 */
package punto5.test;

import punto5.domain.Circulo;

public class Main {

	public static void main(String[] args) {
		// Inicializacion de objetos
		Circulo c1 = new Circulo(6.2);
		Circulo c2 = new Circulo(1.5);
		Circulo c3 = new Circulo(3.0);

		// Mostrar carga inicial
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());

		// Mostrar perimetro
		c1.perimetro();
		c2.perimetro();
		c3.perimetro();

		// Mostrar area
		c1.area();
		c2.area();
		c3.area();
	}
}
