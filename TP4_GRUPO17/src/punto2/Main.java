package punto2;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Panaderia panaderia = new Panaderia();
	    
	    ProductorBizcocho productorBizcochos = new ProductorBizcocho(panaderia);
	    ProductorFactura productorFacturas = new ProductorFactura(panaderia);
	    productorBizcochos.start();
	    productorFacturas.start();
	
	    while (true) {
	        Cliente cliente = new Cliente(panaderia);
	        cliente.start();
	        try {
	            Thread.sleep(new Random().nextInt(701) + 800);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}
}
