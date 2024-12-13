package punto6;

public class Main {
	public static void main(String[] args) {
		Barberia barberia = new Barberia(3); // 3 sillas en la sala de espera
        Thread barberThread = new Thread(new Barbero(barberia));
        barberThread.start();

        for (int i = 0; i < 20; i++) {
        	new Thread(new Cliente(barberia)).start();
        	try {
				Thread.sleep((long) Math.random() * (1000 - 500) + 500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}            
        }
	}
}
