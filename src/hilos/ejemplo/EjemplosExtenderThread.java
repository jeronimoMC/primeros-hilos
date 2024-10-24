package hilos.ejemplo;

import hilos.ejemplo.threads.NombreThread;

public class EjemplosExtenderThread {
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new NombreThread("jero");
        hilo.start();
       // Thread.sleep(100);
        Thread hilo2 = new NombreThread("jaco");
        hilo2.start();
        Thread hilo3 = new NombreThread("papas");
        hilo3.start();
        System.out.println(hilo.getState());
    }
}
