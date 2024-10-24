/*Method Overloading demo*/
package overloadingdemo;

public class Mthd {
    public static void main(String[] args) {
        Mthd m = new Mthd();

        m.Area(10);
        m.Area(2,3);
        m.Area(4,3,2);
    }

    double a,b,c;

    void Area(double x){
        a = x;
        System.out.println("\n Area of Circle: "+(3.14*a*a));
    }

    void Area(double x, double y){
        a = x;
        b = y;
        System.out.println("\n Area of Rectangle: "+(a*b));
    }

    void Area(double x, double y, double z){
        a = x;
        b = y;
        c = z;
        System.out.println("\n Area of Cuboid: "+(a*b*c));
    }
}
