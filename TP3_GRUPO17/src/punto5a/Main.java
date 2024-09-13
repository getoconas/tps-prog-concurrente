package punto5a;

public class Main {

	public static void main(String[] args) {
		long inicio,fin;
		inicio = System.currentTimeMillis();
		
		for (int j = 1; j <= 20; j++) {
			double resultado = SumRootN(j);
			System.out.println(j + " - " + resultado);
		}

		fin = System.currentTimeMillis();
		long tiempoEjecucion = fin - inicio;
		System.out.println("Tiempo de Ejecucion: " + tiempoEjecucion);
	}
	
	public static double SumRootN(int root) {
		double result=0;
		for(int i = 0; i < 10000000; i++) {
			result += Math.exp(Math.log(i)/root);
		}
		return result;
	}
}

