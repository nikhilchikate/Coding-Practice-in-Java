package inheritance_interface;

interface T1{
    final int x = 10;
    public void dispT1();
    public void dispT2();
}

interface T2 extends T1{
    public void dispT3();
}

class Demo2 implements T1, T2{
    void show(){
        System.out.println("I am in show");
    }
    public void dispT1(){
        System.out.println("I am in dispT1");
    }
    public void dispT2(){
        System.out.println("I am in dispT2");
    }
    public void dispT3(){
        System.out.println("I am in dispT3");
    }
}

public class Interface_inheritance {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.show();
        d.dispT1();
        d.dispT2();
        d.dispT3();
    }
}
