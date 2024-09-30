package clase5.cerouno.runnable;

public class HiloMostrarCeroRunnable implements Runnable {
	private Thread t;
	
	public HiloMostrarCeroRunnable() {
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		for (int f = 1; f <= 1000; f++) {
			System.out.print("0-");
		}
	}
}
