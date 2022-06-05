import singleton.Logger;

public class Main {
    public static void main(String[] args) {
        Logger.getInstance().log("");
        Logger.getInstance().log(1L);
        Logger.getInstance().log(1.1);


    }
}
