package punto5;

import java.math.BigInteger;

public class Auxiliar {
	private static long[] vector = new long[] {100477L, 105477L, 112986L, 100078L, 165987L, 142578L};
	private static BigInteger M = new BigInteger("1999");
	private static int indice = 0;
	
	public static BigInteger compute() {
		BigInteger resultado = compute(vector[indice]);
		indice ++;
		return resultado;
	}

	private static BigInteger compute(long n) {
		String s = "";
		
		for (long i = 0; i < n; i++) {
			s = s + n;
		}
		return new BigInteger(s.toString()).mod(M);
	}
}
