package Singleton;

public class client {
    public static void main(String[] args) {
        Singleton s2 = new Singleton();
        Singleton s =  Singleton.getInstance();

        Singleton s1 = Singleton.getInstance();

        System.out.println(s==s1);
    }
}
