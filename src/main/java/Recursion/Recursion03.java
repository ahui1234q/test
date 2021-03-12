package Recursion;

public class Recursion03 {
    public static void main(String[] args) {
        a();
    }
    static int count=0;
    static void a(){
        count++;
        if(count<10){
            System.out.println("a");
            a();
        }
    }
    static void b(){
        System.out.println("b");
    }
}
