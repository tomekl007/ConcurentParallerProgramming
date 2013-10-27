package exendsRunnable;

public class TworzenieWatkow2 {
    public static void main(String[] args) {
        Thread g = new Thread(new Gwiazdka());
        Thread p = new Thread(new Plus());
        g.start();
        p.start();
        System.out.print("KONIEC");
    }
}