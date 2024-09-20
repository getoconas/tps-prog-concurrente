package punto3;

public class Visitante extends Thread {
	private int id;
	private ZooEntrarSalir zoo;
	
	public Visitante(int id, ZooEntrarSalir zoo) {
        this.id = id;
        this.zoo = zoo;
    }
	
	@Override
	public void run () {
		while (true) {
			try {
				 System.out.println("Visitante " + id + " hace fila para entrar.");
				 zoo.entraZooPasillo(id);
		         Thread.sleep((int) (Math.random() * 300) + 400); // tiempo en que el visitante esta en el zoologico
		         System.out.println("Visitante " + id + " hace fila para salir.");
		         zoo.saleZooPasillo(id);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
