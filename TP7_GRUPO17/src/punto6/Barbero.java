package punto6;

public class Barbero implements Runnable {
	private final Barberia barberia;

    public Barbero(Barberia barberia) {
        this.barberia = barberia;
    }

    @Override
    public void run() {
        while (true) {
            barberia.cortarPelo();
        }
    }
}
