package punto5;

public abstract class Forma {
  protected String NombreForma;
	
  public Forma() {
    
  }
	
  public Forma(String nombreForma) {
	  this.NombreForma = nombreForma;
  }
	
  public abstract double area();
  public abstract double perimetro();
}
