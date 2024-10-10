package punto3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();

		List<String> urls = List.of(
					"https://eltribunodejujuy.com/policiales/2024-9-24-20-6-0-fue-agredido-de-un-botellazo-en-la-cabeza",
					"https://eltribunodejujuy.com/policiales/2024-9-25-21-46-0-abuso-de-su-hermana-y-fue-condenado-a-ocho-anos",
					"https://eltribunodejujuy.com/policiales/2024-9-25-21-56-0-la-justicia-no-actuo-de-forma-arbitraria-dijo-el-fiscal-mora",
					"https://eltribunodejujuy.com/policiales/2024-9-25-19-56-0-robo-a-un-remisero-y-fue-atrapado-por-transeuntes",
					"https://eltribunodejujuy.com/policiales/2024-9-25-12-34-0-el-jefe-comunal-de-tres-cruces-sergio-mamani-sufrio-un-accidente-de-transito",
					"https://eltribunodejujuy.com/policiales/2024-9-24-20-6-0-pareja-fue-asaltada-y-herida-con-un-elemento-cortante",
					"https://eltribunodejujuy.com/policiales/2024-9-25-21-26-0-gritos-y-amenazas-a-un-fiscal-tras-lectura-de-fallo",
					"https://eltribunodejujuy.com/policiales/2024-9-24-0-55-0-transportistas-salvan-sus-vidas-tras-un-vuelco",
					"https://eltribunodejujuy.com/policiales/2024-9-24-0-55-0-ordeno-el-desalojo-de-la-propietaria-de-una-vivienda",
					"https://eltribunodejujuy.com/policiales/2024-9-24-1-0-0-arrojaron-bomba-molotov-a-una-casa"
				);
		
		List<Thread> hilos = new ArrayList<>();

        for (String url : urls) {
            Thread hilo = new Thread(new Noticia(url));
            hilos.add(hilo);
            hilo.start();
        }

        for (Thread hilo : hilos) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long fin = System.currentTimeMillis();
        System.out.println("Tiempo de ejecucion: " + (fin - inicio) + " ms");
	}
}
