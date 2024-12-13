package punto3b;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class EstacionDePeaje extends Thread {
	
	static Semaphore semaphore = new Semaphore(3);
	private Semaphore mutex= new Semaphore(1);
	static Random random = new Random();
	private boolean disponible;
	private String idPeaje;
	private String idAuto;
	
	public EstacionDePeaje(boolean disponible, String idPeaje, String idAuto) {
		super();
		this.disponible = disponible;
		this.idPeaje = idPeaje;
		this.idAuto = idAuto;
	}
	
	@Override
	public void run() {
		if (this.disponible) {
			try {
				mutex.acquire();
				System.out.println("Peaje(" + this.idPeaje + ")"
						+ " no disponible temporalmente " + Thread.currentThread().getName());
				Thread.sleep(15000);
				System.out.println("Peaje(" + this.idPeaje + ") "
						+ "disponible " + Thread.currentThread().getName());
				System.out.println("Auto(" + this.idAuto + ") "
						+ "ingresando a estacionar pasando por el peaje"
						+ "(" + this.idPeaje + ") " + Thread.currentThread().getName());
				semaphore.acquire();
				System.out.println("Lugares permitidos --- " + semaphore.availablePermits());
				System.out.println("Auto(" + this.idAuto + ") paso por peaje"
						+ "(" + this.idPeaje + "),"
								+ " esta estacionado " + Thread.currentThread().getName());
				Thread.sleep(aleatorio());
				System.out.println("Auto(" + this.idAuto + ") "
						+ "saliendo del estacionamiento " + Thread.currentThread().getName());
				mutex.release();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaphore.release();
			}
		} else {
			try {		
				mutex.acquire();
				System.out.println("Auto(" + this.idAuto + ") ingresando a estacionar pasando por el peaje"
						+ "(" + this.idPeaje + ") " + Thread.currentThread().getName());
				semaphore.acquire();
				System.out.println("Lugares permitidos --- " + semaphore.availablePermits());
				System.out.println("Auto(" + this.idAuto + ") paso por peaje"
						+ "(" + this.idPeaje + "), esta estacionado " + Thread.currentThread().getName());
				Thread.sleep(aleatorio());
				System.out.println("Auto(" + this.idAuto + ") "
						+ "saliendo del estacionamiento "+Thread.currentThread().getName());
				mutex.release();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaphore.release();
			}
		}
	}
	
	public static int aleatorio() {
		int aleatorio = random.nextInt(1, 3);
		
		switch (aleatorio) {
			case 1: 
				return 1000;
			case 2:
				return 2000;
		}
		return 3000;
	}
}
