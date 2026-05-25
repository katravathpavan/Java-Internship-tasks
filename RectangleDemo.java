class Rectangle{
    int length;
    int width;
    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    int area(){
        return length * width;
    }
    int perimeter(){
        return 2 * (length + width);
    }
    public class RectangleDemo{
        public static void main(String[] args)
        {
            Rectangle rect1 = new Rectangle(8,5);
            Rectangle rect2 = new Rectangle(9,7);
            Rectangle rect3 = new Rectangle(10,2);
            System.out.println("Rectangle 1");
            System.out.println("Area : "+ rect1.area());
            System.out.println("perimeter : "+rect1.perimeter());
            System.out.println("Rectangle 2");
            System.out.println("Area : "+ rect2.area());
            System.out.println("perimeter : "+rect2.perimeter());
            System.out.println("Rectangle 3");
            System.out.println("Area : "+ rect3.area());
            System.out.println("perimeter : "+rect3.perimeter());
        }
    }
}
