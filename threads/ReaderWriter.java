package threads;

import java.util.concurrent.Semaphore;

class RW {
    int rd = 0;
    Semaphore x, w;

    RW() {
        x = new Semaphore(1);
        w = new Semaphore(1);
    }

    public void read() {
        try {
            x.acquire();
            rd++;
            if (rd == 1)
                w.acquire(1);
            x.release();
            System.out.println("Reader " + rd + " is reading");
            x.acquire();
            rd--;
            if (rd == 0)
                w.release();
            x.release();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void write() {
        try {
            w.acquire();
            System.out.println("Writer is writing");
            w.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Reader implements Runnable {
    RW rw;
    Thread t;

    Reader(RW rw) {
        this.rw = rw;
        t = new Thread(this, "Reader");
        t.start();
    }

    @Override
    public void run() {
        rw.read();
    }
}

class Writer implements Runnable {
    RW rw;
    Thread t;

    Writer(RW rw) {
        this.rw = rw;
        t = new Thread(this, "Writer");
        t.start();
    }

    @Override
    public void run() {
        rw.write();
    }
}

public class ReaderWriter {
    public static void main(String[] args) {
        RW rw = new RW();
        Reader r1 = new Reader(rw);
        Reader r2 = new Reader(rw);
        Writer w1 = new Writer(rw);
        Writer w2 = new Writer(rw);
        Reader r3 = new Reader(rw);
        Reader r4 = new Reader(rw);
        Writer w3 = new Writer(rw);
    }
}