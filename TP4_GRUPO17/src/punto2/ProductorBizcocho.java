package punto2;

public class ProductorBizcocho extends Thread {
	private Panaderia panaderia;

    public ProductorBizcocho(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
    	while (true) {
    		panaderia.producirBizcocho();
    	}
    }
}

