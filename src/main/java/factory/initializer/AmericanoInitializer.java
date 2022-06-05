package factory.initializer;

import factory.entity.Americano;
import factory.entity.Coffee;

import java.math.BigDecimal;

public class AmericanoInitializer implements CoffeeInitializer{

    @Override
    public Coffee getCoffee() {
        Americano americano = new Americano();
        americano.setVoterVolume(200);
        americano.setId(americano.hashCode());
        americano.setCoast(BigDecimal.valueOf(120));
        americano.setCoffeeAmount(50);
        americano.setSugarAmount(20);
        americano.setTotalVolume(250);
        return americano;
    }
}
