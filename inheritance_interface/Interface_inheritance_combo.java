package inheritance_interface;

interface T3{
    final int x = 10;
    public void disp31();
    public void disp32();
}

class T4{
    void disp41(){
        System.out.println("I am in T4 Class display");
    }
}

class Demo4 extends T4 implements T3{
    void show(){
        System.out.println("I am in show fn");
    }
    public void disp31(){
        System.out.println("I am in disp31");
    }
    public void disp32(){
        System.out.println("I am in disp32");
    }
}
public class Interface_inheritance_combo {
    public static void main(String[] args) {
        Demo4 d = new Demo4();
        d.show();
        d.disp31();
        d.disp32();
        d.disp41();
    }
}
