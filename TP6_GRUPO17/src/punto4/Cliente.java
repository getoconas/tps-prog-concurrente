package punto4;

public class Cliente implements Runnable {
	private final int idCliente;
    private final Supermercado supermercado;
    
    public Cliente(int idCliente, Supermercado supermercado) {
        this.idCliente = idCliente;
        this.supermercado = supermercado;
    }
    
	@Override
	public void run() {
		supermercado.entrarSupermercado(idCliente);
	}
}
