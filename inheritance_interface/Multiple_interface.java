package inheritance_interface;

interface Test2{
    final int x = 4;
    public void disp1();
    public void disp2();
}

interface Test1{
    public void disp3();
}

class Demo1 implements Test2, Test1{
    void show(){
        System.out.println("\n I am in show fn.");
    }
    public void disp1(){
        System.out.println("\n I am in disp1");
    }
    public void disp2(){
        System.out.println("\n I am in disp2");
    }
    public void disp3(){
        System.out.println("\n I am in disp3");
    }
}

public class Multiple_interface {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.show();
        d.disp1();
        d.disp2();
        d.disp3();
    }
}
