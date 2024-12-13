package punto2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Tareas {
	private final List<String> listaTiempos = new ArrayList<>();
    private final Metodos metodos = new Metodos();

    public void Tarea1() {
        String tiempoActual = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss:S"));
        listaTiempos.add(tiempoActual);
        System.out.println("Hora actual agregada a la lista: " + tiempoActual);
    }

    public void Tarea2() {
        if (!listaTiempos.isEmpty()) {
            String ultimoTiempo = listaTiempos.get(listaTiempos.size() - 1);
            int ultimoNumero = Integer.parseInt(ultimoTiempo.split(":")[3]); 

            if (metodos.esPrimo(ultimoNumero)) {
                metodos.guardarEnArchivo("Primos.txt", ultimoNumero);
                System.out.println(ultimoNumero + " es primo. Guardado en Primos.txt");
            } else {
                metodos.guardarEnArchivo("NoPrimos.txt", ultimoNumero);
                System.out.println(ultimoNumero + " no es primo. Guardado en NoPrimos.txt");
            }
        }
    }
}
