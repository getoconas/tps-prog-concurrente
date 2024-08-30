package punto5;

public class Cuadrilatero extends Forma {
  private double lado1;
	private double lado2;
	
	public Cuadrilatero() {
	}
	
	public Cuadrilatero(String nombreForma,double ladoa,double ladob) {
		super(nombreForma);
		this.lado1 = ladoa;
		this.lado2 = ladob;
	}

	@Override
	public double area() {
		double resultado = lado1 * lado2;
		return resultado;
	}

	@Override
	public double perimetro() {
		double resultado = 2 * lado1 + 2 * lado2;
		return resultado;
	}
}
