package clase4.waitnot;

public class Main {

	public static void main(String[] args) {
		Saludo s = new Saludo();
		
		Personal empleado1 = new Personal("Pepe", s, false);
		Personal empleado2 = new Personal("Jose", s, false);
		Personal empleado3 = new Personal("Pedro", s, false);
		Personal jefe1 = new Personal("JEFE", s, true);
		/*Instancio los hilos y paso como parámetros:
		* Nombre del Hilo
		* Objeto en común (Saludo)
		* Booleano p/verificar si es jefe o empleado */
		
		empleado1.start(); //Lanzo los hilos
		empleado2.start();
		empleado3.start();
		jefe1.start();		
	}

}
