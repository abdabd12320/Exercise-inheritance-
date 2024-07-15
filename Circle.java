public class Circle extends Shape{

    private double radius = 1.0;

    public Circle()
    {
        this("green",true,1.0);
    }

    public Circle(double radius) {
        this("green",true,radius);
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return radius*radius*3.14;
    }

    public double getPerimeter()
    {
        return radius*3.14*2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}
