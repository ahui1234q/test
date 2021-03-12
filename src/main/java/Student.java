public class Student {
    int id ;
    String name ;
    int age;
    Computer computer;

    void play(){
        System.out.println("我在玩"+computer.brand+"电脑");
    }
    void study(){
        System.out.println("我在学习，学习使我快乐！");
    }
    public static void main(String[] args) {
        Student stu = new Student();
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