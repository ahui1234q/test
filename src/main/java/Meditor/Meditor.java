package Meditor;

/**
 * 中介者接口
 */
public interface Meditor {
    void register(String dName,Department d);
    void command(String dName);
}
