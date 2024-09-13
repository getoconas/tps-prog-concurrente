package punto6;

public class HiloIntercambioMatrices extends Thread {
	private Integer[][] matrizPrincipal;
	private Integer[][] matrizSecundaria;
	Integer fila;
	
	public HiloIntercambioMatrices(String nombreHilo, Integer[][] matrizX, Integer[][] matrizY, Integer fila) {
		super(nombreHilo);
		matrizPrincipal = matrizX;
		matrizSecundaria = matrizY;
		this.fila = fila;
	}
	public HiloIntercambioMatrices() {
		
	}
	
	public void run() {
		for (int i = 0; i < matrizPrincipal[0].length; i++) {
			Integer auxiliar = matrizPrincipal[fila][i];
			matrizPrincipal[fila][i] = matrizSecundaria[i][fila];
			matrizSecundaria[i][fila] = auxiliar;
		}
	}
	
	public Integer[][] getMatrizPrincipal() {
		return matrizPrincipal;
	}
	
	public Integer[][] getMatrizSecundaria() {
		return matrizSecundaria;
	}
}
