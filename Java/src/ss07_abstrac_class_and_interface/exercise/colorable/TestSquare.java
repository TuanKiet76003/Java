package ss07_abstrac_class_and_interface.exercise.colorable;

public class TestSquare {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[2];
        shapes [0] = new Square( "red",true,5.0);
        shapes [1] = new Rectangle("black",true , 2.1 , 5.2);
        for ( Shape shape : shapes ){
            System.out.println(shape);
            if (shape instanceof IColorable){
                ((IColorable) shape ).howToColor();
            }
        }
    }
}
