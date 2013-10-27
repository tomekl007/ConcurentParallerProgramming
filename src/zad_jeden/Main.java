package zad_jeden;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 10/13/13
 * Time: 6:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        LiczPierwsze jeden = new LiczPierwsze(1000000, 2000000);
        LiczPierwsze dwa = new LiczPierwsze(2000000, 3000000);
        LiczPierwsze trzy = new LiczPierwsze(3000000, 4000000);
        jeden.run();
        dwa.run();
        trzy.run();
        trzy.join();
        System.out.println("Tomasz Lelek");


    }
}
