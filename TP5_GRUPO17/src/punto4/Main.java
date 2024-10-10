package punto4;

public class Main {

	public static void main(String[] args) {
		long inicioEjecucion = System.currentTimeMillis();
		
		MultiplicacionMatriz mm = new MultiplicacionMatriz();
		mm.mostrarMatrizInicial();
		mm.multiplicarMatriz();
		mm.mostrarMatrizFinal();
		
		System.out.println();
		long finEjecucion = System.currentTimeMillis();
		System.out.println("Tiempo de ejecucion: " + (finEjecucion - inicioEjecucion) + " ms");
	}

}
