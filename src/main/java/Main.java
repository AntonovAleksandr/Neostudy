import adapter.CardReader;
import adapter.Computer;
import adapter.impl.CDCard;
import adapter.impl.USB;
import factory.Barista;
import factory.entity.CoffeeType;
import proxy.DBConnectorProxy;
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
        Computer computer = new Computer();
        USB usb = new USB();
        CDCard card = new CDCard();
        CardReader cardReader = new CardReader(card);
        System.out.println(computer.connect(usb));
        System.out.println(computer.connect(cardReader));

        System.out.println("----------------------------");
        DBConnectorProxy db = new DBConnectorProxy("base", "localhost:3634", "admin", "Pa$$w0rD");
        System.out.println(db.create("User"));
        System.out.println(db.update("User"));
        System.out.println(db.read("User"));
        System.out.println(db.remove("User"));
    }
}
