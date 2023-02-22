package pg01;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class c04 {
	/*public static void main(String[] args) {
		// ExecutorService exe = Executors.newCachedThreadPool(); // Crea una pool de hilos de executors
		// ExecutorService exe = Executors.newFixedThreadPool(1); // Un unico hilo a la vez
		// ExecutorService exe = Executors.newSingleThreadExecutor(); // No salen los hilos ??
		ExecutorService exe = Executors.newFixedThreadPool(3);
				
		exe.execute(new HiloCaracter("A",1000000));
		exe.execute(new HiloCaracter("B",1000000));
		exe.execute(new HiloCaracter("C",1000000));
		exe.execute(new HiloCaracter("D",1000000));
		exe.execute(new HiloCaracter("E",1000000));
		exe.execute(new HiloCaracter("F",1000000));
		
		exe.shutdown();
        /*
		Thread t1 = new Thread(new HiloCaracter("X",100));
        Thread t2 = new Thread(new HiloCaracter("-",100));
        Thread t3 = new Thread(new HiloCaracter("O",100));

        t1.start();
        t1.setPriority(5);

        t2.start();
        t2.setPriority(10);

        t3.start();
        t3.setPriority(3);
		*/
	//}
}