package clase3.regioncritica;

public class TestHiloContador {

	public static void main(String[] args) {
		Contador cont = new Contador();
		HiloContador hc1 = new HiloContador("HiloUno", cont);
		HiloContador hc2 = new HiloContador("HiloDos", cont);
		
		hc1.start();
		hc2.start();
		
		try {
			hc1.join();
			hc2.join();
		} catch (InterruptedException e) {
			System.out.println("Error al ejecutar el metodo join");
		}
		
		System.out.println("El ultimo valor que de mostrarse es 10 * 2 = 20");
	}

}
