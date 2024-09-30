package clase5.supermarket.thread;

public class CajeraThread extends Thread {
	private String nombre;
	private Cliente cliente;
	private long initialTime;
	
	public CajeraThread(String nombre, Cliente cliente, long initialTime) {
		super();
		this.nombre = nombre;
		this.cliente = cliente;
		this.initialTime = initialTime;
	}
	
	@Override
	public void run() {
		System.out.println("La cajera " + this.nombre
				+ " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + cliente.getNombre()
				+ " EN EL TIEMPO " + (System.currentTimeMillis() - this.initialTime) / 1000 + " seg");
		
		for (int i = 0; i < cliente.getCarroCompra().length; i++) {
			this.esperarXSegundos(cliente.getCarroCompra()[i]);
			System.out.println("Procesando el producto " + (i + 1)
					+ " -> Tiempo " + (System.currentTimeMillis() - this.initialTime) / 1000 + " seg");
			System.out.println("La cajera " + this.nombre
					+ " HA TERMINADO DE PROCESAR " + cliente.getNombre() + " EN EL TIEMPO "
					+ (System.currentTimeMillis() - this.initialTime) / 1000 + " seg");
		}
	}
	
	private void esperarXSegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
