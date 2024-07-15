public class Square extends Rectangle{

    public Square() {
        this("green",true,1.0);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square(double side) {
        this("green", true, side);
    }

    public void setSide(double side)
    {
        super.setLength(side);
    }
    public double getSide()
    {
        return super.getLength() * 4;
    }

    @Override
    public String toString() {
        return "Square{"+ "side=" + getSide() + "} " + super.toString();
    }
}
