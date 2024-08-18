/*
 * @author mago 
 */
package punto6.test;

import punto6.domain.Cuadrilatero;

public class Main {

	public static void main(String[] args) {
		Cuadrilatero c1 = new Cuadrilatero(3.5, 5.4, 1.2, 2.2);
		Cuadrilatero c2 = new Cuadrilatero(2, 2, 2, 2);
		Cuadrilatero c3 = new Cuadrilatero(4.2, 3.1, 4.2, 3.1);

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
