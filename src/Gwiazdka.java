class Gwiazdka extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
            try {
                sleep(0);
            } catch (InterruptedException e) {
            }

        }
    }
}