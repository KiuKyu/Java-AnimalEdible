package com.b1;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: ggez nobo!";
    }

    @Override
    public String howToEat() {
        return "Fried";
    }
}
