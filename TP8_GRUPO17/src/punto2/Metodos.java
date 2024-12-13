package punto2;

import java.io.FileWriter;
import java.io.IOException;

public class Metodos {
	public boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public void guardarEnArchivo(String nombreArchivo, int numero) {
        try (FileWriter writer = new FileWriter(nombreArchivo, true)) {
            writer.write(numero + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
