package punto4;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public static void main(String[] args) {
		Semaphore carritos = new Semaphore(15, true);
        Semaphore cajas = new Semaphore(3, true);
        Supermercado supermercado = new Supermercado(carritos, cajas);
        int idCliente = 1;
        
        while (true) {
            Cliente cliente = new Cliente(idCliente, supermercado);
            new Thread(cliente).start();
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(300, 501));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            idCliente++;
        }
	}
}
