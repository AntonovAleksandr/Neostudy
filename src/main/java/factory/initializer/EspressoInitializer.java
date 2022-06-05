package factory.initializer;

import factory.entity.Americano;
import factory.entity.Coffee;
import factory.entity.Espresso;

import java.math.BigDecimal;

public class EspressoInitializer implements CoffeeInitializer{
    @Override
    public Coffee getCoffee() {
        Espresso espresso = new Espresso();
        espresso.setSaltAmount(3);
        espresso.setId(espresso.hashCode());
        espresso.setCoast(BigDecimal.valueOf(120));
        espresso.setCoffeeAmount(50);
        espresso.setSugarAmount(20);
        espresso.setTotalVolume(50);
        return espresso;
    }
}
