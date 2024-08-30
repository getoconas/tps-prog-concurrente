package punto5;

public class Main {
	public static void main(String[] args) {
		Cuadrilatero rectangulo = new Cuadrilatero("Rectangulo",5,4);
		//Resultados
		System.out.println("Forma: " + rectangulo.NombreForma);
		System.out.println("Area: " + rectangulo.area());
		System.out.println("Perimetro: " + rectangulo.perimetro());
		
		System.out.println();
		
		Cuadrilatero paralelogramo = new Cuadrilatero("Paralelogramo",8,5);
		//Resultados
		System.out.println("Forma: " + paralelogramo.NombreForma);
		System.out.println("Area: " + paralelogramo.area());
		System.out.println("Perimetro: " + paralelogramo.perimetro());
		
		System.out.println();
		
		Circulo circulo = new Circulo("Circulo",6.5);
		//Resultados
		System.out.println("Forma: " + circulo.NombreForma);
		System.out.println("Area: " + circulo.area());
		System.out.println("Perimetro: " + circulo.perimetro());
	}
}
