package LambdaTeach;

import entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 统计功能，一般都是结合filter使用，因为先筛选出我们需要的再统计即可。及早求值
 */
public class LambdaCount {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(3);
        students.add(new Student("路飞", 22, 175));
        students.add(new Student("红发", 40, 180));
        students.add(new Student("白胡子", 50, 185));

        long count = students.stream().filter(s1 -> s1.getId() < 30).count();
        System.out.println("ID小于30的人数是：" + count);

        /**
         * reduce 操作可以实现从一组值中生成一个值。
         * 下面例子中用到的 count 、 min 和 max 方 法，因为常用而被纳入标准库中。
         * 事实上，这些方法都是 reduce 操作。及早求值。
         */
        Integer reduce = Stream.of(1, 2, 3, 4).reduce(2, (acc, x) -> acc+ x);
        System.out.println(reduce);
    }
}
