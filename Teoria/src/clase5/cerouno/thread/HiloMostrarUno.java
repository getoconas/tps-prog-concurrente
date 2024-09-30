package clase5.cerouno.thread;

public class HiloMostrarUno extends Thread {
	@Override
	public void run() {
		for (int f = 1; f <= 1000; f++) {
			System.out.print("1-");
		}
	}
}
