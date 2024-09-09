/**
 * @author mago
 */
package punto5b;

import java.util.Random;

public class HiloRoot extends Thread {
	
	public HiloRoot() {
		
	}
		
	@Override
	public void run() {
		int root = new Random().nextInt(20) + 1;
		double result = SumRootN(root);
		System.out.println("root " + root + ": " + result);
	}
	
	public static double SumRootN(int root) {
        double result = 0;
        for (int i = 0; i < 10000000; i++) {
            result += Math.exp(Math.log(i) / root);
        }
        return result;
    }
}
