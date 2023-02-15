package ss06_inheritance.exercise.circle_and_cylinder;

public class Circle {
    private double radius ;
    private String color ;
    public Circle(){}
    public Circle(double radius ,String color ){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5,"red");
        System.out.println(circle);
    }
}
