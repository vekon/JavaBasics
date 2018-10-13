public class PrintNumbersThread extends Thread {

    public static void main(String[] args) {
        ThreadExtendingThread threadExtendingThread = new ThreadExtendingThread();
        threadExtendingThread.start();
        ThreadImplementingRunnable threadImplementingRunnable = new ThreadImplementingRunnable();
        threadImplementingRunnable.startThread();
    }

}

class ThreadExtendingThread extends Thread {
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Extending thread : "+(i+1));
        }
    }
}

class ThreadImplementingRunnable implements Runnable {

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Implementing thread : "+(i+1));
        }
    }

    public void startThread() {
        Thread thread = new Thread(this);
        thread.start();
    }
}