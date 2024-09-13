package punto6;

import java.util.Arrays;
import java.util.Random;

public class AuxiliarMatriz {
	public static Integer[][] cargarMatriz(Integer filas, Integer columnas) {
		Integer[][] matriz = new Integer[filas][columnas];
		Random generarNumeros = new Random();
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = generarNumeros.nextInt(101);
			}
		}
		return matriz;
	}
	
	public static void mostrarMatriz(Integer[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
	}
}
