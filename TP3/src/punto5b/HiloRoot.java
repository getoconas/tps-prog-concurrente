/**
 * @author mago
 */
package punto5b;

public class HiloRoot extends Thread {
	private int root;
	
	public HiloRoot(int root) {
		this.root = root;
	}
		
	@Override
	public void run() {
		double result = SumRootN(this.root);
		System.out.println("root " + this.root + ": " + result);
	}
	
	public static double SumRootN(int root) {
        double result = 0;
        for (int i = 0; i < 10000000; i++) {
            result += Math.exp(Math.log(i) / root);
        }
        return result;
    }
}
