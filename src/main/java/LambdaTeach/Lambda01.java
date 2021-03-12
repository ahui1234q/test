package LambdaTeach;

import entity.Student;

import java.util.function.*;

public class Lambda01 {
    public static void main(String[] args) {

        //01
        Predicate<Integer> predicate = y -> y > 185;
        Student student = new Student("辉哥", 28, 175);
        System.out.println("辉哥的身高高于185吗？" + predicate.test(student.getCm()));

        //02
        Consumer<String> consumer = System.out::println;
        consumer.accept("命运由我不由天");

        //03
        Function<Student, String> function = Student::getName;
        String name = function.apply(student);
        System.out.println(name);

        //04
        BinaryOperator<Integer> operator = (x, y) -> x * y;
        Integer integer = operator.apply(2, 3);
        System.out.println(integer);



    }

}
