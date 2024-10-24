package basic_prog;

public class ThisDemo {
    public ThisDemo() {
    }

    public static void main(String[] var0) {
        new Demo(80, 90);
    }
}

class Demo {
    int a = 10, b = 20;

    Demo(int a, int b) {
        System.out.print("\n"+a + " " + b);
        System.out.print("\n" + this.a + " " + this.b);
    }
}
