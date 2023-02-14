package ss07_Abstrac_class_and_interface.practice.Animal;

public class Chicken  extends Animal implements Edible{

    @Override
    public String makeSound() {
        return "Chicken : cục tác ";
    }

    @Override
    public String howToEat() {
        return " could be fried ";
    }
}
