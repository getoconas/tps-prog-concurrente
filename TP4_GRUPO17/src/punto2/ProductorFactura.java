package punto2;

public class ProductorFactura extends Thread {
	private Panaderia panaderia;

    public ProductorFactura(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
    	while (true) {
    		panaderia.producirFactura();
    	}
    }   
}

