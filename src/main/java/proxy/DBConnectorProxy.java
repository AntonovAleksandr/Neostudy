package proxy;

public class DBConnectorProxy implements DbCrudable {
    private String dbName;
    private String dbURL;
    private String login;
    private String password;
    private DBConnector dbConnector;

    public DBConnectorProxy(String dbName, String dbURL, String login, String password) {
        dbConnector = new DBConnector();
        this.dbName = dbName;
        this.dbURL = dbURL;
        this.login = login;
        this.password = password;
        connect();
    }

    private void connect() {
        System.out.println("connect by url " + dbURL + "/" + dbName + " with login: "+ login + " and password: " + password);
    }

    @Override
    public String create(String tableName) {
        return dbConnector.create(dbURL + "/" + dbName + "." + tableName);

    }

    @Override
    public String update(String tableName) {
        return dbConnector.update(dbURL + "/" + dbName + "." + tableName);
    }

    @Override
    public String remove(String tableName) {
        return dbConnector.remove(dbURL + "/" + dbName + "." + tableName);
    }

    @Override
    public String read(String tableName) {
        return dbConnector.read(dbURL + "/" + dbName + "." + tableName);
    }
}
