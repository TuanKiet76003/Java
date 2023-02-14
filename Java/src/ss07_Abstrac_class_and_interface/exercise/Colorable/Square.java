package ss07_Abstrac_class_and_interface.exercise.Colorable;

public class Square extends Shape implements IColorable{

    @Override
    public String howToColor() {
        return null;
    }

    private double edge;
    public Square(){}

    public Square(String color, boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
    public double getArea(){
        return edge * edge;
    }
    public double getPerimeter(){
        return edge * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "Area =" + getArea() +
                '}';
    }
}
