package factory.entity;


import java.math.BigDecimal;

public abstract class Coffee implements Smellable{
    protected int id;
    protected double totalVolume;
    protected double sugarAmount;
    protected double coffeeAmount;
    protected BigDecimal coast;

    @Override
    public String smell(){
        return "Damn it, it smells great!";
    }

    public String taste(){
        return "Damn it! It's delicious!";
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(double totalVolume) {
        this.totalVolume = totalVolume;
    }

    public double getSugarAmount() {
        return sugarAmount;
    }

    public void setSugarAmount(double sugarAmount) {
        this.sugarAmount = sugarAmount;
    }

    public double getCoffeeAmount() {
        return coffeeAmount;
    }

    public void setCoffeeAmount(double coffeeAmount) {
        this.coffeeAmount = coffeeAmount;
    }

    public BigDecimal getCoast() {
        return coast;
    }

    public void setCoast(BigDecimal coast) {
        this.coast = coast;
    }
}
