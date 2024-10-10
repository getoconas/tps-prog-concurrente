package punto4;

public class CalculoConcurrente extends Operaciones implements Runnable {
	private final int[][] A;
	private final int[][] B;
	private final int[][] C;
	private final int fila;
	
	public CalculoConcurrente(int[][] A, int[][] B, int[][] C, int fila) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.fila = fila;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < B[0].length; i++) {
			int producto = 0;
			for (int j = 0; j < A[0].length; j++) {
				producto += A[fila][j] * B[j][i];
			}
			
			double resultado = SumRootN(producto);
			
			synchronized (C) {
				C[fila][i] = (int) resultado;
			}
		}
	}
}

