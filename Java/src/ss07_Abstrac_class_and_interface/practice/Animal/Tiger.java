package ss07_Abstrac_class_and_interface.practice.Animal;

public class Tiger extends Animal implements Edible{

    @Override
    public String makeSound() {
        return "Tiger: meo meo ";
    }

    @Override
    public String howToEat() {
        return "bone enconcentrating";
    }
}
