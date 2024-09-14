/**
 * @author mago
 */
package punto5b;

public class Main {

	public static void main(String[] args) {
		long inicioTiempo = System.currentTimeMillis();
		ejecutarHilos();
		// Una vez terminada la ejecucion de los hilos continua por este apartado
		long finTiempo = System.currentTimeMillis();
		long tiempoEjecucion = finTiempo - inicioTiempo;
		System.out.println("Ejecucion en milisegundos: " + tiempoEjecucion);
	}
	
	private static void ejecutarHilos() {
		Thread hilos[] = new Thread[20];
		// Crea los 20 hilos para la ejecucion concurrente
		for (int j = 0; j < 20; j++) {
			hilos[j] = new HiloRoot(j+1);
			hilos[j].start(); // Ejecuta el metodo SumRootN
		}
		// Espera que termina de ejecutar los 20 hilos con el metodo join()
		for (int k = 0; k < 20; k++) {
			try {
				hilos[k].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
