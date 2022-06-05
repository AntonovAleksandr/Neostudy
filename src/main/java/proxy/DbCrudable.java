package proxy;

public interface DbCrudable {
    String create(String tableName);
    String update(String tableName);
    String remove(String tableName);
    String read(String tableName);
}
