
public class Student {
    int id ;
    String name ;
    int age;
    Computer computer;

    void play(){
        System.out.println("我在玩游戏");
    }
    void study(){
        System.out.println("我在使用"+computer.brand+"学习");
    }

    public static void main(String[] args) {

        Student stu = new Student();
        System.out.println(stu);
        stu.id = 9527;
        stu.name = "路飞";
        stu.age = 17;

        Computer c1 = new Computer();
        c1.brand = "联想";
        stu.computer = c1;
        stu.play();
        stu.study();
    }
}
class Computer{
    String brand;
}