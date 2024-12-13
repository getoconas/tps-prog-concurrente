package punto4;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class Supermercado {
	private final Semaphore carritos;
    private final Semaphore cajas;

    public Supermercado(Semaphore carritos, Semaphore cajas) {
        this.carritos = carritos;
        this.cajas = cajas;
    }
    
    public void entrarSupermercado(int idCliente) {
        try {
            carritos.acquire(); 
            System.out.println("Cliente " + idCliente + " entro al super y tomo un carrito.");

            System.out.println("Cliente " + idCliente + " esta comprando.");
            Thread.sleep(ThreadLocalRandom.current().nextInt(4000, 7001));

            cajas.acquire(); 
            System.out.println("Cliente " + idCliente + " está pagando en la caja.");

            Thread.sleep(ThreadLocalRandom.current().nextInt(2000, 4001));
            cajas.release(); 

            carritos.release();
            System.out.println("Cliente " + idCliente + " abandona el super.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
