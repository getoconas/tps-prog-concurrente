package punto1;

public class Main {
	public static void main(String[] args) {
		Semaforos.P1 p1 = new Semaforos.P1();
        Semaforos.P2 p2 = new Semaforos.P2();
        Semaforos.P3 p3 = new Semaforos.P3();
        
        System.out.println("Orden de ejecucion y valor de x:");

        p1.start();
        p2.start();
        p3.start();

        try {
			p1.join();
			p2.join();
	        p3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        System.out.println("Valor final para la variable x: " + Semaforos.x);
	}
}
