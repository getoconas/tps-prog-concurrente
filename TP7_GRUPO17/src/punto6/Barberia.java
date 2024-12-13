package punto6;

import java.util.concurrent.Semaphore;

public class Barberia {
	private final int numSillas;
    private int clientesEsperando;
    private final Semaphore barberoListo = new Semaphore(0);
    private final Semaphore clienteListo = new Semaphore(0);
    private final Semaphore mutex = new Semaphore(1);

    public Barberia(int numSillas) {
        this.numSillas = numSillas;
        this.clientesEsperando = 0;
    }

    public void cortarPelo() {
        try {
            clienteListo.acquire();
            System.out.println("Barbero está cortando el pelo a un cliente.");
            Thread.sleep((long) Math.random() * (2500 - 1000) + 1000);
            System.out.println("Barbero terminó de cortar el pelo.");
            barberoListo.release();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public boolean entrar() {
        try {
            mutex.acquire();
            if (clientesEsperando < numSillas) {
                clientesEsperando++;
                System.out.println("Cliente entró. Clientes esperando: " + clientesEsperando);
                mutex.release();
                clienteListo.release();
                barberoListo.acquire();
                return true;
            } else {
            	System.out.println("Cliente se fue. Barbería llena.");
                mutex.release();
                return false;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public void salir() {
        try {
            mutex.acquire();
            clientesEsperando--;
            System.out.println("Cliente salió. Clientes esperando: " + clientesEsperando);
            mutex.release();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
