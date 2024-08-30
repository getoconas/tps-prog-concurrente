package punto6;

public class Cuadrilatero implements Forma {
	private String nombreForma;
	private Double parametroA;
	private Double parametroB;
	private Double altura;
	private Double parametroTrapecioA;
	private Double parametroTrapecioB;
	
	public Cuadrilatero() {
		
		nombreForma = Validaciones.validarCuadrilatero();
		
		if (this.nombreForma.toLowerCase().equals("cuadrado")) {
			parametroA = Validaciones.validarDecimal("lado");
		}
		
		if (this.nombreForma.toLowerCase().equals("rombo")) {
			altura = Validaciones.validarDecimal("diagonal A");
			parametroB = Validaciones.validarDecimal("diagonal B");
			parametroA = Validaciones.validarDecimal("lado");
		}
		
		if (this.nombreForma.toLowerCase().equals("rectangulo")) {
			parametroA = Validaciones.validarDecimal("base");
			altura = Validaciones.validarDecimal("altura");
		}
		
		if (this.nombreForma.toLowerCase().equals("paralelogramo")) {
			parametroA = Validaciones.validarDecimal("base");
			parametroB = Validaciones.validarDecimal("lado");
			altura = Validaciones.validarDecimal("altura");
		}
		
		if (this.nombreForma.toLowerCase().equals("trapecio")) {
			parametroA = Validaciones.validarDecimal("lado superior");
			parametroB = Validaciones.validarDecimal("lado inferior");
			parametroTrapecioA = Validaciones.validarDecimal("lado izquierdo");
			parametroTrapecioB = Validaciones.validarDecimal("lado derecho");
			altura = Validaciones.validarDecimal("altura");
		}
	}
	
	public Double perimetro() {
		Double resPerimetro = 0.0;
		if (this.nombreForma.toLowerCase().equals("trapecio")) {
			resPerimetro = parametroA + parametroB + parametroTrapecioA + parametroTrapecioB;
		} else {
			if (this.nombreForma.toLowerCase().equals("paralelogramo")) {
				resPerimetro = (2 * parametroA) + (2 * parametroB);
			} else {
				if (this.nombreForma.toLowerCase().equals("rectangulo")) {
					resPerimetro = (2 * parametroA) + (2 * altura);
				} else {
					resPerimetro = 4 * parametroA;
				}
			}
		}
		return resPerimetro;
	}
	
	public Double area() {
		Double resArea = 0.0;
		if (this.nombreForma.toLowerCase().equals("cuadrado")) {
			resArea = parametroA * parametroA;
		} else {
			if (this.nombreForma.toLowerCase().equals("rombo")) {
				resArea = (altura * parametroB) / 2;
			} else {
				if (this.nombreForma.toLowerCase().equals("rectangulo")) {
					resArea = parametroA * altura;
				} else {
					if (this.nombreForma.toLowerCase().equals("paralelogramo")) {
						resArea = parametroA * altura;
					} else {
						resArea = ((parametroA + parametroB) * altura) / 2;
					}
				}
			}
		}
		return resArea;
	}
	
	public String getNombreForma() {
		return nombreForma;
	}
}
