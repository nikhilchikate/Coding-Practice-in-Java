package threads;

class PC {
    boolean flag = false;
    int n;

    synchronized void put(int n) {
        if (flag == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.n = n;
        System.out.println("Produced" + n);
        flag = true;
        notify();
    }

    synchronized int get() {
        if (flag == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = false;
        System.out.println("Consumed" + n);
        notify();
        return n;
    }
}

class Producer implements Runnable {
    Thread t;
    PC q;

    Producer(PC q) {
        this.q = q;
        t = new Thread(this, "Producer");
        t.start();
    }

    @Override
    public void run() {
        int i = 1;
        while (i <= 20)
            q.put(i++);
    }
}

class Consumer implements Runnable {
    Thread t;
    PC q;

    Consumer(PC q) {
        this.q = q;
        t = new Thread(this, "Consumer");
        t.start();
    }

    @Override
    public void run() {
        int j = 1;
        while (j <= 20) {
            q.get();
            j++;
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        PC q = new PC();
        Producer ob1 = new Producer(q);
        Consumer ob2 = new Consumer(q);

        try {
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
