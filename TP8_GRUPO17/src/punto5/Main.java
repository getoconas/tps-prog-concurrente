package punto5;

import java.math.BigInteger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
	public static void main(String[] args) {
		ExecutorService hilosCalculos = Executors.newFixedThreadPool(2);
		
		for (int i = 0; i < 6; i++) {
			try {
				Future<BigInteger> resultadoCalculo = hilosCalculos.submit(new Calculo());
				System.out.println(resultadoCalculo.get());
			} catch (Exception e) {
				
			}
		}
	}
}
