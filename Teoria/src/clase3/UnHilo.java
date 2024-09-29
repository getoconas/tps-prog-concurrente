package clase3;

public class UnHilo extends Thread {
	
	public UnHilo(String nombreHilo) {
		super(nombreHilo);
	}
	
	@Override
	public void run() {
		System.out.println(getName());
	}
}
