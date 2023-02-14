package ss07_Abstrac_class_and_interface.exercise.Resizeable;

public class Square extends Shape implements Resizeable{
    private double edge ;
    public Square(){}

    public Square(double edge) {
        this.edge = edge;
    }

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
        return "A Rectangle with width="
                + getEdge()
                + " , which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {

    }
}
