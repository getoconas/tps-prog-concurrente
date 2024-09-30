package clase5.cerouno.thread;

public class MostrarCeroUnoHilo {

	public static void main(String[] args) {
		HiloMostrarCero h1 = new HiloMostrarCero();
		h1.start();
		
		HiloMostrarUno h2 = new HiloMostrarUno();
		h2.start();
	}
}
