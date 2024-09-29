package clase3.implementacion;

public class HiloHerencia extends Thread {

	public static void main(String[] args) {
		HiloHerencia hilo = new HiloHerencia();
		hilo.setName("Un hilo que hereda de Thread.");
		hilo.start();
	}
	
	@Override
	public void run() {
		System.out.println("Soy " + getName() + " Hola mundo!!!");
	}
}
