package clase5.supermarket.thread;

public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
		Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });
		long initialTime = System.currentTimeMillis(); // Tiempo inicial de referencia
		
		CajeraThread cajera1 = new CajeraThread("Cajera 1", cliente1, initialTime);
		CajeraThread cajera2 = new CajeraThread("Cajera 2", cliente2, initialTime);
		
		cajera1.start();
		cajera2.start(); 
	}
}