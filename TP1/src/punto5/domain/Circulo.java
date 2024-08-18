/*
 * @author mago 
 */
package punto5.domain;

public class Circulo extends Forma {
  private double radio;

  // Constructor por defecto
  public Circulo() {
    this.radio = 0;
  }

  // Constructor con radio
  public Circulo(double radio) {
    this.radio = radio;
  }

  public String toString() {
    return "RADIO: " + this.radio;
  }

  // Muestra el area de un circulo
  @Override
  public void area() { // OK
    // pi * r^2
    System.out.println("***** EL AREA DEL CIRCULO CON RADIO " + this.radio + " ES IGUAL A " + String.format("%.2f", Math.PI * Math.pow(this.radio, 2)) + " *****");
  }

  // Muestra el perimetro de un circulo
  @Override
  public void perimetro() { // OK
    // 2 pi * r
    System.out.println("***** EL PERIMETRO DEL CIRCULO CON RADIO " + this.radio + " ES IGUAL A " + String.format("%.2f", 2 * Math.PI * this.radio) + " *****");
  }
}
