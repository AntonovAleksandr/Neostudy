package factory;

import factory.entity.Coffee;
import factory.entity.CoffeeType;
import factory.initializer.AmericanoInitializer;
import factory.initializer.CoffeeInitializer;
import factory.initializer.EspressoInitializer;

import java.util.HashMap;
import java.util.Map;

public class CoffeeFactory {
    private static CoffeeFactory instance;
    private static Map<CoffeeType, CoffeeInitializer> coffeeInitializerMap;
    private CoffeeFactory() {
        coffeeInitializerMap = new HashMap<>();
        coffeeInitializerMap.put(CoffeeType.AMERICANO, new AmericanoInitializer());
        coffeeInitializerMap.put(CoffeeType.ESPRESSO, new EspressoInitializer());
    }

    public static synchronized CoffeeFactory getInstance() {
        if (instance == null) instance = new CoffeeFactory();
        return instance;
    }


    public Coffee getCoffee(CoffeeType coffeeType){
        return coffeeInitializerMap.get(coffeeType).getCoffee();
    }
}
