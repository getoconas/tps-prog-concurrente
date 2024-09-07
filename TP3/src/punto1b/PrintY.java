package punto1b;

public class PrintY extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.print("." + i + "Y.");
		}
	}
}
