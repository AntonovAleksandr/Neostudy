package singleton;

public class Logger {
    private static Logger instance;

    private Logger() {
    }

    public static synchronized Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }

    public String log(Object o){
        System.out.println("log info: " + o.getClass().getName());
        return "log info: " + o.getClass().getName();
    }
}
