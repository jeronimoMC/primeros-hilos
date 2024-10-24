package hilos.ejemplo;

import hilos.ejemplo.runnable.ImprimirFrases;

//sincrinizacion de las frases
public class EjemploSincronizacionThread {
    public static void main(String[] args) {

        new Thread(new ImprimirFrases("Hola ", "que tal!")).start();
        new Thread(new ImprimirFrases("¿quién ere ", "tu?")).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Thread h3 = new Thread(new ImprimirFrases("Mucho gusto ", "Me llamo Jeronimo"));
        h3.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(h3.getState());
    }

    public synchronized static void imprimirFrases(String frase1, String frase2) {
        System.out.print(frase1);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(frase2);
    }
}
