package _07_abstract_class_va_interface.thuc_hanh.animal_intreface_edible.animal;

import _07_abstract_class_va_interface.thuc_hanh.animal_intreface_edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return null;
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
