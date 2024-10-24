package inheritance_interface;

interface Test{
    final int x = 5;
    public void disp1();
    public void disp2();
}

class Demo implements Test{
    void show(){
        System.out.println("I am in show function");
    }

    public void disp1(){
        System.out.println("I am in Disp1 function");
    }

    public void disp2(){
        System.out.println("I am in Disp2 function");
    }
}

public class Simple_interface {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
        d.disp1();
        d.disp2();
    }
}
