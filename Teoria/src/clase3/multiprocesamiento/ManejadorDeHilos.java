package clase3.multiprocesamiento;

public class ManejadorDeHilos {

	public static void main(String[] args) {
		TareaEnUnHilo a, b;
		
		a = new TareaEnUnHilo();
		b = new TareaEnUnHilo();
		
		a.start();
		b.start();

	}

}
