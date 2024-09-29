package clase3.implementacion;

public class HiloRunnable implements Runnable {

	public static void main(String[] args) {
		HiloRunnable run = new HiloRunnable();
		Thread hilo = new Thread(run);
		hilo.start();
	}

	@Override
	public void run() {
		System.out.println("Soy " + this.toString() + " Hola mundo!!!");
	}
}
