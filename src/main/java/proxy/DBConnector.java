package proxy;

public class DBConnector implements DbCrudable {

    @Override
    public String create(String tableName) {
        return "create table " + tableName;

    }

    @Override
    public String update(String tableName) {
        return "update from " + tableName;
    }

    @Override
    public String remove(String tableName) {
        return "delete from " + tableName;
    }

    @Override
    public String read(String tableName) {
        return "select from " + tableName;
    }
}
