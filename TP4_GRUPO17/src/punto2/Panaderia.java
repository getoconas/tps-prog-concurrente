package punto2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Panaderia {
	private int bizcochos = 0;
    private int facturas = 0;
    private final Queue<Cliente> colaClientes = new LinkedList<>();

    public synchronized void producirBizcocho() {
        try {
            while (bizcochos > 0) {
                wait();
            }
            Thread.sleep(new Random().nextInt(201) + 400);
            bizcochos++;
            System.out.println("Se ha producido un bizcocho. Cantidad de bizcochos en el mostrador: " + bizcochos);
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void producirFactura() {
        try {
            while (facturas > 0) {
                wait();
            }
            Thread.sleep(new Random().nextInt(301) + 1000);
            facturas++;
            System.out.println("Se ha producido una factura. Cantidad de facturas en el mostrador: " + facturas);
            notifyAll();
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }
    }

    public synchronized void agregarCliente(Cliente cliente) {
        colaClientes.add(cliente);
        System.out.println("El cliente " + cliente.getIdCliente() + " llego y esta esperando en la cola.");
        notifyAll();
    }

    public synchronized void atenderClientes() {
        try {
            while (colaClientes.isEmpty() || bizcochos == 0 || facturas == 0) {
                wait();
            }
            Cliente cliente = colaClientes.poll();
            if (cliente != null) {
                Thread.sleep(new Random().nextInt(201) + 200);
                bizcochos--;
                facturas--;
                System.out.println("El cliente " + cliente.getIdCliente() + " compro un bizcocho y una factura, por lo que se retira.");
                if (bizcochos == 0 && facturas == 0) {
                    System.out.println("El mostrador esta vacio.");
                }
                notifyAll();
            }
        } catch (InterruptedException e) {
        	e.printStackTrace();        
        }
    }

}
