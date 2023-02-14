package ss07_Abstrac_class_and_interface.exercise.Colorable;

public class Rectangle extends Shape implements IColorable {
    private double width ;
    private double length;
    public Rectangle(){}

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public double getArea(){
        return width * this.length;
    }
    public double getPerimeter(){
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Area =" + getArea() +
                '}';
    }

    @Override
    public String howToColor() {
        return null;
    }
}
