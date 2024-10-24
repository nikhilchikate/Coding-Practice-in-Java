/*Constructor Overloading*/
package overloadingdemo;

public class Shape {
    public static void main(String[] args) {
        Shape s  = new Shape(10);
        Shape t = new Shape(3,2);
        Shape u = new Shape(6,2,3);
    }

    double a,b,c;

    Shape(double x){
        a = x;
        System.out.println("\n Area of Circle: "+(3.14*a*a));
    }

    Shape(double x, double y){
        a = x;
        b = y;
        System.out.println("\n Area of Rectangle: "+(a*b));
    }

    Shape(double x, double y, double z){
        a = x;
        b = y;
        c = z;
        System.out.println("\n Area of Cuboid: "+(a*b*c));
    }
}
