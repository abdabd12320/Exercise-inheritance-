import java.util.Scanner;
public class Main{
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {


        Shape shape1 = new Shape();
        Shape shape2 = new Shape("Black",true);
        Shape shape3 = new Shape();
        shape3.setColor(null);
        shape3.setFilled(false);

        System.out.println("Shape1:");
        System.out.println(shape1.toString());
        System.out.println(shape1.getColor());
        System.out.println(shape1.isFilled());
        System.out.println("Shape2:");
        System.out.println(shape2.toString());
        System.out.println(shape2.getColor());
        System.out.println(shape2.isFilled());
        System.out.println("Shape3:");
        System.out.println(shape3.toString());
        System.out.println(shape3.getColor());
        System.out.println(shape3.isFilled());

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3.5);
        Circle circle3 = new Circle("red",true,5.0);
        Circle circle4 = new Circle();
        Circle circle5 = new Circle();

        circle4.setColor("White");
        circle4.setFilled(true);
        circle4.setRadius(9.0);
        circle5.setRadius(8.0);

        System.out.println("Circle1:");
        System.out.println(circle1.toString());
        System.out.println(circle1.getColor());
        System.out.println(circle1.getRadius());
        System.out.println(circle1.isFilled());
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println("Circle2:");
        System.out.println(circle2.toString());
        System.out.println(circle2.getColor());
        System.out.println(circle2.getRadius());
        System.out.println(circle2.isFilled());
        System.out.println(circle2.getArea());
        System.out.println(circle2.getPerimeter());
        System.out.println("Circle3:");
        System.out.println(circle3.toString());
        System.out.println(circle3.getColor());
        System.out.println(circle3.getRadius());
        System.out.println(circle3.isFilled());
        System.out.println(circle3.getArea());
        System.out.println(circle3.getPerimeter());
        System.out.println("Circle4:");
        System.out.println(circle4.toString());
        System.out.println(circle4.getColor());
        System.out.println(circle4.getRadius());
        System.out.println(circle4.isFilled());
        System.out.println(circle4.getArea());
        System.out.println(circle4.getPerimeter());
        System.out.println("Circle5:");
        System.out.println(circle5.toString());
        System.out.println(circle5.getColor());
        System.out.println(circle5.getRadius());
        System.out.println(circle5.isFilled());
        System.out.println(circle5.getArea());
        System.out.println(circle5.getPerimeter());


        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(3.0,6.0);
        Rectangle rectangle3 = new Rectangle("blue",true,4.0,8.0);
        Rectangle rectangle4 = new Rectangle();
        rectangle4.setColor(null);
        rectangle4.setFilled(false);
        rectangle4.setLength(5);
        rectangle4.setWidth(10);

        System.out.println("Rectangle1:");
        System.out.println(rectangle1.toString());
        System.out.println(rectangle1.getColor());
        System.out.println(rectangle1.isFilled());
        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
        System.out.println("Rectangle2:");
        System.out.println(rectangle2.toString());
        System.out.println(rectangle2.getColor());
        System.out.println(rectangle2.isFilled());
        System.out.println(rectangle2.getWidth());
        System.out.println(rectangle2.getLength());
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getPerimeter());
        System.out.println("Rectangle3:");
        System.out.println(rectangle3.toString());
        System.out.println(rectangle3.getColor());
        System.out.println(rectangle3.isFilled());
        System.out.println(rectangle3.getWidth());
        System.out.println(rectangle3.getLength());
        System.out.println(rectangle3.getArea());
        System.out.println(rectangle3.getPerimeter());
        System.out.println("Rectangle4:");
        System.out.println(rectangle4.toString());
        System.out.println(rectangle4.getColor());
        System.out.println(rectangle4.isFilled());
        System.out.println(rectangle4.getWidth());
        System.out.println(rectangle4.getLength());
        System.out.println(rectangle4.getArea());
        System.out.println(rectangle4.getPerimeter());

        Square square1 = new Square();
        Square square2 = new Square(6.0);
        Square square3 = new Square("pink",true,7.0);
        Square square4 = new Square();
        square4.setColor("orange");
        square4.setFilled(true);
        square4.setSide(12.0);

        System.out.println("Square1:");
        System.out.println(square1.toString());
        System.out.println(square1.getColor());
        System.out.println(square1.isFilled());
        System.out.println(square1.getSide());
        System.out.println("Square2:");
        System.out.println(square2.toString());
        System.out.println(square2.getColor());
        System.out.println(square2.isFilled());
        System.out.println(square2.getSide());
        System.out.println("Square3:");
        System.out.println(square3.toString());
        System.out.println(square3.getColor());
        System.out.println(square3.isFilled());
        System.out.println(square3.getSide());
        System.out.println("Square4:");
        System.out.println(square4.toString());
        System.out.println(square4.getColor());
        System.out.println(square4.isFilled());
        System.out.println(square4.getSide());
    }
}