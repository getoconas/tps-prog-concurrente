/**
 * @author mago
 */
package punto2;

public class Main {
	private static int V = 100;
	
	public static void main(String[] args) {
		Incremento incrementoHilo = new Incremento();
		Decremento decrementoHilo = new Decremento();
		
		incrementoHilo.start();
		decrementoHilo.start();
		
		try {
			incrementoHilo.join();
			decrementoHilo.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("VALOR FINAL DE V: " + V);
	}
	
	private static class Incremento extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				V++;
			}
		}
	}
	
	private static class Decremento extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				V--;
			}
		}
	}
}
