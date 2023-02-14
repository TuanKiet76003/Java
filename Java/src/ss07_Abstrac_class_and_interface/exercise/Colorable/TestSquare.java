package ss07_Abstrac_class_and_interface.exercise.Colorable;

public class TestSquare {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[2];
        shapes [0] = new Square( "red",true,3.5);
        shapes [1] = new Rectangle("black",true , 2.1 , 5.2);
        for ( Shape shape : shapes ){
            System.out.println(shape);
            if (shape instanceof IColorable){
                ((IColorable) shape ).howToColor();
            }
        }
    }
}
