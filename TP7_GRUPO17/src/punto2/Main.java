package punto2;

public class Main {
	public static void main(String[] args) {
		Thread[] auto = new Thread[4];
		for(int i = 0; i < auto.length; i++) {
			auto[i] = new Thread(new Cruce(i + 1));
			auto[i].start();
		}
	}
}
