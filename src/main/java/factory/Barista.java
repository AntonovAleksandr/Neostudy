package factory;

import factory.entity.Coffee;
import factory.entity.CoffeeType;

public class Barista {
    private String name;

    public Barista(String name) {
        this.name = name;
    }

    private void speechBeforeAll(CoffeeType coffee){
        System.out.println("Hey, buddy! I`m " + name + "! Expect your excellent " + coffee.toString().toLowerCase() + " to be ready soon!");
    }

    private void speechBefore(Coffee coffee){
        System.out.println("I`m making " + coffee.getClass().getSimpleName() + " for you!");
    }

    private void speechAfter(Coffee coffee){
        System.out.println("Enjoy your " + coffee.getClass().getSimpleName() + "!");
    }
    public Coffee making(CoffeeType coffeeType){
        speechBeforeAll(coffeeType);
        Coffee coffee = CoffeeFactory.getInstance().getCoffee(coffeeType);
        speechBefore(coffee);
        speechAfter(coffee);
        System.out.println(coffee.smell());
        System.out.println(coffee.taste());
        return coffee;
    }
}
