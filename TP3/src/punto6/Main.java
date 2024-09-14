/**
 * @author mago
 */
package punto6;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int filaA = 100;
        int columnaA = 200;
        int filaB = 200;
        int columnaB = 100;

        int[][] matrizA = new int[filaA][columnaA];
        int[][] matrizB = new int[filaB][columnaB];

        // Genero matriz con numeros aleatorios entre 1-100
        Random aleatorio = new Random();
        for (int i = 0; i < filaA; i++) {
            for (int j = 0; j < columnaA; j++) {
                matrizA[i][j] = aleatorio.nextInt(100) + 1;
            }
        }

        for (int i = 0; i < filaB; i++) {
            for (int j = 0; j < columnaB; j++) {
                matrizB[i][j] = aleatorio.nextInt(100) + 1;
            }
        }

        // Imprime matrices
        System.out.println("MATRIZ A INICIAL");
        imprimirMatriz(matrizA);

        System.out.println(" ");
        System.out.println("MATRIZ B INICIAL");
        imprimirMatriz(matrizB);

        int hilos = Math.min(filaA, columnaA); 

        Thread[] threads = new Thread[hilos];

        for (int i = 0; i < hilos; i++) {
            int start = i;
            int end = i + 1;
            threads[i] = new MatrizThread(matrizA, matrizB, start, end);
            threads[i].start();
        }

        try {
            for (int i = 0; i < hilos; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Muestra matriz final
        System.out.println(" ");
        System.out.println("MATRIZ A DESPUES DEL INTERCAMBIO:");
        imprimirMatriz(matrizA);
        
        System.out.println(" ");
        System.out.println("MATRIZ B DESPUES DEL INTERCAMBI0:");
        imprimirMatriz(matrizB);
	}
	
	private static class MatrizThread extends Thread {
        private int[][] matrizA;
        private int[][] matrizB;
        private int inicio;
        private int fin;

        public MatrizThread(int[][] matrizA, int[][] matrizB, int inicio, int fin) {
            this.matrizA = matrizA;
            this.matrizB = matrizB;
            this.inicio = inicio;
            this.fin = fin;
        }

        @Override
        public void run() {
            for (int i = inicio; i < fin; i++) {
                for (int j = 0; j < matrizA[i].length; j++) {
                    int temporal = matrizA[i][j];
                    matrizA[i][j] = matrizB[j][i];
                    matrizB[j][i] = temporal;
                }
            }
        }
    }

    private static void imprimirMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
