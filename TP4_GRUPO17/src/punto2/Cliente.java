package punto2;

public class Cliente extends Thread {
	private Panaderia panaderia;
    private int idCliente;
    private static int idContador = 1;

    public Cliente(Panaderia panaderia) {
        this.panaderia = panaderia;
        this.idCliente = idContador++; 
    }

    @Override
    public void run() {
        panaderia.agregarCliente(this); 
		panaderia.atenderClientes();
    }

    public int getIdCliente() {
        return idCliente;
    }
}

