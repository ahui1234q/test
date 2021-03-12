package LambdaTeach;

import entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 转换功能，内部就是Function接口。惰性求值
 *
 * 将student对象转换为String对象，获取student的名字。
 */
public class LambdaMap {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(3);
        students.add(new Student("路飞", 22, 175));
        students.add(new Student("红发", 40, 180));
        students.add(new Student("白胡子", 50, 185));
        //System.out.println(students);
        List<String> names = students.stream().map(stu -> stu.getName()).collect(Collectors.toList());
        System.out.println(names);
        //年龄和身高都可以

    }
}
