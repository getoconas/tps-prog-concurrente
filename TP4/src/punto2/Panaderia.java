package punto2;

public class Panaderia extends Thread {
	private boolean hayBizcocho = false;
	private boolean hayFactura = false;
	private int clienteActual = 1;
	
	@Override
	public void run() {
		while (true) {
			int tiempoDeLlegada = (int) (Math.random() * (1500 - 800 + 1)) + 800;
			//int tiempoDeLlegada = random.nextInt(1501 - 800) + 800;
			
			try {
				Thread.sleep(tiempoDeLlegada);
				int clienteNumero = clienteActual;
				System.out.println("El cliente " + clienteNumero + " llego a la panaderia");
				cliente();
				System.out.println("El cliente " + clienteNumero + " se retiro del local");
				System.out.println("");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void producirBizcocho() {
		try {
			while (hayBizcocho) {
				wait();
			}
			int tiempo = (int) (Math.random() * (600 - 400 + 1)) + 400;
			//int tiempo = random.nextInt(601 - 400) + 400;
			Thread.sleep(tiempo);
			hayBizcocho = true;
			System.out.println("Se ha producido un bizcocho");
			notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void producirFactura() {
		try {
			while (hayFactura) {
				wait();
			}
			int tiempo = (int) (Math.random() * (1300 - 1000 + 1)) + 1000;
			//int tiempo = random.nextInt(1301 - 1000) + 1000;
			Thread.sleep(tiempo);
			hayFactura = true;
			System.out.println("Se ha producido una factura");
			notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void cliente() {
		int clienteNumero = clienteActual;
		clienteActual++;
		try {
			while (!hayBizcocho || !hayFactura) {
				System.out.println("El cliente " + clienteNumero + " esta esperando que haya bizcocho y factura");
				wait();
			}
			int tiempo = (int) (Math.random() * (400 - 200 + 1)) + 200;
			//int tiempoDeCompra = random.nextInt(401 - 200) + 200;
			Thread.sleep(tiempo);
			System.out.println("El cliente " + clienteNumero + " compro un bizcocho y una factura");
			hayBizcocho = false;
			hayFactura = false;
			notifyAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
