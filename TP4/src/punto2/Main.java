package punto2;

public class Main {

	public static void main(String[] args) {
		Panaderia panaderia = new Panaderia();
		
		Thread producirBizcocho = new Thread(() -> {
			while (true) {
				panaderia.producirBizcocho();
			}
		});
		
		Thread producirFactura = new Thread(() -> {
			while (true) {
				panaderia.producirFactura();
			}
		});
		
		panaderia.start();
		producirBizcocho.start();
		producirFactura.start();
	}

}
