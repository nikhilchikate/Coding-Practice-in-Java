package exception;

public class Finallydemo {
    public static void main(String[] args) {
        int a = 0, b = 10, c;
        try{
            c = b/a;
        } catch (ArithmeticException e){
            System.out.println("Exception caught"+e);
        } finally {
            System.out.println("This is a final block, I am immortal");
        }
    }
}
