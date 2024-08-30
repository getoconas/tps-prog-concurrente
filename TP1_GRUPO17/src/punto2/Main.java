package punto2;

public class Main {

	public static void main(String[] args) { 
		CuentaSueldo cuentaSueldo1 = new CuentaSueldo(38423011, 50000.00, 10,3000,"MERCADO PAGO", "1");
		cuentaSueldo1.mostrarDatos();
		System.out.println("------------------------------------------------------");
		
		// Retirar monto menor a tope
		cuentaSueldo1.retirar(10000.00);
		System.out.println("------------------------------------------------------");
		
		// Transferencia por cbu
		cuentaSueldo1.transferir(120000.00, 80559843417474329L);
		System.out.println("------------------------------------------------------");
		
		// Transferencia por alias
		cuentaSueldo1.transferir(30000.00, "FiUnju20");
	}
}
