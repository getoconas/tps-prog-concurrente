package punto3;

public class ZooEntrarSalir {
    private boolean pasilloLibre = true;

    public void entraZooPasillo(int id) throws InterruptedException {
    	try {
    		synchronized (this) {
        		while (!pasilloLibre) {
                    wait();
                }
    		}
            pasilloLibre = false;
            System.out.println("Visitante " + id + " entra por el pasillo.");
            Thread.sleep(50); // Tiempo para entrar por el pasillo
            System.out.println("Visitante " + id + " ha entrado al zoologico.");
            pasilloLibre = true;
            notifyAll();
    	} catch (Exception e) {
			// TODO: handle exception
		}
    }

    public void saleZooPasillo(int id) throws InterruptedException {
    	try {
    		synchronized (this) {
            	while (!pasilloLibre) {
                    wait();
                }
    		}
            pasilloLibre = false;
            System.out.println("Visitante " + id + " sale por el pasillo.");
            Thread.sleep(50); // Tiempo para salir por el pasillo
            System.out.println("Visitante " + id + " ha salido del zoologico.");
            pasilloLibre = true;
            notifyAll();
    	} catch (Exception e) {
			// TODO: handle exception
		}
    }
}
