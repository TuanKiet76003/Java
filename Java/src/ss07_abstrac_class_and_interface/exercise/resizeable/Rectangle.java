package ss07_abstrac_class_and_interface.exercise.resizeable;

public class Rectangle extends Shape implements Resizeable{
    private double length;
    private double wide;
    public Rectangle(){}

    public Rectangle(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }

    public Rectangle(String color, boolean filled, double length, double wide) {
        super(color, filled);
        this.length = length;
        this.wide = wide;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }
    public double getArea(){
        return wide * this.length;
    }
    public double getPerimeter(){
        return 2* (wide + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWide()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {

    }
}
