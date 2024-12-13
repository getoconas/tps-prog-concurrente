package punto6;

public class Cliente implements Runnable {
	private static int contadorClientes = 0;
    private final int id;
    private final Barberia barberia;

    public Cliente(Barberia barberia) {
        this.id = ++contadorClientes;
        this.barberia = barberia;
    }

    @Override
    public void run() {
    	System.out.println("Cliente " + id + " intenta entrar.");
        if (barberia.entrar()) {
            System.out.println("Cliente " + id + " está recibiendo un corte de pelo.");
            barberia.salir();
            System.out.println("Cliente " + id + " salió de la barbería.");
        }
    }
}
