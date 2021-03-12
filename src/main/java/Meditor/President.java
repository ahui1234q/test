package Meditor;

import java.util.HashMap;

public class President implements Meditor {

    private HashMap<String,Department> map = new HashMap<>();

    @Override
    public void register(String dName, Department d) {
        map.put(dName,d);
    }

    @Override
    public void command(String dName) {
        map.get(dName).selfAction();
    }
}
