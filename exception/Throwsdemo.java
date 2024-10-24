package exception;

public class Throwsdemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        try{
            d.Demo();
        } catch (ArithmeticException e){
            System.out.println("Exception caught"+e);
        }
    }
}

class Demo{
    void Demo() throws ArithmeticException{
        int a = 0, b = 10, c;
        c = b/a;
    }
}
