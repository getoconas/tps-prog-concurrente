package clase3.planificacion;

public class TestDosHilos {

	public static void main(String[] args) {
		UnHilo hiloUno = new UnHilo("Hilo Uno");
		UnHilo hiloDos = new UnHilo("Hilo Dos");
		
		hiloUno.start();
		hiloDos.start();
		
		try {
			hiloUno.join();
			hiloDos.join();
		} catch (InterruptedException e) {
			System.out.println("El programa ha finalizado");
		}
	}
}
