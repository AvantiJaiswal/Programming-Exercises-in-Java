package Area;
import java.lang.Math;
import java.util.Scanner;

public interface Shapes {
    double area(double a,double b);
}
public class Circle implements Shapes{
    public double area(double r,double pi){
        double a = pi*Math.pow(r,2);
        return (a);
    }
}
public class Triangle implements Shapes{
    @Override
    public double area(double b, double h) {
        double a = 0.5*b*h;
        return (a);
    }
}
public class Cylinder implements Shapes{
    @Override
    public double area(double r, double h) {
        double a = (22/7)*Math.pow(r,2)*h;
        return (a);
    }
}
public class ShapesFactory {
    public Shapes shapeIs(String s){
        if(s==null || s.isEmpty()){
           return null;
        }
        switch(s) {
            case "Circle":
                return new Circle();
            case "Triangle":
                return new Triangle();
            case "Cylinder":
                return new Cylinder();
            default:
                throw new IllegalArgumentException("Unknown shape " + s);
        }
    }
}
public class AreaOfShapes {
    public static void main(String args[]){

        System.out.println("Enter shape: ");
        Scanner scan = new Scanner(System.in);
        String string = scan.next();

        System.out.println("Enter measurements: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        ShapesFactory shapesFactory = new ShapesFactory();
        Shapes shapes = shapesFactory.shapeIs(string);
        System.out.println("The area of " + string + " " + shapes.area(a,b));
    }
}
