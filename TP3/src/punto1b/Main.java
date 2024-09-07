package punto1b;

public class Main {

	public static void main(String[] args) {
		// Para ejecutar en forma concurrente tengo que usar el metodo start()
		PrintX printX = new PrintX();
		printX.start();
		
		PrintY printY = new PrintY();
		printY.start();
		
		// Para que terminen de ejecutar los hilos se tiene que usar el metodo join()
		// Despues de eso se sigue ejecutando el main
	}

}
