package ss05_Access_modifier.exercise.accessModifire;

public class AccessModifire {
    public static final double PI = 3.14 ;
    private static double radius = 2.0 ;
    private static String color = new String("red") ;
    AccessModifire(){
    }
    AccessModifire(double radius){
        this.radius = radius;
    }

    public static double getRadius() {
        return radius;
    }

    public static void setRadius(double radius) {
        AccessModifire.radius = radius;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        AccessModifire.color = color;
    }

    public static double getArea(){
        double area = PI * radius * radius;
        return area;
    }
    public static void setArea(){
        double area = PI * radius * radius;
    }
}
