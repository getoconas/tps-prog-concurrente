package punto1;

import java.util.concurrent.Semaphore;

public class Semaforos {
	 public static int x = 0;

    public static Semaphore s1 = new Semaphore(1); 
    public static Semaphore s2 = new Semaphore(0);
    
    public static class P1 extends Thread {
        public void run() {
            try {
                s2.acquire();          
                s1.acquire();          
                x = 2 * x;            
                System.out.println("P1 ----> x = " + x);
                s1.release();      
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class P2 extends Thread {
        public void run() {
            try {
                s1.acquire();          
                x = x * x;            
                System.out.println("P2 ----> x = " + x);
                s1.release();          
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

 
    public static class P3 extends Thread {
        public void run() {
            try {
            	Thread.sleep(500); 
                s1.acquire();          
                x = x + 3;             
                System.out.println("P3 ----> x = " + x);
                s2.release();          
                s1.release();         
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
