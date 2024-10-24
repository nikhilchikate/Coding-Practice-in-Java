package inheritance_interface;

class P{
    int a = 10;
    void show(){
        System.out.println("I am in P : Show");
    }
}

class Q extends P{
    int b = 20;
    void dispQ(){
        System.out.println("I am in Q : dispQ");
    }
}

class R extends P{
    int c = 25;
    void displR(){
        System.out.println("I am in R : dispR");
    }
}

public class Hierarchical_inheritance {
    public static void main(String[] args) {
        R r = new R();
        Q q = new Q();
        q.show();
        q.dispQ();
        r.show();
        r.displR();
        System.out.println("Value of a : "+q.a);
        System.out.println("Value of b : "+q.b);
        System.out.println("Value of a : "+r.a);
        System.out.println("Value of c : "+r.c);
    }
}
