package multithreading;

public class Ex1 {
    public static void main(String[] args) throws InterruptedException {

       ThreadB thB =  new ThreadB();

       thB.start();
       synchronized (thB){
           thB.wait();

       }

    }

    static class ThreadB extends Thread {
        int total;
        @Override
        public void run() {
            synchronized (this) {

                for (int i = 0; i < 5; i++) {
                    total+=i;
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                notify();
            }

        }
    }
}
