package factory.entity;

public class Americano extends Coffee implements Smellable{
    private double voterVolume;

    public double getVoterVolume() {
        return voterVolume;
    }

    public void setVoterVolume(double voterVolume) {
        this.voterVolume = voterVolume;
    }

    @Override
    public String smell() {
        return super.smell() + " You have felt the great smell of Americano.";
    }

    @Override
    public String taste() {
        return super.taste() + " Do you feel like you're starting to wake up.";
    }
}
