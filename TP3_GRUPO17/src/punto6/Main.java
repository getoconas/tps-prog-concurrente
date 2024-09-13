package punto6;

public class Main {

	public static void main(String[] args) {
		Integer[][] matrizA = AuxiliarMatriz.cargarMatriz(100, 200);
		Integer[][] matrizB = AuxiliarMatriz.cargarMatriz(200, 100);
		HiloIntercambioMatrices nuevoHilo = new HiloIntercambioMatrices();
		
		System.out.println("MATRIZ A INICIAL");
		AuxiliarMatriz.mostrarMatriz(matrizA);
		System.out.println("MATRIZ B INICIAL");
		AuxiliarMatriz.mostrarMatriz(matrizB);
		System.out.println();
		
		for (int i = 0; i < matrizA.length; i++) {
			nuevoHilo = new HiloIntercambioMatrices(("Hilo" + i), matrizA, matrizB, i);
			nuevoHilo.start();
			try {
				nuevoHilo.join();
			} catch (Exception e) {
				System.out.println("Error JOIN");
			}
		}
		
		matrizA = nuevoHilo.getMatrizPrincipal();
		matrizB = nuevoHilo.getMatrizSecundaria();
		
		System.out.println("MATRIZ A FINAL");
		AuxiliarMatriz.mostrarMatriz(matrizA);
		System.out.println("MATRIZ B FINAL");
		AuxiliarMatriz.mostrarMatriz(matrizB);
	}

}
