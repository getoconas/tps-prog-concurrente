package punto2;

import java.util.concurrent.Semaphore;

public class Cruce extends Thread {
	int auto;
	Semaphore semC1 = new Semaphore(1);
	Semaphore semC2 = new Semaphore(1);
	Semaphore semC3 = new Semaphore(1);
	Semaphore semC4 = new Semaphore(1);
	
	public Cruce(int auto) {
		this.auto = auto;
	}
	
	public void run() {
		try {
			switch (auto){
				case 1: //Norte a Sur
					semC3.acquire();
					semC4.acquire();
					System.out.println("Auto " + auto + " cruzando de Norte a Sur");
					Thread.sleep(1000); //Tiempo de simulación de cruce
					semC3.release();
					semC4.release();
					break;
				case 2: //Este a Oeste
					semC3.acquire();
					semC2.acquire();
					System.out.println("Auto " + auto + " cruzando de Este a Oeste");
					Thread.sleep(1000); //Tiempo de simulación de cruce
					semC3.release();
					semC2.release();
					break;
				case 3: //Sur a Norte
					semC1.acquire();
					semC2.acquire();
					System.out.println("Auto " + auto + " cruzando de Sur a Norte");
					Thread.sleep(1000); //Tiempo de simulación de cruce
					semC2.release();
					semC1.release();
					break;
				case 4: //Oeste a Este
					semC1.acquire();
					semC4.acquire();
					System.out.println("Auto " + auto + " cruzando de Oeste a Este");
					Thread.sleep(1000); //Tiempo de simulación de cruce
					semC1.release();
					semC4.release();
					break;
				default:
					break;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
