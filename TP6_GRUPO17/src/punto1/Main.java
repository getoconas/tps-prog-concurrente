package punto1;

public class Main {

	public static void main(String[] args) {
		Estacionamiento estacionamiento = new Estacionamiento();
		
		for (int i = 1; i <= 100; i++) {
            new Auto(estacionamiento, i).start();
            try {
            	//Se podria incluir msj de "Auto nro espera a ingresar"pero se hace engorroso al compilar
                Thread.sleep(200); // Simula llegada de autos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}
}
