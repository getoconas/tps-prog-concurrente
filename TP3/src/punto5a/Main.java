/**
 * @author mago
 */
package punto5a;

public class Main {

	public static void main(String[] args) {
		long inicioTiempo = System.currentTimeMillis();
		for (int i = 1; i <= 20; i++) {
			imprimir(SumRootN(i), i);
		}
		long finTiempo = System.currentTimeMillis();
		long tiempoEjecucion = finTiempo - inicioTiempo;
		System.out.println("Ejecucion en milisegundos: " + tiempoEjecucion);
	}
	
	private static void imprimir(double sumRootN, int i) {
		System.out.println("root " + i + ": " + sumRootN);
	}
	
	private static double SumRootN(int root) {
		double result = 0;
		for (int i = 0; i < 10000000; i++) {
			result += Math.exp(Math.log(i)/root);
		}
		return result;
	}

}
