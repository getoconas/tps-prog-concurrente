package punto4.domain;

public class Cuadrilatero extends Forma {
  private double lado1;
  private double lado2;
  private double lado3;
  private double lado4;
  private double perimetro;

  // Constructor por Defecto
  public Cuadrilatero() {
    this.lado1 = 0;
    this.lado2 = 0;
    this.lado3 = 0;
    this.lado4 = 0;
    this.perimetro = 0;
  }

  // Constructor con los lados
  public Cuadrilatero(double lado1, double lado2, double lado3, double lado4) {
    this.lado1 = lado1;
    this.lado2 = lado2;
    this.lado3 = lado3;
    this.lado4 = lado4;
  }

  public String toString() {
    return "-----------" + "\n" +
        "LADO 1: " + this.lado1 + "\n" +
        "LADO 2: " + this.lado2 + "\n" +
        "LADO 3: " + this.lado3 + "\n" +
        "LADO 4: " + this.lado4 + "\n" +
        "-----------" + "\n";
  }

  // Retorna un valor booleando si es un cuadradro o rombo
  private boolean esCuadrado() {
    return this.lado1 == this.lado2 && this.lado2 == this.lado3 && this.lado3 == this.lado4;
  }

  // Retorna un valor booleando si es un rectangulo
  private boolean esRectangulo() {
    return this.lado1 == this.lado3 && this.lado2 == this.lado4;
  }

  // Muestra el area de un cuadrilatero
  @Override
  public void area() {
    if (esCuadrado()) {
      System.out.println("***** EL AREA DEL CUADRADO O ROMBO ES DE: " + String.format("%.2f", this.lado1 * this.lado1) + " *****");
    } else if(esRectangulo()) {
      System.out.println("***** EL AREA DEL RECTANGULO ES DE: " + String.format("%.2f", this.lado1 * this.lado2) + " *****");
    } else {
      double s = perimetro() / 2;
      double area = Math.sqrt((s - this.lado1) * (s - this.lado2) * (s - this.lado3) * (s - this.lado4));
      System.out.println("***** EL AREA DEL CUADRILATERO ES DE: " + String.format("%.2f", area) + " *****");
    }
  }

  // Retorna el perimetro de un cuadrilatero
  @Override
  public double perimetro() {
    return this.lado1 + this.lado2 + this.lado3 + this.lado4;
  }
}
