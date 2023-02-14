package ss07_Abstrac_class_and_interface.exercise.Resizeable;

public class TestResizeable {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
        shapes [0] = new Circle(4.3);
        shapes[1] = new Rectangle(5.0,8.0);
        shapes [2] = new Square(5.0);
        System.out.println("Khích thước mảng : ");
        for (Shape shape : shapes ){
            System.out.println(shape);
        }
        double num = Math.random()*101;

        ((Circle)shapes[0]).resize(num);
        ((Rectangle)shapes[1]).resize(num);
        ((Square)shapes[2]).resize(num);

        System.out.println("Kich thuoc moi: ");
        for (Shape shape: shapes) {
            System.out.println(shape);
        }
    }
}
