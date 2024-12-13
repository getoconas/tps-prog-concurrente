package punto2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		Tareas tareas = new Tareas();

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        executor.scheduleAtFixedRate(() -> tareas.Tarea1(), 2, 2, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(() -> tareas.Tarea2(), 2, 2, TimeUnit.SECONDS);
	}
}
