package punto4;

public class MultiplicacionMatriz {
	private static final int FILA_MATRIZ_A = 20;
	private static final int COLUMNA_MATRIZ_A = 15;
	private static final int FILA_MATRIZ_B = 15;
	private static final int COLUMNA_MATRIZ_B = 20;
	
	private int[][] A = new int[FILA_MATRIZ_A][COLUMNA_MATRIZ_A];
	private int[][] B = new int[FILA_MATRIZ_B][COLUMNA_MATRIZ_B];
	private int[][] C = new int[FILA_MATRIZ_A][COLUMNA_MATRIZ_B];
	
	public MultiplicacionMatriz() {
		this.inicializarMatrices();
	}
	
	private void inicializarMatrices() {
		this.inicializarMatrizA();
		this.inicializarMatrizB();
	}
	
	private void inicializarMatrizA() {
		for (int i = 0; i < FILA_MATRIZ_A; i++) {
			for (int j = 0; j < COLUMNA_MATRIZ_A; j++) {
				A[i][j] = (int) (Math.random() * 11) + 5;
			}
		}
	}
	
	private void inicializarMatrizB() {
		for (int i = 0; i < FILA_MATRIZ_B; i++) {
			for (int j = 0; j < COLUMNA_MATRIZ_B; j++) {
				B[i][j] = (int) (Math.random() * 11) + 5;
			}
		}
	}
	
	public void multiplicarMatriz() {
		Thread[] hilos = new Thread[FILA_MATRIZ_A];
		
		for (int i = 0; i < FILA_MATRIZ_A; i++) {
			Runnable hilo = new CalculoConcurrente(A, B, C, i);
			hilos[i] = new Thread(hilo);
			hilos[i].start();
		}
		
		for (Thread hilo : hilos) {
			try {
				hilo.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void mostrarMatrizInicial() {
		System.out.println("MATRIZ INICIAL A");
		imprimirMatriz(A);
		System.out.println();
		System.out.println("MATRIZ INICIAL B");
		imprimirMatriz(B);
	}
	
	public void mostrarMatrizFinal() {
		System.out.println();
		System.out.println("MATRIZ FINAL C");
		imprimirMatriz(C);
	}
	
	private void imprimirMatriz(int[][] matriz) {
		for (int[] f : matriz) {
			for (int valor : f) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}
	}
}

