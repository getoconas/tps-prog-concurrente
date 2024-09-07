/**
 * @author mago
 */
package punto1b;

public class PrintX extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.print("." + i + "X.");
		}
	}
}
