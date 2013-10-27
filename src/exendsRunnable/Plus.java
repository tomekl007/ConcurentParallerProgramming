package exendsRunnable;

class Plus implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print("+");
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
            }
        }
    }
}