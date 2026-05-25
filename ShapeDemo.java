interface Shape{
    double area();
    double perimeter();
}
abstract class Polygon{
    abstract int numberOfSides();
}
class Circle implements Shape{
    double radius;
    Circle(double radius)
    {
        this.radius = radius;
    }
    public double area()
    {
        return 3.14 * radius * radius;
    }
    public double perimeter()
    {
        return 2 * 3.14 * radius;
    }
}
class Square extends Polygon implements Shape{
    double side;
    Square(double side)
    {
        this.side = side;
    }
    public double area(){
        return side * side;
    }
    public double perimeter(){
        return 4 * side;
    }
    int numberOfSides(){
        return 4;
    }
}
public class ShapeDemo{
    public static void main(String[] args){
        Circle c = new Circle(5);
        Square s = new Square(4);
        System.out.println("Circle Area : "+c.area());
        System.out.println("Circle Perimeter : "+c.perimeter());
        System.out.println();
        System.out.println("Square Area : "+s.area());
        System.out.println("Square Perimeter : "+s.perimeter());
        System.out.println("number of sides : "+s.numberOfSides());
    }
}