package punto5;

import java.math.BigInteger;
import java.util.concurrent.Callable;

public class Calculo implements Callable<BigInteger> {

	@Override
	public BigInteger call() throws Exception {
		return Auxiliar.compute();
	}
	
}
