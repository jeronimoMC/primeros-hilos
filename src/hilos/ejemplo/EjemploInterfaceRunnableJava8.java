package hilos.ejemplo;

import hilos.ejemplo.runnable.ViajeTarea;

public class EjemploInterfaceRunnableJava8 {
    public static void main(String[] args) throws InterruptedException {

        Thread main = Thread.currentThread();

        Runnable viaje = () -> {
                for (int i = 0 ; i < 10; i++){
                    System.out.println(i +  " - " + Thread.currentThread().getName())  ;
                    try {
                        Thread.sleep((long) (Math.random() * 1000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("finalmente me voy de viaje a:" + Thread.currentThread().getName());
            System.out.println(main.getState());
        };

        Thread v1 = new Thread( viaje, "isla de pascua");
        Thread v2 = new Thread(viaje, "Tokio");
        Thread v3 = new Thread(viaje, "cancun");
        Thread v4 = new Thread(viaje, "calarca");

        v1.start();
        v2.start();
        v3.start();
        v4.start();
        v1.join();
        v2.join();
        v3.join();
        v4.join();

       // Thread.sleep(7000);
        System.out.println( "continuando con la ejecicion del metodo main: " + main.getName());

    }
}
