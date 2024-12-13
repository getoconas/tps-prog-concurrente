package punto1;

import java.util.concurrent.Semaphore;

public class Estacionamiento {
	private final int capacidad = 20;
    private int autosActuales = 0;
    private final Semaphore entrada1 = new Semaphore(1); 
    private final Semaphore entrada2 = new Semaphore(1); 
    private final Semaphore salida1 = new Semaphore(1);
    private final Semaphore salida2 = new Semaphore(1); 
    
    public void entrar(int id) throws InterruptedException {
        Semaphore entradaElegida = (Math.random() < 0.5) ? entrada1 : entrada2; // Elegir aleatoriamente la entrada
        entradaElegida.acquire(); // Adquirir el semáforo de la entrada elegida

        try {
            while (autosActuales >= capacidad) {
                entradaElegida.release(); 
                Thread.sleep(200); // 
                entradaElegida.acquire(); // Intentar adquirir la entrada de nuevo
            }
            autosActuales++;
            int entradaNumero = (entradaElegida == entrada1) ? 1 : 2;
            System.out.println("Auto " + id + " ha ingresado por entrada " 
            		+ entradaNumero + ". Autos actuales: " + autosActuales);
        } finally {
            entradaElegida.release(); 
        }
    }
    
    public void salir(int id) throws InterruptedException {
        Semaphore salidaElegida = (Math.random() < 0.5) ? salida1 : salida2; // Elegir aleatoriamente la salida
        salidaElegida.acquire(); // Adquirir el semáforo de la salida elegida

        try {
            if (autosActuales > 0) { // Solo permite salir si hay autos, evita negativos 
                autosActuales--;
                int salidaNumero = (salidaElegida == salida1) ? 1 : 2;
                System.out.println("Auto " + id + " ha salido por salida " 
                		+ salidaNumero + ". Autos actuales: " + autosActuales);
            } 
        } finally {
            salidaElegida.release();
        }
    }
}

