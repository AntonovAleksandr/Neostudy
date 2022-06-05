import factory.Barista;
import factory.entity.CoffeeType;
import singleton.Logger;

public class Main {
    public static void main(String[] args) {
        Logger.getInstance().log("");
        Logger.getInstance().log(1L);
        Logger.getInstance().log(1.1);
        System.out.println("----------------------------");
        Barista barista = new Barista("Bob");
        barista.making(CoffeeType.ESPRESSO);
        barista.making(CoffeeType.AMERICANO);
        System.out.println("----------------------------");



    }
}
