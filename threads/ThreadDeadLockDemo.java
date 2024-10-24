package threads;

class A{
    synchronized void methA(B b){
        System.out.println("I am in : "+ Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Trying to call B's last Method");
        b.lastB();
    }
    synchronized void lastA(){
        System.out.println("I am in last A");
    }
}

class B{
    synchronized void methB(A a){
        System.out.println("I am in : "+ Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Trying to call A's last Method");
        a.lastA();
    }
    synchronized void lastB(){
        System.out.println("I am in last B");
    }
}

class Deadlock implements Runnable{
    Thread t;
    B b;
    A a;
    Deadlock(A a, B b){
        this.a = a;
        this.b = b;
        t = new Thread(this, "Racing thread!!!");
        t.start();
    }
    public void run(){
        b.methB(a);
    }
}

public class ThreadDeadLockDemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Deadlock d = new Deadlock(a,b);
        a.methA(b);
    }
}
