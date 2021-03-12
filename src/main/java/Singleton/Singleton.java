package Singleton;

public class Singleton {//饿汉式
    private static Singleton s = new Singleton();


    public static Singleton getInstance(){
        return s;
    }
}
