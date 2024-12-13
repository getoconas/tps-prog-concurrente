package punto3b;

import java.util.Random;

public class Main {

	public static void main(String[] args) {		
		Random random = new Random();
		int longitud = 5;
		boolean[] booleanos = new boolean[longitud];
		booleanos[random.nextInt(longitud)] = true;
		
		for (int i = 0; i < longitud; i++) {
			EstacionDePeaje semaphore = new EstacionDePeaje(booleanos[i], "P" + i, "A" + i);
			semaphore.start();
		}
	}

}
