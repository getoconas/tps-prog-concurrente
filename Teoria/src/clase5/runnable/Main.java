package clase5.runnable;

public class Main {
	
	public static void main(String[] args) {
		TareaRb t = new TareaRb();
		
		Thread t1 = new Thread(t, "pepe");
		Thread t2 = new Thread(t, "ana");
		Thread t3 = new Thread(t, "juan");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
