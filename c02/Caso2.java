package c02;

public class Caso2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new HiloCaracter("X",100));
        Thread t2 = new Thread(new HiloCaracter("-",100));
        Thread t3 = new Thread(new HiloCaracter("O",100));

        t1.start();
        t1.setPriority(5);

        t2.start();
        t2.setPriority(10);

        t3.start();
        t3.setPriority(3);
    }
}