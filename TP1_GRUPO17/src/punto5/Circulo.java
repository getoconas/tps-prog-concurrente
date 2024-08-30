package punto5;

public class Circulo extends Forma {
  private double radio;

	public Circulo() {
	}

	public Circulo(String nombreForma,double radio) {
		super(nombreForma);
		this.radio = radio;
	}

	@Override
	public double area() {
		double resultado = Math.PI * radio * radio;
		return resultado;
	}

	@Override
	public double perimetro() {
		double resultado = Math.PI * 2 * radio;
		return resultado;
	}
}
