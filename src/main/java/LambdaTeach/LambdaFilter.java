package LambdaTeach;

import entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 顾名思义，起过滤筛选的作用。内部就是Predicate接口。惰性求值。
 */
public class LambdaFilter {
    public static void main(String[] args) {
        //需求：筛选出出身高小于180的同学。
        List<Student> students = new ArrayList<>(3);
        students.add(new Student("路飞", 22, 175));
        students.add(new Student("娜美", 23, 165));
        students.add(new Student("红发", 40, 180));
        students.add(new Student("白胡子", 50, 185));

        List<Student> list = students.stream().filter(sut -> sut.getCm() < 180).collect(Collectors.toList());
        System.out.println(list);



    }
}
