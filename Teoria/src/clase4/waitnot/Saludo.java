package clase4.waitnot;

public class Saludo {
	boolean llegoJefe;
	
	public Saludo() {
		
	}
	
	public synchronized void saludoEmpleado(String nombre) {
		try {
			if (!llegoJefe) {
				wait();
			}
			System.out.println("\n" + nombre.toUpperCase() + "-: Buenos dias jefe");
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	
	public synchronized void saludoJefe(String nombre) {
		System.out.println("\n" + nombre.toUpperCase() + "-: Buenos dias empleados");
		llegoJefe = true;
		notifyAll();
	}
}
