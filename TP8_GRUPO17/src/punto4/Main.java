package punto4;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
		
	private static final String directorio = "C:\\Concurrente";		// C:\Concurrente
	private static Set<String> archivosD = new HashSet<>();

	public static void main(String[] args) {
		ScheduledExecutorService executorService= Executors.newSingleThreadScheduledExecutor();
		executorService.scheduleAtFixedRate(Main::nuevos, 0, 5, TimeUnit.SECONDS);
	}
	
	public static void nuevos() {
		File carpeta = new File(directorio);
		File[] listaArchivos = carpeta.listFiles();
	    if (listaArchivos != null) {
	         for (File archivo : listaArchivos) {
	        	 //Verifica si hay algun archivo nuevo
	             if (!archivosD.contains(archivo.getName())) {
	                 System.out.println("Nuevo archivo [" + archivo.getName() + "], con tamaño [" + archivo.length() + "]");
	                 archivosD.add(archivo.getName());
	             }
	         }
	     }
	}
}
