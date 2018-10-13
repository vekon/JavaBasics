public class ThreadYieldExample {

    public static void main(String[] args) {
        ThreadExample1 threadExample1 = new ThreadExample1();
        ThreadExample2 threadExample2 = new ThreadExample2();
        ThreadExample3 threadExample3 = new ThreadExample3();
    }
}

class ThreadExample1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Hi This is Thread example 1");
        Thread.yield();
    }

    ThreadExample1() {
        System.out.println("Thread 1 construction started");

        Thread t = new Thread(this);
        t.start();
    }
}

class ThreadExample2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Hi This is Thread example 2");
        Thread.yield();
    }

    ThreadExample2() {
        System.out.println("Thread 2 construction started");

        Thread t = new Thread(this);
        t.start();
    }
}

class ThreadExample3 implements Runnable {
    @Override
    public void run() {
        System.out.println("Hi This is Thread example 3");
        Thread.yield();
    }

    ThreadExample3() {
        System.out.println("Thread 3 construction started");

        Thread t = new Thread(this);
        t.start();
    }
}
