package punto5b;

public class Main {

	public static void main(String[] args) {
		long inicio,fin;
		inicio = System.currentTimeMillis();
		
		Thread hilo[] = new Thread[20];
		
		for (int j = 0; j < 20; j++) {
			hilo[j] = new Thread(new HiloRoot(j + 1));
			hilo[j].start();
		}
		
		for (int i = 0; i < hilo.length; i++) {
			try {
				hilo[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		fin = System.currentTimeMillis();
		long tiempoEjecucion = fin - inicio;
		System.out.println("Tiempo de Ejecucion: " + tiempoEjecucion);
	}
}

