package clase5.supermarket.sinhilo;

public class Cajera {
	private String nombre;
	
	public Cajera(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void procesarCompra(Cliente cliente, long timeStamp) {
		System.out.println("La cajera " + this.nombre
				+ " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + cliente.getNombre()
				+ " EN EL TIEMPO " + (System.currentTimeMillis() - timeStamp) / 1000 + " seg");
		
		for (int i = 0; i < cliente.getCarroCompra().length; i++) {
			this.esperarXSegundos(cliente.getCarroCompra()[i]);
			System.out.println("Procesando el producto " + (i + 1)
					+ " -> Tiempo " + (System.currentTimeMillis() - timeStamp) / 1000 + " seg");
			System.out.println("La cajera " + this.nombre
					+ " HA TERMINADO DE PROCESAR " + cliente.getNombre() + " EN EL TIEMPO "
					+ (System.currentTimeMillis() - timeStamp) / 1000 + " seg");
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
