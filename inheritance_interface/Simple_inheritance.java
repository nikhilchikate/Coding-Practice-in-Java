package inheritance_interface;

class A{
    int a = 10;
    void show(){
        System.out.println("I am in class A show fn");
    }
}

class B extends A{
    int b = 20;
    void disp(){
        System.out.println("I am in class B disp fn");
    }
}

public class Simple_inheritance {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        System.out.println("Value of a: "+ b.a);
        b.disp();
        System.out.println("Value of b: "+ b.b);
    }
}
