package c02;

public class HiloCaracter implements Runnable {

    private String caracter;
    private int veces;

    public HiloCaracter(String caracter, int veces) {
        this.caracter = caracter;
        this.veces = veces;
    }

    public void run() {
        for (int i = 0; i < this.veces; i++) {
            System.out.print(this.caracter);
        }
    }
}