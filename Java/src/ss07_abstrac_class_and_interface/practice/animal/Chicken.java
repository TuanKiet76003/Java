package ss07_abstrac_class_and_interface.practice.animal;

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
