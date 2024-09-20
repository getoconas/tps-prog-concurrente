package punto3;

public class Principal {
    public static void main(String[] args) {
        ZooEntrarSalir zoo = new ZooEntrarSalir();
        int id = 1;

        while (true) {
	        Visitante visitante = new Visitante(id++, zoo);
            visitante.start();
            try {
                Thread.sleep((int) (Math.random() * 100) + 100); // tiempo en que dan paso para entrar o salir 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

