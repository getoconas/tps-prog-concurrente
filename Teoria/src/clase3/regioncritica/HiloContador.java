package clase3.regioncritica;

public class HiloContador extends Thread {
	private Contador contador;
	
	public HiloContador(String nNombre, Contador nContador) {
		super(nNombre);
		contador = nContador;
	}
	
	@Override
	public void run() {
		try {
			synchronized (contador) {
				for (int j = 0; j < 10; j++) {
					int i = contador.getContador();
					sleep((int) (Math.random()*10));
					contador.setContador(i + 1);
					System.out.println(getName() + " pone el contador a " + i);
				}
			}
			
		} catch (InterruptedException e) {
			System.out.println("Error al ejecutar el metodo sleep");
		}
	}
}
