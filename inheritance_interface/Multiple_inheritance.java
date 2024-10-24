package inheritance_interface;

class D {
    int d = 10;
    void show() {
        System.out.println("I am in D class and show fn");
    }
}

class E extends D {
    int e = 20;
    void disp() {
        System.out.println("I am in E class and disp fn");
    }
}

class F extends E{
    int f = 30;
    void fun(){
        System.out.println("I am in F class and fun fn");
    }

}

public class Multiple_inheritance {
    public static void main(String[] args) {
        F f = new F();
        System.out.println("Value of d: "+f.d);
        System.out.println("Value of e: "+f.e);
        System.out.println("Value of f: "+f.f);
        f.show();
        f.disp();
        f.fun();
    }
}
