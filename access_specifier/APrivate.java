package access_specifier;

//public class APrivate {
//    public static void main(String[] args) {
//        A obj = new A();
//        System.out.println(obj.data); //compile time error
//        obj.msg();
//    }
//}
//
//class A{
//    private int data = 40;
//    private void msg(){
//        System.out.println("Private Access Specifier DEMO");
//    }
//}

/*
.\APrivate.java:6: error: data has private access in A
        System.out.println(obj.data); //compile time error
                              ^
.\APrivate.java:7: error: msg() has private access in A
        obj.msg();
           ^
2 errors
*/
