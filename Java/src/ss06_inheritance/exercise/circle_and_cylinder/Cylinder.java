package ss06_inheritance.exercise.circle_and_cylinder;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(double height , double radius , String color){
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "weight= " + height + " " +
                "radius " + getRadius() + " " +
                "color " + getColor() +
                 '}';
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5,3.5,"red");
        System.out.println(cylinder);
    }
}
