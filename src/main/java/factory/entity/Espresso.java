package factory.entity;

public class Espresso extends Coffee implements Smellable{
    private double saltAmount;

    public double getSaltAmount() {
        return saltAmount;
    }

    public void setSaltAmount(double saltAmount) {
        this.saltAmount = saltAmount;
    }

    @Override
    public String smell() {

        return super.smell() + " The smell of espresso enveloped the coffee shop.";
    }

    @Override
    public String taste() {
        return super.taste() + " Espresso cheered you up, but unfortunately the mug is already empty.";
    }
}
