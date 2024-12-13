package punto1;

public class Auto extends Thread {
	private final Estacionamiento estacionamiento;
    private final int id;

    public Auto(Estacionamiento estacionamiento, int id) {
        this.estacionamiento = estacionamiento;
        this.id = id;
    }
    
    @Override
    public void run() {
    	try {
            estacionamiento.entrar(id);
            // Simula tiempo de permanencia en el estacionamiento 
            Thread.sleep((long) (Math.random() * 3000)); 
            estacionamiento.salir(id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
