package zad_jeden;

import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 10/13/13
 * Time: 6:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class LiczPierwsze extends Thread {
    int left, right;
    public LiczPierwsze(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void run() {
        for (int i = left; i < right; i++) {
            int[] tab = new int[1];
            tab[0] = i;
            boolean prime = BigInteger.valueOf(i).isProbablePrime(10);
            if(prime){
                System.out.println(" prime - > : " + i + "  " + this.toString() );
            }

        }


    }

}
