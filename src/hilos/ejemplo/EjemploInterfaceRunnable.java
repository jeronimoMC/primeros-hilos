package hilos.ejemplo;

import hilos.ejemplo.runnable.ViajeTarea;

public class EjemploInterfaceRunnable {
    public static void main(String[] args) {

        new Thread(new ViajeTarea("isla de pascua")).start();
        new Thread(new ViajeTarea("Tokio")).start();
        new Thread(new ViajeTarea("cancun")).start();
        new Thread(new ViajeTarea("santa Marta")).start();


    }
}
